package actividad03.main;

import java.io.IOException;

import actividad03.introduceDatos.pregunta;
import introduceDatos.*;

public class Ejercicio02 {
	public static void main(String[] args) throws IOException {
		int opElegida = 100;
		do {
			do {
				System.out.println("Oye amigo qué quieres hacer? 1-4");
				//pregunta.pideEntero();
				opElegida = pregunta.pideEntero();
				System.out.print(opElegida);
			}while(opElegida < 0 || opElegida > 4);
			System.out.println("XD");
		}while(opElegida != 0);
	}
}
