package actividad03.operaciones;

import Java.lang.math;
import actividad03.introduceDatos.pregunta;

public class Valores {
	public static void muestraPi() {
		double numPi = Math.PI;
		System.out.println("Valores de Pi: "+numPi);
	}
	
	public static void muestraValorAbsoluto() {
		double a = 0;
		double b = 0;
		System.out.println("Introduce un numero para calcular valor absoluto: ");
		a = pregunta.pideDouble();
		b = Math.abs(a);
		System.out.println("El valor absoluto de "+a+" es: "+b);
	}
	
	public static void muestraValorAleatorio() {
		int a = 0;
		double b = 0;
		System.out.println("Introduce un numero para sacar un aleatorio: ");
		a = pregunta.pideEntero();
		b = Math.random() * a;
		System.out.println("Valor aleatorio entre 0 y "+a+": "+b);
	}
}
