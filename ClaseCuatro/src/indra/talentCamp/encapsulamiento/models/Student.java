package indra.talentCamp.encapsulamiento.models;

public class Student extends Person{
	//private String name;
	//private int document;
	//private String address;
	private boolean preferenceFront;
	
	public Student(String name, int document, String address) {
		super(name, document, address);
		//this.name = name;
		//this.document = document;
		//this.address = address;
		this.preferenceFront = false;
	}
	
	public Student(String name, int document, String address, boolean preferenceFront) {
		super(name, document, address);
		//this.name = name;
		//this.document = document;
		//this.address = address;
		this.preferenceFront = preferenceFront;
	}

	//Ahora está en el padre
	/*public String getName() { //readonly
		return this.name;
	}*/
	
	//Comento el setter para convertir el normbre en readonly
	/*public void setName(String name) {
		this.name = name;
	}*/

	//Ahora esta en el padre
	/*public int getDocument() {
		return document;
	}*/

	//Comento el setter para convertir el documento en readonly
	/*public void setDocument(int document) {
		this.document = document;
	}*/
	
	//Ahora esta en el padre
	/*
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}*/

	public boolean getPreferenceFront() {
		return preferenceFront;
	}

	public void setPreferenceFront(boolean preferenceFront) {
		this.preferenceFront = preferenceFront;
	}

	@Override
	public String toString() {
		
		//return this.getName() + "( Documento: " + this.getDocument() + ")" + "\n" + "[" + this.getAddress() + "]" + "\n" + (this.preferenceFront ? "Frontend" : "Backend");
		return String.format("%s (%d) \n[%s]\n%s", 
				this.getName(),
				this.getDocument(),
				this.getAddress(),
				(this.preferenceFront ? "Frontend" : "Backend")
				);
	}
}
