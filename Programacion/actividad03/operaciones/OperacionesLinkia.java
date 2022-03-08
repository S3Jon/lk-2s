package actividad03.operaciones;

import actividad03.introduceDatos.pregunta;

public class OperacionesLinkia {
	public static void convertirLinkiaCoins() {
		System.out.print("Cuantos leuros quieres meter?: ");
		double n = 0; 
		double m = 0;
		n = pregunta.pideDouble();
		m = n * 1.5;
		System.out.println(n+" leuros equivalen a "+m+" LinkiaCoins");
	}

}
