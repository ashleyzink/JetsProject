package com.skilldistillery.jet;

public class ExtraterrestrialSpacecraft extends Jet {

	public ExtraterrestrialSpacecraft(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		model = "Flying Saucer";
		speed = 4000;
		range = 35040000;
		price = 58_000_000;
	}

	public void fly() {
		System.out.println("Model: " + getModel() + "\nMax Speed: " + getSpeed() + " mph" + "\nRange: " + getRange()
				+ " miles" + "\nCost: " + getPrice()
				+ "\nA Flying Saucer can fly for one year before refueling if not utilizing "
				+ "the wormhole feature built in on the newer models");

	}
}
