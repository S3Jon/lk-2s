package actividad03.operaciones;

import actividad03.introduceDatos.pregunta; 

public class Valores {
	public static void muestraPi() { //imprime los valores de Pi
		double numPi = Math.PI;
		System.out.println("Valores de Pi: "+numPi);
	}
	
	public static void muestraValorAbsoluto() { //pide al usuario un numero e imprime su valor absoluto
		double a = 0;
		double b = 0;
		System.out.print("Introduce un numero para calcular valor absoluto: ");
		a = pregunta.pideDouble();
		b = Math.abs(a);
		System.out.println("El valor absoluto de "+a+" es: "+b);
	}
	
	public static void muestraValorAleatorio() { //piede al usuario un valor e imprime un numero entre 0 y el numero introducido
		int a = 0;
		double b = 0;
		System.out.print("Introduce un numero para sacar un aleatorio: ");
		a = pregunta.pideEntero();
		b = Math.random() * a;
		System.out.println("Valor aleatorio entre 0 y "+a+": "+b);
	}
}
