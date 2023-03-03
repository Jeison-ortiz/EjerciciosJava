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
	
	public String getName() {
		return name;
	}
}
