package com.oms.service;

import java.util.ArrayList;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.oms.bean.Core;
import com.oms.bean.NormalBike;
import com.oms.db.ICoreDatabase;
import com.oms.db.JsonCoreDatabase;

@Path("/bikes")
public class BikeService {

	private ICoreDatabase bikeDatabase;

	public BikeService() {
		bikeDatabase = JsonCoreDatabase.singleton();
	}

	@GET
	@Path("")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Core> getStations(@QueryParam("id") String id, @QueryParam("name") String name, @QueryParam("address") String address) {
        NormalBike bike = new NormalBike(id, name);
		ArrayList<Core> res = bikeDatabase.searchCore(bike);
		return res;
	}

	@POST
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Core updateStation(@PathParam("id") String id, NormalBike normalBike) {
		return bikeDatabase.updateCore(normalBike);
	}
}