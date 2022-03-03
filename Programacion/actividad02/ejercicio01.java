/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package actividad02;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 *
 * @author J4mes
 */
public class ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        stMenu();
    }
    
    public static void stMenu() throws IOException {
        int opcion_elegida = 40;
        double [] recipiente = {0,0,0,0,0};
        do{
        	Scanner scanner = new Scanner(System.in);
            do{
                System.out.println("Menu opciones:");
                System.out.println("1. Añadir refresco a un recipiente");
                System.out.println("2. Quitar refresco de un recipiente");
                System.out.println("3. Mostrar el total de refresco ");
                System.out.println("0. Finalizar ");
                System.out.print("Introduzca opcion deseada: ");
                opcion_elegida = scanner.nextInt(); //
                if (opcion_elegida < 0 || opcion_elegida > 4){
                    System.out.println("El valor introducido es incorrecto.");
                }
            }while(opcion_elegida < 0 || opcion_elegida > 4);
            if (opcion_elegida == 1){
                int recipiente_elegido = 100;
                double volumenAnadir = 0.0f;
                do{
                    System.out.println("Introduce el numero del recipiente entre 0 y 4: ");
                    recipiente_elegido = scanner.nextInt();
                }while(recipiente_elegido < 0 || recipiente_elegido > 4);
                do{
                    System.out.println("Introduce la cantidad a ingresar en el recipiente " +recipiente_elegido+ " por favor.");
                    volumenAnadir = scanner.nextDouble();                    
                }while(volumenAnadir < 0);
                recipiente[recipiente_elegido] = recipiente[recipiente_elegido] + volumenAnadir;
                //stPrntStatus(recipiente[]);
                opcion_elegida = 3;
            }
            if (opcion_elegida == 2) {
                int recipiente_elegido2 = 100;
                double volumenRestar = 0.0f;
                do{
                    System.out.println("Introduce el numero del recipiente entre 0 y 4: ");
                    recipiente_elegido2 = scanner.nextInt();
                }while(recipiente_elegido2 < 0 || recipiente_elegido2 > 4);
                do{
                    //Scanner scan4 = new Scanner(System.in);
                    System.out.println("Introduce la cantidad a retirar en el recipiente " +recipiente_elegido2+ " por favor:");
                    volumenRestar = scanner.nextDouble();
                    if(volumenRestar > recipiente[recipiente_elegido2]) {
                    	System.out.println("El recipiente "+recipiente_elegido2+" no tiene el suficiente volumen para restarle "+volumenRestar+".");
                    }
                }while(volumenRestar < 0 || volumenRestar > recipiente[recipiente_elegido2]);
                recipiente[recipiente_elegido2] = recipiente[recipiente_elegido2] - volumenRestar;
                opcion_elegida = 3;
            }
            if (opcion_elegida == 3){
                System.out.println("-----El estado actual en los recipientes es:");
                double ttal = 0;
                for(int z =0;z<5;z++){
                    System.out.println("En el recipiente " +z+ " hay " +recipiente[z]+ " litros.");
                    ttal = ttal + recipiente[z];
                }
               System.out.println("La cantidad total de litros que hay en todos los recipientes es: " +ttal+"\n");
            }
        }while(opcion_elegida != 0);
        System.out.println("Adios");
    }
    
    //public static void stImprimirTotal(string args[]) throws IOException {
    //    System.out.println("-----El estado actual en los recipientes es:");
    //    for(int i=0;i<4;i++){
    //        System.out.println("En el recipiente %d hay  (litros");
    //    }
    //}
    // Quería que el imprimir estatus fuera una opcion de por si pero como ya lo hace la 3 pues directamente lo hago ahi
}