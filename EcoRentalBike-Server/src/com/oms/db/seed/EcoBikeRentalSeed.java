package com.oms.db.seed;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.oms.bean.Core;

public class EcoBikeRentalSeed {
	private ArrayList<Core> cores;
	
	private static EcoBikeRentalSeed singleton = new EcoBikeRentalSeed();
	
	private EcoBikeRentalSeed() {
		start();
	}
	
	public static EcoBikeRentalSeed singleton() {
		return singleton;
	}
	
	private void start() {
		cores = new ArrayList<Core>();
		cores.addAll(generateDataFromFile( new File(getClass().getResource("./stations.json").getPath()).toString()));

		cores.addAll(generateDataFromFile( new File(getClass().getResource("./normal_bikes.json").getPath()).toString()));

		cores.addAll(generateDataFromFile( new File(getClass().getResource("./ebikes.json").getPath()).toString()));

		cores.addAll(generateDataFromFile( new File(getClass().getResource("./twin_bikes.json").getPath()).toString()));
	}
	
	private ArrayList<? extends Core> generateDataFromFile(String filePath){
		ArrayList<? extends Core> res = new ArrayList<Core>();
		ObjectMapper mapper = new ObjectMapper();
		
		String json = FileReader.read(filePath);
		try {
			mapper.setDateFormat(new SimpleDateFormat("dd/MM/yyyy"));
			res = mapper.readValue(json, new TypeReference<ArrayList<Core>>() { });
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Invalid JSON input data from " + filePath);
		}
		
		return res;
	}

	public ArrayList<Core> getCores() {
		return cores;
	}

	public static void main(String[] args) {
		EcoBikeRentalSeed seed = new EcoBikeRentalSeed();
		seed.start();
	}
}
