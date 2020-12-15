package com.oms.bean;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("core")
@JsonSubTypes({ @Type(value = Station.class, name = "station"), @Type(value = Bike.class, name =  "bike")})
public class Core {
    private String id;
    private String name;

    public Core() {
        super();
    }

    public Core(String id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "id: " + this.id + ", core name: " + this.name;
    }

    public boolean match(Core core) {
		if (core == null)
			return true;
		
		if (core.id != null && !core.id.equals("") && !this.id.contains(core.id)) {
			return false;
        }
        
		if (core.name != null && !core.name.equals("") && !this.name.contains(core.name)) {
			return false;
        }
        return true;
    }
    
    @Override
    public boolean equals(Object object) {
        if(object instanceof Core) {
            return this.id.equals(((Core) object).id);
        }
        return false;
    }
}
