package Ejercicios;
import java.io.IOException;
import java.util.stream.IntStream;

public class ejercicio2intTable {
	public static void main(String[] args) throws IOException {
        stArrays();
    }
	
	public static void stArrays() throws IOException{
		int notas[][] = {{8,5,10,4},{3,8,9,7},{9,7,6,8}};
		//imprimir arrays
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(notas[i][j]+" ");
			}
		System.out.print("\n");
		}
		//notas primera película
		System.out.print("Notas de la pelicula 1: ");
		for(int k=0;k<4;k++) {
			System.out.print(notas[0][k]);
			if(k<3) {
				System.out.print(", ");
			}
		}
		System.out.print("\n");
		//calcular media segunda pelicula
		double med = (double)IntStream.of(notas[1]).sum()/notas[1].length; //casteo la suma como double por lo cual mantengo decimales
		System.out.println("La nota media de la pelicula 2 es: "+med);
		//valor mas alto de la tercera
		int z = 0;
		for(int b = 1;b<4;b++) {
			if(z < notas[2][b]) {
				z = notas[2][b];
			}
		}
			 System.out.println("La nota más alta de la tercera película es: "+z);
	}
}
