package actividad01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author J4mes
 */
public class Ejercicio01 {
 public static void main(String[] args) throws IOException {
        int manzanas_tienda;
        int manzanas_queremos_comprar;
        double precio_manzana;
        double dinero_pagado;
 
        manzanas_tienda = 20;
        manzanas_queremos_comprar = 2;
        precio_manzana = 0.40;
 
        System.out.println("Vamos a comprar " + manzanas_queremos_comprar + " manzanas");
        // modificamos el contenido de las variables numericas para representar la
        // compra de manzanas
        dinero_pagado = precio_manzana * manzanas_queremos_comprar;
        manzanas_tienda = manzanas_tienda - manzanas_queremos_comprar;
 
        // mostramos por consola el valor de las variables numericas. De forma implícita
        // se convierte de de numero a string.
        System.out.println("Nos han costado:" + dinero_pagado);
        System.out.println("En la tienda quedan " + manzanas_tienda + " manzanas");
 
        System.out.println("Cuantas mazanas mas quieres comprar?");
        // Declaramos una variable compleja de nombre "br" y de tipo "BufferedReader".
        // Las variables del tipo "BufferedReader" contienen funciones para leer datos
        // por consola
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // utilizamos la función "readLine" de la variable "br" para leer un dato por
        // consola. Guardamos el número introducido en la variable "valor_escrito"
        String valor_escrito = br.readLine();
 
        /*
         * Convertimos mediante una conversion explicita la variable "valor_escrito" a
         * un valor entero para poder operar con él y lo almacenamos en la variable
         */
        manzanas_queremos_comprar = Integer.parseInt(valor_escrito);
 
        System.out.println("Vamos a comprar " + manzanas_queremos_comprar + " manzanas");
        // modificamos el contenido de las variables numericas para representar la
        // compra de manzanas
        dinero_pagado = precio_manzana * manzanas_queremos_comprar;
        manzanas_tienda = manzanas_tienda - manzanas_queremos_comprar;
        // mostramos por consola el valor de las variables numericas. De forma implícita
        // se convierte de de numero a string.
        System.out.println("Nos han costado:" + dinero_pagado +"€.");
        System.out.println("En la tienda quedan " + manzanas_tienda + " manzanas");
        
        int melones_tienda;
        int melones_queremos_comprar;
        double precio_melon;
        double dinero_pagado2;
 
        melones_tienda = 20;
        precio_melon = 2.30;
        System.out.println("En la tienda tambien hay 20 melones a 2,30€ la unidad.");
        System.out.println("Cuantos melones vas a comprar?");
        BufferedReader cr = new BufferedReader(new InputStreamReader(System.in));
        String melones_escrito = cr.readLine();
        melones_queremos_comprar = Integer.parseInt(melones_escrito);
        dinero_pagado2 = precio_melon * melones_queremos_comprar;
        melones_tienda = melones_tienda - melones_queremos_comprar;
        System.out.println("Quedan " + melones_tienda + " melones en la tienda.");
        System.out.println("Nos han costado:" + dinero_pagado2 + "€.");
    }
 
}
