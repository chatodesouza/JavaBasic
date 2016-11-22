package com.basic.inheritance;

public abstract class EngineRoadVehicle extends RoadVehicle implements EngineVehicle {

	@Override
	public void execute() {
		System.out.println("Motor çalýþtýrýlýyor.");
	}
	
	@Override
	public void terminate() {
		System.out.println("Motor durduruluyor.");
	}
	
}
