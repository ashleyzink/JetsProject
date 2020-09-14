package com.skilldistillery.jet;

public class PassengerPlane extends Jet {

	public PassengerPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	public void fly() {
		System.out.println("Please remain seated as we are about to hit some turbulance");

	}

}
