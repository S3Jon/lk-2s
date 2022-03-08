package actividad03.operaciones.aritmeticas;

public class Operaciones {
	
	public static double muestraLogaritmo(double logVal) {
		double a = 0;
		a = Math.log(logVal);
		System.out.println("El logaritmo neperiano de "+logVal+" es: "+a);
		return 0;
	}
	
	public static double calculaPotencia(double Val1, double Val2) {
		double a = 0;
		a = Math.pow(Val1, Val2);
		System.out.println(Val1+" elevado a "+Val2+" es igual a: "+a);
		return 0;
	}

}
