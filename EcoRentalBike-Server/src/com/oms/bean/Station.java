package com.oms.bean;

import java.util.ArrayList;

public class Station extends Core {
    private String address;
    private int numberOfBikes;
    private int numberOfEBikes;
    private int numberOfTwinBikes;
    private int numberOfEmptyDocks;
    private ArrayList<String> listBikes = new ArrayList<>();
    private ArrayList<String> listEBikes = new ArrayList<>();
    private ArrayList<String> listTwinBikes = new ArrayList<>();

    public Station() {
        super();
    }

    public Station(String id, String name, String address) {
        super(id, name);
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfBikes() {
        return this.numberOfBikes;
    }

    public void setNumberOfBikes(int numberOfBikes) {
        this.numberOfBikes = numberOfBikes;
    }

    public int getNumberOfEBikes() {
        return this.numberOfEBikes;
    }

    public void setNumberOfEBikes(int numberOfEBikes) {
        this.numberOfEBikes = numberOfEBikes;
    }

    public int getNumberOfTwinBikes() {
        return this.numberOfTwinBikes;
    }

    public void setNumberOfTwinBikes(int numberOfTwinBikes) {
        this.numberOfTwinBikes = numberOfTwinBikes;
    }

    public int getNumberOfEmptyDocks() {
        return this.numberOfEmptyDocks;
    }

    public void setNumberOfEmptyDocks(int numberOfEmptyDocks) {
        this.numberOfEmptyDocks = numberOfEmptyDocks;
    }

    public ArrayList<String> getListBikes() {
        return this.listBikes;
    }

    public void setListBikes(ArrayList<String> listBikes) {
        this.listBikes = listBikes;
    }

    public ArrayList<String> getlistEBikes() {
        return this.listEBikes;
    }

    public void setlistEBikes(ArrayList<String> listEBikes) {
        this.listEBikes = listEBikes;
    }

    public ArrayList<String> getListTwinBikes() {
        return this.listTwinBikes;
    }

    public void setListTwinBikes(ArrayList<String> listTwinBikes) {
        this.listTwinBikes = listTwinBikes;
    }

    @Override
    public String toString() {
        return "address: " + this.address;
    }
    
    @Override
    public boolean match(Core core) {
        if (core == null)
            return true;

        boolean res = super.match(core);
        if (!res)
            return false;

        if (!(core instanceof Station))
            return false;

        Station station = (Station) core;

        if (station.address != null && !station.address.equals("") && !this.address.contains(station.address)) {
            return false;
        }
        return true;
    }
}
