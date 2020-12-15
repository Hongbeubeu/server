package com.oms.bean;

import java.util.Date;

public class TwinBike extends Bike {
    public TwinBike() {
        super();
    }

    public TwinBike(String id, String name) {
        super(id, name);
    }

    public TwinBike(String id, String name, float weight, String licensePlate, Date manufacturingDate, String producer, float cost) {
        super(id, name, weight, licensePlate, manufacturingDate,producer, cost);
    }

    @Override
    public boolean match(Core core) {
        if (core == null)
            return true;

        boolean res = super.match(core);
        if(!res)
            return false;
        
        if(!(core instanceof TwinBike))
            return false;
        
        return true;
    }

}