
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo");
		int iNum = 4;
		System.out.println("Cantidad de textos "+ iNum);
		double fNum = 8.9999;
		System.out.println(fNum);
		
		@SuppressWarnings("removal")
		Integer num = new Integer(4);
		System.out.println(num);
		
		fNum = iNum;
		
		String enLetras = Integer.toString(iNum);
		
		System.out.println("El numero en letras es " + enLetras);
		System.out.printf("El numero en letras es %s", enLetras);
		System.out.println();
		System.out.printf("El numero en letras es %d ", iNum).println();;
		System.out.println();
		
		enLetras = "22";
		iNum = Integer.parseInt(enLetras);
		System.out.println("Ahora esta en numeros " + iNum);
		
		try{
			enLetras = "22dos";
			iNum = Integer.parseInt(enLetras);
		} catch(Exception ex) { //Tambien puede ser tipo NumberFormatException
			System.out.println("No se ha podido hacer la conversion " + enLetras);
		}
		
		String textNumber = "33.4h";
		
		try {
			float convert = Float.parseFloat(textNumber);			
			System.out.println("Se convirtió a " + convert);
		} catch (Exception ex) {
			System.out.println("No se pudo convertir a float " + textNumber);
		}
		
		
	}

}
