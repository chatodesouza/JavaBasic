package com.basic.inheritance;

public class Car extends EngineRoadVehicle {
	
	private String name;
	
	private int wheelNumber;
	private int doorCount;
	
	public Car(String name, int wheelNumber, int doorCount) {
		System.out.println(name + " arac�na ho�geldiniz...");
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
		System.out.println(name + " y�r�yor.");
	}

	@Override
	public void stop() {
		System.out.println(name + " duruyor.");
	}

	@Override
	public void gearUp() {
		super.gearUp();
		System.out.println("Kol arac�l���yla");
	}
	
	public int getDoorCount() {
		return doorCount;
	}

}
