package actividad03.main;

import java.io.IOException;

import actividad03.introduceDatos.pregunta;
import actividad03.operaciones.OperacionesLinkia;
import actividad03.operaciones.Valores;
import introduceDatos.*;

public class Ejercicio02 {
	public static void main(String[] args) throws IOException {
		int opElegida = 100;
		do {
			do {
				System.out.println("Oye amigo qué quieres hacer? 1-4");
				//pregunta.pideEntero();
				opElegida = pregunta.pideEntero();
				//System.out.print(opElegida); //debug
				System.out.println("1- Pasar dinero a LinkiaCoins.");
				System.out.println("2- Muestra valores de Pi.");
				System.out.println("3- Muestra el valor absoluto de un valor.");
				System.out.println("4- Muestra un valor aleatorio con el rango elegido.");
			}while(opElegida < 0 || opElegida > 12);
			if(opElegida == 1) {
				OperacionesLinkia.convertirLinkiaCoins();
			}
			if(opElegida == 2) {
				Valores.muestraPi();
			}
			if(opElegida == 3) {
				Valores.muestraValorAbsoluto();
			}
			if(opElegida == 4) {
				Valores.muestraValorAleatorio();
			}
			//System.out.println("XD"); //debug
		}while(opElegida != 0);
	}
}
