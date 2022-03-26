package actividad04;

import java.io.*;
import java.util.*;

public class Ejercicio01 {
	public static void main(String[] args) throws IOException { //main
		int opElegida = 100;
		System.out.println("Working Directory = " + System.getProperty("user.dir")); //  testeando el user.dir
		File archivos = new File("archivos"); // Nombre carpeta
		archivos.mkdir();					  // crea la carpeta
		do {
			do {
				imprimirMenu();
				opElegida = pideEntero();
			}while(opElegida < 0 || opElegida > 6);
			//opcionElegida(opElegida);
		}while(opElegida != 0);
	}
	
	public static void imprimirMenu() { //imprime menu
		System.out.println("1- Nuevo archivo.");
		System.out.println("2- Listar archivos.");
		System.out.println("3- Muestra un Archivo.");
		System.out.println("4- Borrar un Archivo.");
		System.out.println("5- Renombrar un archivo");
		System.out.println("6- Reemplazar caracteres de un Archivo utilizando RandomAccessFile");
		System.out.println("0- Salir.");
		System.out.print("¿Qué quieres hacer?: ");
	}
	
	public static int pideEntero() { //pide un int al usuario
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		return (n);
	}

	public static void createNewFile() {
		
	}
}