package com.basic.inheritance;

public class InheritanceExample {
	
	public static void main(String[] args) {
		
		EngineRoadVehicle car = new Car("BMW", 4, 5);
		car.execute();
		car.start();
		
		car.gearUp();
		
		car.gearDown();
		car.stop();
		car.terminate();
	}

}
