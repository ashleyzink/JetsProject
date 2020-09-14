package com.skilldistillery.jet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JetsApplication {
	Airfield airfield;

	public static void main(String[] args) {

		JetsApplication jetsApp = new JetsApplication();

		jetsApp.launch();

//		userMenu();`

	}

	private void displayUserMenu(Scanner input) {
		boolean keepGoing = true;
		while (keepGoing) {
			System.out.println("*~*~*~*~*  Fun with Flying  *~*~*~*~*");
			System.out.println("\nPlease type the corresponding number from the menu below "
					+ "\n      for the information you'd like to access");
			System.out.println("\n1.)List of Current Fleet");
			System.out.println("2.)Fly Jets to See What They Can Do!");
			System.out.println("3.)Check Out the Fastest Aircraft's Info");
			System.out.println("4.)Which Aircraft Has the Longest Range?");
			System.out.println("5.)Load Up!");
			System.out.println("6.)Dogfight!");
			System.out.println("7.)What's This Button Do????");
			System.out.println("8.)BYOJet");
			System.out.println("9.)Taken Down");
			System.out.println("10.)Exit Program");
			System.out.println("\n *~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
			int menuSelection = input.nextInt();
			switch (menuSelection) {

			case 1:
				listFleet();
				break;
			case 2:
				System.out.printf("------- Prepare for Takeoff!! -------\n\n");
				takeOff();
				break;
			case 3:
				System.out.printf("------- This Craft Will Get You There Fast! -------\n\n");
				fastestCraft();
				break;
			case 4:
				System.out.printf("---- This Craft Will Take You Where You Want to Go! ----\n\n");
				longestRange();
				break;
			case 5:
				loadUp();
				break;
			case 6:
				dogFight();
				break;
			case 7:
				worthTheRisk();
				break;
			case 8:
				addJet(input);
				break;
			case 9:
				removeJet(input);
				break;
			case 10:
				System.out.println("You are the weakest link, Goodbye!!");
				keepGoing = false;

			default:
				break;
			}
		}

	}

	private void removeJet(Scanner input) {
		System.out.println("Which jet number would you like to remove? ");
		listFleet();
		int removalSelection = input.nextInt();
		airfield.removeJet(removalSelection);
	}

	private void addJet(Scanner input) {
		System.out.println("What model jet do you have?");
		input.nextLine();
		String model = input.nextLine();
		System.out.println("How fast can your jet go?");
		double speed = input.nextDouble();
		input.nextLine();
		System.out.println("How far does your jet go before needing to refuel?");
		int range = input.nextInt();
		System.out.println("How much does your jet cost?");
		long price = input.nextLong();
		
		Jet userJet = new PassengerPlane(model, speed, range, price);
		airfield.addjet(userJet);
	}

	private void worthTheRisk() {

		List<Jet> jetList = airfield.getJets();
		for (Jet jet : jetList) {
			if (jet instanceof KeepGuessing) {
				((KeepGuessing) jet).frackWithHumans();
			}

		}
	}

	private void dogFight() {

		List<Jet> jetList = airfield.getJets();
		for (Jet jet : jetList) {
			if (jet instanceof CombatReady) {
				((CombatReady) jet).fight();
			}

		}
	}

	private void loadUp() {
		List<Jet> jetList = airfield.getJets();
		for (Jet jet : jetList) {
			if (jet instanceof CargoCapable) {
				((CargoCapable) jet).loadCargo();
			}

		}

	}

	private void longestRange() {
		double farthestFlyer = 0;
		List<Jet> jetList = airfield.getJets();
		Jet jet = null;
		for (int i = 0; i < jetList.size(); i++) {
			if (jetList != null) {
				if (jetList.get(i).getRange() > farthestFlyer) {
					farthestFlyer = jetList.get(i).getRange();
					jet = jetList.get(i);
				}
			}
		}
		System.out.println(jet);
	}

	private void fastestCraft() {
		double fastestFlyer = 0;
		List<Jet> jetList = airfield.getJets();
		Jet jet = null;
		for (int i = 0; i < jetList.size(); i++) {
			if (jetList != null) {
				if (jetList.get(i).getSpeed() > fastestFlyer) {
					fastestFlyer = jetList.get(i).getSpeed();
					jet = jetList.get(i);
				}
			}
		}
		System.out.println(jet);
	}

	private void takeOff() {
		for (Jet jet : airfield.getJets()) {
			jet.fly();
			System.out.println();
		}
	}

	private void listFleet() {
		for (int i = 0; i < airfield.getJets().size(); i++) {
			System.out.println("" + i + " "+ airfield.getJets().get(i));
			
		}
//		for (Jet jet : airfield.getJets()) {
//			System.out.println(jet);
//
//		}

	}

	private void launch() {
		airfield = new Airfield();
		Scanner input = new Scanner(System.in);
		displayUserMenu(input);

	}

}
