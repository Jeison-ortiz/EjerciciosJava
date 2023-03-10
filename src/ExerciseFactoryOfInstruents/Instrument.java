package ExerciseFactoryOfInstruents;

public class Instrument {
	
	private String id;
	private Double precio;
	private TypeOfInstrument type;
	
	public Instrument(String id, Double precio, TypeOfInstrument type) {
		this.id = id;
		this.precio = precio;
		this.type = type;
	}
	
	public TypeOfInstrument getType() {
		return type;
	}

	public void setType(TypeOfInstrument type) {
		this.type = type;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Instrument [id=" + id + ", precio=" + precio + ", type=" + type + "]";
	}
	
}
