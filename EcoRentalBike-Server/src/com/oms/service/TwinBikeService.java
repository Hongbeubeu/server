package com.oms.service;

import java.util.ArrayList;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.oms.bean.Core;
import com.oms.bean.TwinBike;
import com.oms.db.ICoreDatabase;
import com.oms.db.JsonCoreDatabase;

@Path("/tbikes")
public class TwinBikeService {

	private ICoreDatabase bikeDatabase;

	public TwinBikeService() {
		bikeDatabase = JsonCoreDatabase.singleton();
	}

	@GET
	@Path("")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Core> getStations(@QueryParam("id") String id, @QueryParam("name") String name, @QueryParam("address") String address) {
        TwinBike tbike = new TwinBike(id, name);
		ArrayList<Core> res = bikeDatabase.searchCore(tbike);
		return res;
	}

	@POST
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Core updateStation(@PathParam("id") String id, TwinBike twinBike) {
		return bikeDatabase.updateCore(twinBike);
	}
}