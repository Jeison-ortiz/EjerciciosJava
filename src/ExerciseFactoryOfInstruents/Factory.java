package ExerciseFactoryOfInstruents;

import java.util.ArrayList;

public class Factory {

	private String name;
	private ArrayList<Branch> branchs = new ArrayList();
	
	public Factory(Branch branch) {
		this.branchs = new ArrayList<>();
				
	}
	public void addBranch(Branch branch) {
		branchs.add(branch);
		
	}
}
