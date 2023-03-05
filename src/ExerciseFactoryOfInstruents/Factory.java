package ExerciseFactoryOfInstruents;

import java.util.ArrayList;

public class Factory {

	private String name;

	private ArrayList<Branch> branchs = new ArrayList<Branch>();
	
	public Factory(Branch branch) {
		this.branchs = new ArrayList<>();			
	}
	
	public Factory() {
		
	}
	public void addBranch(Branch branch) {
		branchs.add(branch);	
	}
	
	public void listInstrumentsOfFactory() {
		for (Branch branch : branchs) {
			System.out.println("Branch: " + branch.getName());
			branch.listInstruments();
		}
	}
	
	public void listInstrumentsForType(ArrayList<Instrument> instruments) {
		for (Instrument instrument : instruments) {
			System.out.println(instrument);
		}
	}
	
	public ArrayList<Instrument> getInstrumentsOfFactoryForType(TypeOfInstrument type) {
		ArrayList<Instrument> instrumentsOfFactoryForType = new ArrayList<Instrument>();
		ArrayList<Instrument> instrumentsForBranch = new ArrayList<Instrument>();
		for (Branch branch : branchs) {
			instrumentsForBranch = branch.getInstruments();
			for (Instrument instrument : instrumentsForBranch) {
				if(instrument.getType() == type) {
					instrumentsOfFactoryForType.add(instrument);					
				}
			}
		}		
		return instrumentsOfFactoryForType;
	}
	
	public Instrument deleteInstrument(String id) {
		Instrument instrumentDelete = null;
		int i = 0;
		while(i< branchs.size() && instrumentDelete == null) {
			instrumentDelete = branchs.get(i).deleteInstrument(id);
			i++;
		}
		return instrumentDelete;
	}
	
	public double[] percentageInstrumentForType(String nameBranch) {
		double[] percentages = null;
		Branch branchFined = findBranch(nameBranch);
		if(branchFined != null) {
			percentages = branchFined.percentageInstrumentForType();
		}
		return percentages;
	}
	
	private Branch findBranch(String nameBranch) {
		Branch branchFined = null;
		int i = 0;
		while(i < branchs.size() && !this.branchs.get(i).getName().equals(nameBranch)){
			i++;	
		}

		if(i < this.branchs.size()) {
			branchFined = this.branchs.get(i);
		}
		return branchFined;
	}
}
