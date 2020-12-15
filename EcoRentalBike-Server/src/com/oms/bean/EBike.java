package com.oms.bean;
import java.util.Date;

public class EBike extends Bike{
    private float batteryPercentage;
    private int loadCycles;
    private int estimatedUsageTimeRemaining;

    public EBike() {
        super();
    }

    public EBike(String id, String name) {
        super(id, name);
    }

    public EBike(String id, String name, float weight, String licensePlate, Date manufacturingDate, String producer, float cost, float batteryPercentage, int loadCycles, int estimatedUsageTimeRemaining) {
        super(id, name, weight, licensePlate, manufacturingDate,producer, cost);
        this.batteryPercentage = batteryPercentage;
        this.loadCycles = loadCycles;
        this.estimatedUsageTimeRemaining = estimatedUsageTimeRemaining;
    }


    public float getBatteryPercentage() {
        return this.batteryPercentage;
    }

    public void setBatteryPercentage(float batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }

    public int getLoadCycles() {
        return this.loadCycles;
    }

    public void setLoadCycles(int loadCycles) {
        this.loadCycles = loadCycles;
    }

    public int getEstimatedUsageTimeRemaining() {
        return this.estimatedUsageTimeRemaining;
    }

    public void setEstimatedUsageTimeRemaining(int estimatedUsageTimeRemaining) {
        this.estimatedUsageTimeRemaining = estimatedUsageTimeRemaining;
    }

    @Override
    public String toString() {
        return super.toString() + ", battery percentage: " + this.batteryPercentage + ", load cycles: " + this.loadCycles + ", estimated usage time remaining: " + this.estimatedUsageTimeRemaining;
    }

    @Override
    public boolean match(Core core) {
        if (core == null)
            return true;
        
        boolean res = super.match(core);
        if (!res)
            return false;
         
        if(!(core instanceof EBike))
            return false;
        return true;
    }
}
