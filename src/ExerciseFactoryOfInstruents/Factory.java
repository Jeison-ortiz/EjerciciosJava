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
	
}
