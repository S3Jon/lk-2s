package actividad03.operaciones;

import actividad03.introduceDatos.pregunta;

public class OperacionesLinkia {
	public static void convertirLinkiaCoins() { //pasa los euros introducidos a LinkiaCoins
		System.out.print("¿Cuantos euros quieres convertir a LinkiaCoin?: ");
		double n = 0; 
		double m = 0;
		n = pregunta.pideDouble();
		m = n * 1.5;
		System.out.println(n+" euros equivalen a "+m+" LinkiaCoins");
	}

}
