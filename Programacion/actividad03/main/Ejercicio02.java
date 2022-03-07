package actividad03.main;

import java.io.IOException;

import actividad03.introduceDatos.pregunta;
import actividad03.operaciones.OperacionesLinkia;
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
			}while(opElegida < 0 || opElegida > 4);
			if(opElegida == 1) {
				OperacionesLinkia.convertirLinkiaCoins();
			}
			//System.out.println("XD"); //debug
		}while(opElegida != 0);
	}
}
