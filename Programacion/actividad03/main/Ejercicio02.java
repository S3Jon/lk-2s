package actividad03.main;

import java.io.IOException;

import actividad03.introduceDatos.pregunta;
import actividad03.operaciones.OperacionesLinkia;
import actividad03.operaciones.Valores;
import actividad03.operaciones.aritmeticas.Operaciones;
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
				System.out.println("El logaritmo en base e de "+a+" es: "+b);
			}
		}while(opElegida != 0);
	}
	
	public static void imprimirMenu() {
		System.out.println("1- Pasar dinero a LinkiaCoins.");
		System.out.println("2- Muestra valores de Pi.");
		System.out.println("3- Muestra el valor absoluto de un valor.");
		System.out.println("4- Muestra un valor aleatorio con el rango elegido.");
		System.out.println("5- Calcular el logaritmo neperiano de un número");
		System.out.println("0- Salir.");
		System.out.print("¿Qué quieres hacer?: ");
	}
}
