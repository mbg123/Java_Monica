package indra.talentCamp.relaciones;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import indra.talentCamp.relaciones.composite.*;
import org.mozilla.javascript.*;

public class Programa {

	public static void main(String[] args) {
		
		Operacion calculo = new Suma(
			new Valor(2),
			new Multiplicacion(new Valor(2), new Valor(3))
		);
		
		System.out.println("Calcular 2 + 2 * 3 = " + calculo.calcular());
		
		Operacion calculo2 = new Suma(
				new Multiplicacion(new Valor(6), new Valor(5)),
				new Multiplicacion(new Valor(3), new Valor(8))
		);
		System.out.println("Calcular 6 * 5 + 3 * 8 = " + calculo2.calcular());
		
		/*Operacion calculo3 = new Suma(
			new Valor(5),
			new Suma(
				new Multiplicacion(new Valor(3), new Valor(8)),
				new Multiplicacion(new Valor(4), new Valor(3))
			)
		);*/
		Operacion calculo3 = new Suma(
				5,
				new Suma(
					new Multiplicacion(3, 8),
					new Multiplicacion(4, 3)
				)
			);
		System.out.println("Calcular 5 + 3 * 8 + 4 * 3 = " + calculo3.calcular());
		
		
		String expresion = "5+3*8+4*3";
		/*ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("js");
		
		try {
			var result = engine.eval(expresion);
			System.out.println("El resultado es " + result);
		} catch(Exception ex) {
			System.out.println("Error al ejecutar la expresion " + expresion + ex.getMessage());
		}
		*/
		
		
		Context jsContext = Context.enter();
		try {
			var res = jsContext.evaluateString(jsContext.initSafeStandardObjects(), 
					expresion, 
					"Calculo",
					1, null);
			
			System.out.println("El resultado es ");
			System.out.println(expresion + "=" + res);
			
		} finally {
			Context.exit();
		}
		
		
	}

}
