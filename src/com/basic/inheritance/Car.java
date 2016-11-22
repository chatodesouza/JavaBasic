package com.basic.inheritance;

public class Car extends EngineRoadVehicle {
	
	private String name;
	
	private int wheelNumber;
	private int doorCount;
	
	public Car(String name, int wheelNumber, int doorCount) {
		System.out.println(name + " aracýna hoþgeldiniz...");
		this.name = name;
		this.wheelNumber = wheelNumber;
		this.doorCount = doorCount;
	}
	
	@Override
	public int getWheelNumber() {
		return wheelNumber;
	}

	@Override
	public void start() {
		System.out.println(name + " yürüyor.");
	}

	@Override
	public void stop() {
		System.out.println(name + " duruyor.");
	}

	@Override
	public void gearUp() {
		super.gearUp();
		System.out.println("Kol aracýlýðýyla");
	}
	
	public int getDoorCount() {
		return doorCount;
	}

}
