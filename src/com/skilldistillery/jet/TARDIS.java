package com.skilldistillery.jet;

public class TARDIS extends Jet {

	public TARDIS(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		model = "T.A.R.D.I.S.";
		speed = 41040;
		range = Integer.MAX_VALUE;
		price = 2_080_324_616;
	}

	public void fly() {
		System.out.println("Model: " + getModel() + "\nMax Speed: " + getSpeed() + " mph" + "\nRange: " + getRange()
				+ " miles" + "\nCost: " + getPrice()
				+ "\nT.A.R.D.I.S runs on a special type of energy and doesn't have to refuel. It has an infinate travel range.");

	}

}
