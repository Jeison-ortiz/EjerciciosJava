package ExerciseFactoryOfInstruents;

public class Instrument {
	
	private String id;
	private Double precio;
	private TypeOfInstrument type;
	
	@Override
	public String toString() {
		return "Instrument [id=" + id + ", precio=" + precio + ", type=" + type + "]";
	}
	
}
