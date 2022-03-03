/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package actividad02;
import java.io.IOException;
import java.util.*;
/**
 *
 * @author J4mes
 */
public class ejercicio02 {

	 public static void main(String[] args) throws IOException {
	        stMenu();
	    }
	 
	 public static void stMenu() throws IOException {
		 int n;
		 String notas[][] = new String[4][4];
		 notas[0][0] = "M01"; notas[1][0] = "M02"; notas[2][0] = "M03"; notas[3][0] = "M04";
		 notas[0][1] = "8"; notas[1][1] = "3"; notas[2][1] = "9"; notas[3][1] = "10";
		 notas[0][2] = "5"; notas[1][2] = "8"; notas[2][2] = "7"; notas[3][2] = "4";
		 notas[0][3] = "10"; notas[1][3] = "9"; notas[2][3] = "6"; notas[3][3] = "9";
		 System.out.println("Los valores del array bidimensional son:");
		 for(int j=0;j<4;j++) {
			 System.out.println(notas[j][0]+" "+notas[j][1]+" "+notas[j][2]+" "+notas[j][3]);
		 }
		 do {
			 Scanner scanner = new Scanner(System.in);
			 do {
				 System.out.print("Indica la opcion del siguiente menu de opciones:\n");
				 System.out.print("1. Mostrar el nombre de las asignaturas.\n");
				 System.out.print("2. Mostrar la puntuacion mayor de cada una de las asignaturas.\n");
				 System.out.print("3. Modificar la puntiacion de una asignatura.\n");
				 System.out.print("4. Mostrar todos los valores del array bidimensional.\n");
				 //System.out.print("5. Mostrar puntuacion menor de cada asignatura.\n");
				 System.out.print("0. Salir\n");
				 n = scanner.nextInt();
			 }while(n < 0 || n > 5);
			 //scanner.close();
			 if(n == 1) {
				 System.out.print("Las asignaturas introducidas son:\n");
				 for(int i = 0;i<4;i++) {
					 System.out.print(notas[i][0]+" ");
				 }
				 System.out.print("\n");
			 }
			 if(n == 2) {
				 for(int a = 0;a<4;a++) {
					int z = 0;
					 for(int b = 1;b<4;b++) {
						 int foo = Integer.parseInt(notas[a][b]);
						 if(z < foo) {
							 z = foo;
						 }
					 }
					 System.out.println("El valor mayor de "+notas[a][0]+" es:"+z);
				 }
				 
			 }
			 if(n == 3) {
				 int z; int v; int y;
				 //Scanner scaner = new Scanner(System.in);
				 do {
					System.out.print("Introduce el numero de asignatura (entre 0 y 3) de la que quieres cambiar el valor:");
				 	z = scanner.nextInt();
				 }while(z > 3 || z < 0);
				 //scaner.close();
				 //Scanner scanerr = new Scanner(System.in);
				 do {
						System.out.print("Introduce el numero de asignatura (entre 1 y 3) de la que quieres cambiar el valor:");
					 	v = scanner.nextInt();
				}while(v > 3 || v < 1);
				//scanerr.close();
				System.out.println("El valor actual en la posicion "+z+", "+v+" es: "+notas[z][v]);
				//Scanner scannerr = new Scanner(System.in);
				System.out.println("Indica el nuevo valor(entre 0 y 10): ");
				y = scanner.nextInt();
				//scannerr.close();
				String w=String.valueOf(y);
				notas[z][v] = w;
				System.out.println("Los valores de "+notas[z][0]+" son: "+notas[z][1]+" | "+notas[z][2]+" | "+notas[z][3]);
			 }
			 //todos los scans anteriores era para ver cómo funcionaba esa función, parece que solo hay que llamarla una vez y cerrarla cuando terminas
			 //if(n == 5) {
			 //	 for(int a = 0;a<4;a++) {
			 //		int z = 10;
			 //		 for(int b = 1;b<4;b++) {
			 //			 int foo = Integer.parseInt(notas[a][b]);
			 //			 if(z > foo) {
			 //				 z = foo;
			 //			 }
			 //		 }
			 //		 System.out.println("El valor menor de "+notas[a][0]+" es:"+z);
			 //	 }
				 
			 //}
			 if(n == 4) { // como no quedaba claro
				 System.out.println("Los valores del array bidimensional son:");
				 for(int j=0;j<4;j++) {
					 System.out.println(notas[j][0]+" "+notas[j][1]+" "+notas[j][2]+" "+notas[j][3]);
				 }
			 }
			 //System.out.print("Test pasado\n"); con esta linea debugeaba el programa
		 }while(n != 0);
	 }
}
