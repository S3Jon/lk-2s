package actividad03.introduceDatos;
import java.util.Scanner;
public class pregunta {
	
	public static int pideEntero() { //pide un int al usuario
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		//sc.close();
		return (n);
	}
	
	public static double pideDouble() { //pide un double al usuario
		Scanner sc=new Scanner(System.in); //puedo llamarles igual a los dos scanneres porque existen dentro de diferentes fnc
		double m = sc.nextDouble(); 
		//sc.close();
		return (m);
	}
}
