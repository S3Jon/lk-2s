package actividad03.main;

import java.io.IOException;

import actividad03.introduceDatos.pregunta;
import actividad03.operaciones.OperacionesLinkia;
import actividad03.operaciones.Valores;
import actividad03.operaciones.aritmeticas.Operaciones;
import actividad03.operaciones.geometricas.*; // WIP
import introduceDatos.*;

public class Ejercicio02 {
	public static void main(String[] args) throws IOException {
		int opElegida = 100;
		do {
			do {
				imprimirMenu();
				opElegida = pregunta.pideEntero();
			}while(opElegida < 0 || opElegida > 12);
			if(opElegida == 1) {
				OperacionesLinkia.convertirLinkiaCoins();
			}
			if(opElegida == 2) 
				Valores.muestraPi();
			if(opElegida == 3) 
				Valores.muestraValorAbsoluto();
			if(opElegida == 4) 
				Valores.muestraValorAleatorio();
			if(opElegida == 5) {
				double a = 0;
				double b = 0;
				System.out.print("Introduce un valor para calcular el logaritmo en base e: ");
				a = pregunta.pideDouble();
				b = Operaciones.muestraLogaritmo(a);
			}
			if(opElegida == 6) {
				double a = 0;
				double b = 0;
				System.out.print("Introduce el primer valor: ");
				a = pregunta.pideDouble();
				System.out.print("Introduce el segundo valor: ");
				b = pregunta.pideDouble();
				Operaciones.calculaPotencia(a, b);
			}
			if(opElegida == 7)
				actividad03.operaciones.geometricas.Operaciones.muestraSeno();
			if(opElegida == 8)
				actividad03.operaciones.geometricas.Operaciones.muestraCoseno();
		}while(opElegida != 0);
	}
	
	public static void imprimirMenu() {
		System.out.println("1- Pasar dinero a LinkiaCoins.");
		System.out.println("2- Muestra valores de Pi.");
		System.out.println("3- Muestra el valor absoluto de un valor.");
		System.out.println("4- Muestra un valor aleatorio con el rango elegido.");
		System.out.println("5- Calcular el logaritmo neperiano de un número");
		System.out.println("6- Calcular un valor elevado a otro.");
		System.out.println("7- Calcular el seno de un numero.");
		System.out.println("8- Calcular el coseno de un numero.");
		System.out.println("0- Salir.");
		System.out.print("¿Qué quieres hacer?: ");
	}
}