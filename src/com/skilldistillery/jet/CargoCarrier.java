package com.skilldistillery.jet;

public class CargoCarrier extends Jet {

	public CargoCarrier(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		model = "C-5 Galaxy";
		speed = 579; // in MPH
		range = 4800; // in miles. With a 120,000lb load
		price = 167_700_000;

	}

	public void fly() {
		System.out.println("Model: " + getModel() + "\nMax Speed: " + getSpeed() + " mph" + "\nRange: " + getRange()
				+ " miles" + "\nCost: " + getPrice()
				+ "\nA Galaxy can be up in the air with a small load for apx. 8 hours");
	}

	public double getSpeedInMach() {
		double machSpeed = 0.79;
		return machSpeed;

	}

}
