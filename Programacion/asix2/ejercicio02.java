package Ejercicios;

import java.io.IOException;
import java.util.stream.IntStream;

public class ejercicio02 {
	public static void main(String[] args) throws IOException {
        stArrays();
    }
	
	public static void stArrays() throws IOException{
		double notas[][] = {{8,5,10,4},{3,8,9,7},{9,7,6,8}};
		//imprimir arrays
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print((int)notas[i][j]+" "); //para no imprimir decimales porque no hay
			}
		System.out.print("\n");
		}
		//notas primera película
		System.out.print("Notas de la pelicula 1: ");
		for(int k=0;k<4;k++) {
			System.out.print((int)notas[0][k]);  //lo mismo que arriba
			if(k<3) {
				System.out.print(", ");
			}
		}
		System.out.print("\n");
		//calcular media segunda pelicula
		//Por alguna razón doubleStream no me funciona asi que a la vieja usanza
		double med = 0;
		for(int g=0;g<4;g++) {
			med = med + notas[1][g];
		}
		med = med / 4;
		System.out.println("La nota media de la pelicula 2 es: "+med);
		//valor mas alto de la tercera
		double z = 0;
		for(int b = 0;b<4;b++) {
			if(z < notas[2][b]) {
				z = notas[2][b];
			}
		}
		System.out.print("La nota más alta de la tercera película es: "+(int)z); //aqui funciona tambien el castearlo como int
	}
}
