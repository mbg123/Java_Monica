package indra.talentCamp.generics;

public interface Operacion<T> {
	//si o si debe haber un solo metodo porque es una interfaz funcional
	T operar(T a, T v);
}
