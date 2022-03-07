package actividad03.introduceDatos;
import java.util.Scanner;
public class pregunta {
	
	public static int pideEntero() {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		return (n);
	}
	
	public static double pideDouble() {
		Scanner sc=new Scanner(System.in);
		int m = sc.nextDouble();
		sc.close();
		return (m);
	}
}
