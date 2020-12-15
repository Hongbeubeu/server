package com.oms.service;

import java.util.ArrayList;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.oms.bean.Core;
import com.oms.bean.EBike;
import com.oms.db.ICoreDatabase;
import com.oms.db.JsonCoreDatabase;

@Path("/ebikes")
public class EBikeService {

	private ICoreDatabase eBikeDatabase;

	public EBikeService() {
		eBikeDatabase = JsonCoreDatabase.singleton();
	}

	@GET
	@Path("")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Core> getStations(@QueryParam("id") String id, @QueryParam("name") String name, @QueryParam("address") String address) {
        EBike ebike = new EBike(id, name);
		ArrayList<Core> res = eBikeDatabase.searchCore(ebike);
		return res;
	}

	@POST
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Core updateStation(@PathParam("id") String id, EBike eBike) {
		return eBikeDatabase.updateCore(eBike);
	}
}