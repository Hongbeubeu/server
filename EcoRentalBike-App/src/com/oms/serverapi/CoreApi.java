package com.oms.serverapi;

import java.util.ArrayList;
import java.util.Map;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.oms.bean.Bike;
import com.oms.bean.Station;
import com.oms.bean.EBike;
import com.oms.bean.TwinBike;

public class CoreApi {
	
	public static final String PATH = "http://localhost:8081/";
		
	private Client client;
	
	public CoreApi() {
		client = ClientBuilder.newClient();
	}
	
	public ArrayList<Bike> getBikes(Map<String, String> queryParams) {
		WebTarget webTarget = client.target(PATH).path("bikes");
		
		
		if (queryParams != null) {
			for (String key : queryParams.keySet()) {
				String value = queryParams.get(key);
				webTarget = webTarget.queryParam(key, value);
			}
		}
		

		Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
		Response response = invocationBuilder.get();
		ArrayList<Bike> res = response.readEntity(new GenericType<ArrayList<Bike>>() {});
		System.out.println(res);
		return res;
	}
	
	public Bike updateBikes(Bike bike) {
		WebTarget webTarget = client.target(PATH).path("bikes").path(bike.getId());
		
		Invocation.Builder invocationBuilder =  webTarget.request(MediaType.APPLICATION_JSON);
		Response response = invocationBuilder.post(Entity.entity(bike, MediaType.APPLICATION_JSON));
		
		Bike res = response.readEntity(Bike.class);
		return res;
	}
	
	public Bike createBike(Bike bike) {
		WebTarget webTarget = client.target(PATH).path("bikes");
		
		Invocation.Builder invocationBuilder =  webTarget.request(MediaType.APPLICATION_JSON);
		Response response = invocationBuilder.post(Entity.entity(bike, MediaType.APPLICATION_JSON));
		
		Bike res = response.readEntity(Bike.class);
		return res;
	}
	
	public ArrayList<TwinBike> getTwinBikes(Map<String, String> queryParams) {
		WebTarget webTarget = client.target(PATH).path("tbikes");
		
		
		if (queryParams != null) {
			for (String key : queryParams.keySet()) {
				String value = queryParams.get(key);
				webTarget = webTarget.queryParam(key, value);
			}
		}
		

		Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
		Response response = invocationBuilder.get();
		ArrayList<TwinBike> res = response.readEntity(new GenericType<ArrayList<TwinBike>>() {});
		System.out.println(res);
		return res;
	}
	
	public TwinBike updateTwinBikes(TwinBike twinbike) {
		WebTarget webTarget = client.target(PATH).path("twinbikes").path(twinbike.getId());
		
		Invocation.Builder invocationBuilder =  webTarget.request(MediaType.APPLICATION_JSON);
		Response response = invocationBuilder.post(Entity.entity(twinbike, MediaType.APPLICATION_JSON));
		
		TwinBike res = response.readEntity(TwinBike.class);
		return res;
	}
	
	public TwinBike createTwinBike(TwinBike tbike) {
		WebTarget webTarget = client.target(PATH).path("twinbikes");
		
		Invocation.Builder invocationBuilder =  webTarget.request(MediaType.APPLICATION_JSON);
		Response response = invocationBuilder.post(Entity.entity(tbike, MediaType.APPLICATION_JSON));
		
		TwinBike res = response.readEntity(TwinBike.class);
		return res;
	}
	
	public ArrayList<EBike> getEBikes(Map<String, String> queryParams) {
		WebTarget webTarget = client.target(PATH).path("ebikes");
		
		
		if (queryParams != null) {
			for (String key : queryParams.keySet()) {
				String value = queryParams.get(key);
				webTarget = webTarget.queryParam(key, value);
			}
		}
		

		Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
		Response response = invocationBuilder.get();
		ArrayList<EBike> res = response.readEntity(new GenericType<ArrayList<EBike>>() {});
		System.out.println(res);
		return res;
	}
	
	public EBike updateEBikes(EBike ebike) {
		WebTarget webTarget = client.target(PATH).path("ebikes").path(ebike.getId());
		
		Invocation.Builder invocationBuilder =  webTarget.request(MediaType.APPLICATION_JSON);
		Response response = invocationBuilder.post(Entity.entity(ebike, MediaType.APPLICATION_JSON));
		
		EBike res = response.readEntity(EBike.class);
		return res;
	}
	
	public EBike createEBike(EBike ebike) {
		WebTarget webTarget = client.target(PATH).path("ebikes");
		
		Invocation.Builder invocationBuilder =  webTarget.request(MediaType.APPLICATION_JSON);
		Response response = invocationBuilder.post(Entity.entity(ebike, MediaType.APPLICATION_JSON));
		
		EBike res = response.readEntity(EBike.class);
		return res;
	}
	
	public ArrayList<Station> getStations(Map<String, String> queryParams) {
		WebTarget webTarget = client.target(PATH).path("stations");
		
		
		if (queryParams != null) {
			for (String key : queryParams.keySet()) {
				String value = queryParams.get(key);
				webTarget = webTarget.queryParam(key, value);
			}
		}
		

		Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
		Response response = invocationBuilder.get();
		ArrayList<Station> res = response.readEntity(new GenericType<ArrayList<Station>>() {});
		System.out.println(res);
		return res;
	}
	
	public Station updateStations(Station station) {
		WebTarget webTarget = client.target(PATH).path("stations").path(station.getId());
		
		Invocation.Builder invocationBuilder =  webTarget.request(MediaType.APPLICATION_JSON);
		Response response = invocationBuilder.post(Entity.entity(station, MediaType.APPLICATION_JSON));
		
		Station res = response.readEntity(Station.class);
		return res;
	}
	
	public Station createStation(Station station) {
		WebTarget webTarget = client.target(PATH).path("stations");
		
		Invocation.Builder invocationBuilder =  webTarget.request(MediaType.APPLICATION_JSON);
		Response response = invocationBuilder.post(Entity.entity(station, MediaType.APPLICATION_JSON));
		
		Station res = response.readEntity(Station.class);
		return res;
	}
}
