package com.idm.parking;

import java.util.ArrayList;
import java.util.List;

public class Parking {
	
	private final List<Slot> slots; 
	
	public Parking(int n){
		slots = new ArrayList<Slot>(n);
	}

	public void park(Car car, int i){
		if(slots.get(i)!=null){
		    throw new java.lang.IllegalStateException() ;
		}else{		    
			Slot slot = new Slot(car,i);
			slots.add(slot);
		}
	}
	
	public Car unpark(int i) throws InstantiationException{
		Car car;
		if(slots.get(i)==null){
		    throw new java.lang.InstantiationException();
		}else{	
			car = slots.get(i).getCar();
			slots.remove(i);
		}
		return car;
	}
	
	
}
