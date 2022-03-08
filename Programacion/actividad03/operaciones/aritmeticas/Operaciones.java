package actividad03.operaciones.aritmeticas;

public class Operaciones {
	
	public static double muestraLogaritmo(double logVal) { //imprime el logaritmo neperiano del numero introducido
		double a = 0;
		a = Math.log(logVal);
		System.out.println("El logaritmo neperiano de "+logVal+" es: "+a);
		return 0;
	}
	
	public static double calculaPotencia(double Val1, double Val2) { //imprime el total de elevar el valor 2 al 1
		double a = 0;
		a = Math.pow(Val1, Val2);
		System.out.println(Val1+" elevado a "+Val2+" es igual a: "+a);
		return 0;
	}

}
