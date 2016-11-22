package com.basic.inheritance;

public abstract class RoadVehicle implements Vehicle {
	
	public abstract int getWheelNumber();

	public void gearUp() {
		System.out.println("Vites y�kseltiliyor.");
	}
	
	public void gearDown() {
		System.out.println("Vites d���r�l�yor.");
	}
}
