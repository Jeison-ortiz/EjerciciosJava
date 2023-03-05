package ExerciseFactoryOfInstruents;

import java.util.ArrayList;

public class MainFactory {

	public static void main(String[] args) {
		
		Factory factory = new Factory();
		loadFactory(factory);
//		factory.listInstrumentsOfFactory();
		double[] percentageForTypefactory = factory.percentageInstrumentForType("sucursal 1");
		for(int i=0; i<percentageForTypefactory.length;i++) {
			System.out.println(percentageForTypefactory[i]);
		}
	}
	
	private static void loadFactory(Factory factory) {
		Branch branch1 = new Branch("sucursal 1");
		Branch branch2 = new Branch("sucursal 2");
		
		branch1.addInstruent(new Instrument("A",13214D, TypeOfInstrument.ROPE));
		branch1.addInstruent(new Instrument("AB",132145D, TypeOfInstrument.WIND));
		branch1.addInstruent(new Instrument("ABC",132146D, TypeOfInstrument.ROPE));
		branch1.addInstruent(new Instrument("ABCD",132147D, TypeOfInstrument.PERCUSSION));
		branch1.addInstruent(new Instrument("ABCDE",132148D, TypeOfInstrument.ROPE));
		branch1.addInstruent(new Instrument("ABCDEF",132149D, TypeOfInstrument.PERCUSSION));
		
		branch2.addInstruent(new Instrument("a", 1D, TypeOfInstrument.ROPE));
		branch2.addInstruent(new Instrument("ab",15D, TypeOfInstrument.WIND));
		branch2.addInstruent(new Instrument("abc",13D, TypeOfInstrument.ROPE));
		branch2.addInstruent(new Instrument("abvd",21D, TypeOfInstrument.PERCUSSION));
		branch2.addInstruent(new Instrument("abcde",18D, TypeOfInstrument.ROPE));
		branch2.addInstruent(new Instrument("abcdef",132D, TypeOfInstrument.PERCUSSION));
		
	
		factory.addBranch(branch1);
		factory.addBranch(branch2);
//		factory.deleteInstrument("A");
//		factory.listInstrumentsForType(factory.getInstrumentsOfFactoryForType(TypeOfInstrument.PERCUSSION));
		
		
	}

}
