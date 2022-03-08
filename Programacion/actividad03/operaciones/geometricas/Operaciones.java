package actividad03.operaciones.geometricas;
import actividad03.introduceDatos.pregunta;
public class Operaciones {
	
	public static void muestraSeno() { //pide al usuario un numero e imprime su seno
		System.out.print("Introduce un numero para calcular el seno: ");
		double a = 0;
		double b = 0;
		a = pregunta.pideDouble();
		b = Math.sin(a);
		System.out.println("El seno de "+a+" es: "+b);
	}
	
	public static void muestraCoseno() { //pide al usuario un numero y muestra su coseno por consola
		System.out.print("Introduce un numero para calcular el coseno: ");
		double a = 0;
		double b = 0;
		a = pregunta.pideDouble();
		b = Math.cos(a);
		System.out.println("El seno de "+a+" es: "+b);
	}
}
