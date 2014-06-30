package com.idm.parking;

public class Slot {
	private Car car;
	private int numero;
	
	public Slot(Car car, int numero){
		this.car = car;
		this.numero = numero;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
