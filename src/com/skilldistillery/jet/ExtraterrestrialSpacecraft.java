package com.skilldistillery.jet;

public class ExtraterrestrialSpacecraft extends Jet implements CargoCapable, CombatReady, KeepGuessing{

	public ExtraterrestrialSpacecraft(String model, double speed, int range, long price) {
		super(model, speed, range, price);
//		model = "Flying Saucer";
//		speed = 4000;
//		range = 35040000;
//		price = 58_000_000;
	}

	public void fly() {
		System.out.println("Model: " + getModel() + "\nMax Speed: " + getSpeed() + " mph" + "\nRange: " + getRange()
				+ " miles" + "\nCost: " + getPrice()
				+ "\nA Flying Saucer can fly for one year before refueling if not utilizing "
				+ "the wormhole feature built in on the newer models.");

	}

	@Override
	public void loadCargo() {
		System.out.println("UFO: We've beamed up the humans. Do we have time for a crop circle? ");
	}

	@Override
	public void fight() {
		System.out.println("UFO: We will destroy the humanz. All your base are belong to us!");
	}

	@Override
	public void frackWithHumans() {
		double random = Math.random();
		if (random < .333) {
			System.out.println("UFO: Let's have fun and make shapes in the sky!");
		}
		else if (random >= .333 && random < .666) {
			System.out.println("UFO: Let's fly close, and let the humans see us!");
		}
		else {
			System.out.println("UFO: Let's leave \"mysterious\" shapes in their food supply!");
		}
		
	}
}
