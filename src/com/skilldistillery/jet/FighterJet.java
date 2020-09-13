package com.skilldistillery.jet;

public class FighterJet extends Jet {

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		model = "F-22 Raptor";
		speed = 1500;
		range = 1800;
		price = 150_000_000;
	}

	public void fly() {
		System.out.println("Model: " + getModel() + "\nMax Speed: " + getSpeed() + " mph" + "\nRange: " + getRange()
		+ " miles" + "\nCost: " + getPrice() + 
		"\nA Raptor can only be up in the air for about an hour, unless it has extra internal fuel tanks");

	}

}
