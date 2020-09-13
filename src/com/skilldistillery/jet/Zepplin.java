package com.skilldistillery.jet;

public class Zepplin extends Jet {

	public Zepplin(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		model = "Zepplin";
		speed = 84;
		range = 1508;  //Found info on a flight that went 12756 miles in 203 hours 
		price = 8_500_000;
		
	}

	public void fly() {System.out.println("Model: " + getModel() + "\nMax Speed: " + getSpeed() + " mph" + "\nRange: " + getRange()
	+ " miles" + "\nCost: " + getPrice()
	+ "\nA Zepplin can be up in the air for apx. 24 hours.");
		
	}
}
