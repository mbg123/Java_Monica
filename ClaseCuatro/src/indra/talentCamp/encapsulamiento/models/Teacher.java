package indra.talentCamp.encapsulamiento.models;

public class Teacher extends Person{
	//private String name;
	//private int document;
	//private String address;
	private String preferedLanguage;
	
	public Teacher(String name, int document, String address) {
		/*this.name = name;
		this.document = document;
		this.address = address;*/
		super(name, document, address);
		this.preferedLanguage = "Java";
	}
	
	public Teacher(String name, int document, String address, String preferedLanguage) {
		super(name, document, address);
		/*this.name = name;
		this.document = document;
		this.address = address;*/
		this.preferedLanguage = preferedLanguage;
	}

	//Ahora esta en person
	/*public String getName() { //readonly
		return this.name;
	}*/
	
	//Comento el setter para convertir el normbre en readonly
	/*public void setName(String name) {
		this.name = name;
	}*/

	//Ahora esta en person
	/*public int getDocument() {
		return document;
	}*/

	//Comento el setter para convertir el documento en readonly
	/*public void setDocument(int document) {
		this.document = document;
	}*/
	
	
	//Ahora esta en person
	/*public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}*/

	public String getPreferenceFront() {
		return preferedLanguage;
	}

	public void setPreferenceFront(String preferedLanguage) {
		this.preferedLanguage = preferedLanguage;
	}

	@Override
	public String toString() {
		
		return this.getName() + "( Documento: " + this.getDocument() + ")" + "\n" + "[" + this.getAddress() + "]" + "\n" + (this.preferedLanguage );
		
	}
}
