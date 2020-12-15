package com.oms.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("bike")
@JsonSubTypes({ @Type(value = NormalBike.class, name = "bike"), @Type(value = TwinBike.class, name =  "twin bike"), @Type(value = EBike.class, name =  "ebike")})
public class Bike extends Core {
    private float weight;
    private String licensePlate;
    private Date manufacturingDate;
    private String producer;
    private float cost;
    
    public Bike() {
        super();
    }

    public Bike(String id, String name) {
        super(id, name);
    }

    public Bike(String id, String name, float weight, String licensePlate, Date manufacturingDate, String producer, float cost) {
        super(id, name);
        this.weight = weight;
        this.licensePlate = licensePlate;
        this.manufacturingDate = manufacturingDate;
        this.producer = producer;
        this.cost = cost;
    }

    public float getWeight() {
        return this.weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getLicensePlate() {
        return this.licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Date getManufacturingDate() {
        return this.manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String getProducer() {
        return this.producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public float getCost() {
        return this.cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", weight: " + this.weight + ", license plate: " + this.licensePlate + ", manufacturing date: " + this.manufacturingDate;
    }

    @Override
    public boolean match(Core core) {
        if(core == null)
            return true;
        
        boolean res = super.match(core);
        if(!res)
            return false;
        
        if(!(core instanceof Bike))
            return false;
        
        Bike bike = (Bike) core;
        
        if (bike.licensePlate != null && !this.licensePlate.equals(bike.licensePlate)) {
            return false;
        }

		if (bike.manufacturingDate != null && !this.manufacturingDate.equals(bike.manufacturingDate)) {
			return false;
        }
        
		if (bike.producer != null && this.producer.equals(bike.producer)) {
			return false;
		}

        return true;
    }
}
