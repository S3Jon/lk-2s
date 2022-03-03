/**
 *
 * @author J4mes
 */
package actividad01;
public class Ejercicio02 {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean verdad = true;
        byte num1 = 1;
        char letra = 'g';
        short num2 = 32766;
        int num3 = 2147483640;
        long num4 = 1234567891;
        float num5 = 9.876543f;
        double num6 = 4.8765432101234567;
        //Dato que tiene 2 opciones: 'true' o 'false', ocupa 8 bits
        System.out.println("La variable tipo boolean indica verdadero o falso en 8 bits. Ejemplo: " +verdad);
        // Numero entero entre -128 y 127
        System.out.println("La variable tipo byte almacena un numero entre -128 y 127. Ejemplo:" +num1);
        //Caracter unicode 16 bits
        System.out.println("Char almacena un caracter unicode de 16 bits. Ej: " +letra);
        //Numero entero entre -32768 y 32767
        System.out.println("Short almacena un numero entre -32768 y 32767. Ej: " +num2);
        //Int: # entre -2^31 y (2*31)-1
        System.out.println("Int puede almacenar un numero desde -2147483648 hasta 2147483647. Ej: " +num3);
        //long: # entre -2^63 y (2^63)-1
        System.out.println("Long almacena un numero entre -9.223372e+18 y (9.223372e+18)-1. Ej: " +num4);
        //float guarda un numero con hasta 7 digitos de precision
        System.out.println("Float es capaz de almacenar hasta 7 digitos de un numero. Ej: " +num5);
        //double pues 16 digitos
        System.out.println("Mientras que double puede guardar hasta 16. Ej: " +num6);
        opAritBin();
        opAritUn();
        opAritAsig();
        opLog();
        opRel();
    }
    // el ejercicio indica que sea  dentro de la clase publica pero no del main, asi que lo hago asi para
    // que se vea algo mas organizado
    // todo lo organizado que casi no tiene codigo propio sino que hace un par de operaciones
    // y que mayormente es para imprimir texto
    public static void opAritBin() {
        System.out.println("--Operadores aritmeticos binarios--");
        System.out.println("Operaciones matematicas entre 2 valores, ejemplificados con A (10) y B (5)");
        int a = 10;
        int b = 5;
        System.out.println("'+' suma los numeros A y B. Ej: "+ (a + b));
        System.out.println("'-' le resta B a A. Ej: "+ (a - b));
        System.out.println("'*' multiplica los valores A y B. Ej: "+ (a * b));
        System.out.println("'/' divide el valor A entre B. Ej: "+ (a / b));
        System.out.println("'%' divide el valor A entre B y devuelve el resto de la división (es decir, si son multiplos devuelve 0. Ej: " + (a % b));
    }
    
    public static void opAritUn() {
        int a = 5;
        //no tengo ni idea de por que no funciona pero weno
        System.out.println("--Operadores aritmeticos unarios--");
        System.out.println("A diferencia de los binarios, aqui los operadores interactuan sobre una sola variable (A = 5)");
        int resul = a++;
        System.out.println("'++' incrementa en 1 el valor de la variable. Uso: 'int b = a++;'. Ej: "+ (resul));
        int resul2 = a--;
        System.out.println("'--' decrementa el valor de la variable en 1. Uso: 'int b = a--;'. Ej: "+ (resul2));
        int resul3 = -a;
        System.out.println("'-' inverte el valor de la variable. Uso: 'int b = -a;'. Ej: "+ (resul3));
        boolean resul4 = true; 
        boolean resul5 = !resul4; 
        System.out.println("'!' usa valor booleano (true/false), para este ejemplo A = true. Uso: int resul = !a. Ej: "+ (resul5));
        // compilando con int esto no funciona, plus no se me ocurre en que contexto podria interesarte usar esto asi que no voy a hacer muchas preguntas
    }
    
    public static void opAritAsig() {
        System.out.println("--Operadores aritmeticos de asignacion--");
        System.out.println("'=' asiga una valor a una variable. Ej: int a = 5");
        System.out.println("'+=' le suma a una variable el numero deseado. Ej: int a += 5. Antes 'a' era 5, y como le sumamos 5 ahora es 10");
        System.out.println("'-=' le resta a una variable el numero deseado. Ej: int a -= 5. Antes 'a' era 10, y como le restamos 5 ahora es 5");
        System.out.println("'*=' se usa para multiplicar una variable por un numero indicado al otro lado de la igualdad. Ej: int a *= 10. Antes A era 5 y ahora es 50 ");
        System.out.println("'/=' divide la variable por el numero indicado. Ej: int a /= 5. Antes A era 50 y ahora es 10.");
        System.out.println("'%=' devuelve el resto de dividir la variable por un numero. Ej: int a %= 5. Antes A era 10 y ahora es 0 (no hay resto en esta division).");
    }
    
    public static void opLog() {
        System.out.println("--Operadores logicos--");
        System.out.println("'&&' devolvera true solo cuando tanto A como B sean true, sino sera false. Ej true + false: "+ (true && false) );
        System.out.println("|| dara true si A, B o los dos son true. Solo si los dos son false da false. Ej true + false: "+ (true || false));
        System.out.println("'!' dara lo contrario de lo objetino (True -> false; false -> true). Ej true: "+ (!true));
    }
    
    public static void opRel() {
        System.out.println("--Operadores relacionales--");
        System.out.println("Los operadores relacionales comparan un numero (A) con otro numero (B)");
        System.out.println("'==' si A y B son iguales devolvera true. Ej 2 == 2: "+ (2 == 2));
        System.out.println("'!=' da true si A y B son diferentes. Ej 2 y 2: "+ (2 != 2));
        System.out.println("'>' devuelve true solo si eA es mayor que B. Ej 2 y 2: "+ (2 > 2));
        System.out.println("'<' devuelve true si A es menor que B. Ej 2 y 3: "+ (2 < 3));
        System.out.println("'>=' devuelve true si A es mayor o igual a B. Ej 2 y 2: "+ (2 >= 2));
        System.out.println("'<=' devuelve true si A es igual o menor que B. Ej 2 y 3: "+ (2 <= 3));
    }
}
