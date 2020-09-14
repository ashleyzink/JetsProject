package com.skilldistillery.jet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Airfield {

	private List<Jet> jetsList;

	Airfield() {
		jetsList = initialJets("jets.txt");
	}

	private List<Jet> initialJets(String fileName) {
		ArrayList<Jet> moreJets = new ArrayList<>();
		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] fields = line.split(",");
				moreJets.add(buildJet(fields));
				System.out.println(line);
			}
		} catch (IOException e) {
			System.err.println(e);
		}
		return moreJets;
	}

	public List<Jet> getJets() {
		return jetsList;
	}

	public Jet buildJet(String[] jetFields) {
		Jet jet;
		switch (jetFields[0]) {

		case "Cargo":
			jet = new CargoCarrier(jetFields[1], Double.parseDouble(jetFields[2]), Integer.parseInt(jetFields[3]),
					Long.parseLong(jetFields[4]));
			break;
		case "Fighter":
			jet = new FighterJet(jetFields[1], Double.parseDouble(jetFields[2]), Integer.parseInt(jetFields[3]),
					Long.parseLong(jetFields[4]));
			break;
		case "UFO":
			jet = new ExtraterrestrialSpacecraft(jetFields[1], Double.parseDouble(jetFields[2]),
					Integer.parseInt(jetFields[3]), Long.parseLong(jetFields[4]));
			break;
		case "TimeMachine":
			jet = new TARDIS(jetFields[1], Double.parseDouble(jetFields[2]), Integer.parseInt(jetFields[3]),
					Long.parseLong(jetFields[4]));
			break;
		case "Blimp":
			jet = new Zepplin(jetFields[1], Double.parseDouble(jetFields[2]), Integer.parseInt(jetFields[3]),
					Long.parseLong(jetFields[4]));
			break;
		default:

			jet = new PassengerPlane(jetFields[1], Double.parseDouble(jetFields[2]), Integer.parseInt(jetFields[3]),
					Long.parseLong(jetFields[4]));
		}
		return jet;
	}

	public void addjet(Jet userJet) {
		jetsList.add(userJet);
	}

	public void removeJet(int removalSelection) {
		jetsList.remove(removalSelection);
	}

}
