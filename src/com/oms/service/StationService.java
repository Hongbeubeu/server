package com.oms.service;

import java.util.ArrayList;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.oms.bean.Core;
import com.oms.bean.Station;
import com.oms.db.ICoreDatabase;
import com.oms.db.JsonCoreDatabase;

@Path("/stations")
public class StationService {

	private ICoreDatabase stationDatabase;

	public StationService() {
		stationDatabase = JsonCoreDatabase.singleton();
	}

	@GET
	@Path("")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Core> getStations(@QueryParam("id") String id, @QueryParam("name") String name, @QueryParam("address") String address) {
		Station station = new Station(id, name, address);
		ArrayList<Core> res = stationDatabase.searchCore(station);
		return res;
	}

	@POST
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Core updateStation(@PathParam("id") String id, Station station) {
		return stationDatabase.updateCore(station);
	}
}