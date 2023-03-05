package ExerciseFactoryOfInstruents;

import java.util.ArrayList;
import java.util.Iterator;

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

	public Instrument deleteInstrument(String id) {
		Instrument intrumentFined = findInstrumentForId(id);
		this.instruments.remove(intrumentFined);
		return intrumentFined;
	}
	
	private Instrument findInstrumentForId(String id) {
		Instrument instrumentFined = null;
		int i = 0;
		while(i < instruments.size() && !this.instruments.get(i).getId().equals(id)){
			i++;	
		}

		if(i < this.instruments.size()) {
			instrumentFined = this.instruments.get(i);
		}
		return instrumentFined;
	}

	public double[] percentageInstrumentForType() {
		
		final int numberOfInstrumentTypes = TypeOfInstrument.values().length;
		double[] percentages = new double[numberOfInstrumentTypes];
		for (Instrument instrument : instruments) {
			percentages[instrument.getType().ordinal()]++;
		}
		calculePercenyage(percentages);
		return percentages;
	}
	
	public void calculePercenyage(double[] percentages) {
		for(int i = 0; i < percentages.length;i++) {
			percentages[i] = 100*percentages[i]/instruments.size();
		} 
	}
}
