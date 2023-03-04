package ExerciseFactoryOfInstruents;

import java.util.ArrayList;

public class Branch {
	
	private String name;
	private ArrayList<Instrument> instruments = new ArrayList<Instrument>();
	
	public Branch(String name){
		this.name = name;
		this.instruments = new ArrayList<>();
	}
	
	public void listInstruments() {	
		for (Instrument instrument : instruments) {
			System.out.println(instrument);
		}
	}
	
	public void addInstruent(Instrument instrument) {
		this.instruments.add(instrument);
	}
	
	public ArrayList<Instrument> getInstrumentForType(TypeOfInstrument type) {
		ArrayList<Instrument> instrumentsForType = new ArrayList<>();
		for (Instrument instrument : instruments) {
			if (instrument.getType() == type) {
				instrumentsForType.add(instrument);
			}
		}	
		return instrumentsForType;
	}
	
	public ArrayList<Instrument> getInstruments() {
		return instruments;
	}

	public void setInstruments(ArrayList<Instrument> instruments) {
		this.instruments = instruments;
	}
	
	public String getName() {
		return name;
	}
}
