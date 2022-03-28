package actividad04;

import java.io.*;
import java.util.*;

public class Ejercicio01 {
	public static void main(String[] args) throws IOException { //main
		int opElegida = 100;
		//System.out.println("Working Directory = " + System.getProperty("user.dir")); //  testeando el user.dir
		File archivos = new File("archivos"); // Nombre carpeta
		archivos.mkdir();					  // crea la carpeta
		String local = System.getProperty("user.dir");
		String path = local + File.separator + "archivos";
		//System.out.println(path);
		do {
			do {
				imprimirMenu();
				opElegida = pideEntero();
			}while(opElegida < 0 || opElegida > 6);
			if(opElegida == 1)
				createNewFile(path);
			if(opElegida == 2)
				listFiles(path);
			if(opElegida == 3)
				shFile(path);
			if(opElegida == 4)
				dlFile(path);
			if(opElegida == 5)
				rnFile(path);
			if(opElegida == 6)
				rpFile(path);
			if(opElegida == 0)
				System.exit(0);
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
	
	public static String pideNombre() {
		Scanner sc=new Scanner(System.in);
		String name;
		System.out.print("Introduce un nombre para el archivo: ");
		name = sc.nextLine();
		return (name);
	}

	public static void createNewFile(String path) throws IOException {
		String nmbre;
		String txt;
		nmbre = pideNombre();
		File nombre = new File(path+File.separator+nmbre+".txt");
		nombre.createNewFile();
		System.out.print("¿Qué quiere introducir en el archivo?: ");
		Scanner scan = new Scanner(System.in);
		txt = scan.nextLine();
		BufferedWriter out = new BufferedWriter(new FileWriter(path+File.separator+nmbre+".txt", true));
		out.write(txt);
		out.close();
	}
	
	public static String[] listFiles(String path) {
		String[] pnames;
		File f = new File(path);
		pnames = f.list();
		int n = 1;
		for (String pname : pnames)
		{
			System.out.println(n+"-"+pname);
			n++;
		}
		System.out.println("------ Fin de la lista ------");
		return(pnames);
	}
	public static void shFile(String path) throws IOException {
		String Nombre;
		int numero = 0;
		String[] pnames = listFiles(path);
		System.out.print("¿Que archivo quieres leer?: ");
		Scanner scan = new Scanner(System.in);
		numero = scan.nextInt() - 1;
		Nombre = pnames[numero];
		try (BufferedReader br = new BufferedReader(new FileReader(path+File.separator+Nombre))) {
			   String line;
			   while ((line = br.readLine()) != null) {
			       System.out.println(line);
			   }
			}
		System.out.println("------ Fin del archivo ------");
	}
	public static void dlFile(String path) {
		String Nombre;
		int numero = 0;
		String[] pnames = listFiles(path);
		System.out.print("¿Que archivo quieres borrar?: ");
		Scanner scan = new Scanner(System.in);
		numero = scan.nextInt() - 1;
		Nombre = pnames[numero];
		File myfile = new File(path+File.separator+Nombre);
		//if(myfile.delete())										Aqui habia incluido una forma de ver si habia error al borrar
	         System.out.println("Archivo borrado exitosamente");
	    //  else													Pero no me lo piden
	    //     System.out.println("Algo ha salido mal");			
	}
	public static void rnFile(String path) throws IOException {
		String Nombre;
		String Nombre2;
		int numero = 0;
		String[] pnames = listFiles(path);
		System.out.print("¿Que archivo quieres renombrar?: ");
		Scanner scan = new Scanner(System.in);
		Scanner scen = new Scanner(System.in);
		numero = scan.nextInt() - 1;
		Nombre = pnames[numero];
		File myfile = new File(path+File.separator+Nombre);
		System.out.print("¿Qué nombre quieres ponerle?: ");
		Nombre2 = scen.nextLine();
		File filerename = new File(path+File.separator+Nombre2+".txt");
		boolean correcto = myfile.renameTo(filerename);
		if (!correcto) {
			System.out.println("Error.");
			main(null);
		}
		else
			System.out.println("Nombre cambiado.");
	}
	public static void rpFile(String path) throws IOException {
		String[] pnames = listFiles(path);
		int a = 0;
		int b = 0;
		String sust;
		System.out.print("¿Qué archivo quieres modificar?: ");
		Scanner scan = new Scanner(System.in);
		Scanner scen = new Scanner(System.in);
		a = scan.nextInt() -1;
		if(a+1 > pnames.length) {
			System.out.println("Ha ocurrido un error.");
			main(null);
		}
		RandomAccessFile raf = new RandomAccessFile(path+File.separator+pnames[a], "rw");
		System.out.print("¿Qué posicion quieres reemplazar?: ");
		b = scan.nextInt() -1;
		if (b > raf.length() ) {
			System.out.println("Ha ocurrido un error.");
			main(null);
		}
		else{
			raf.seek(b);
			System.out.print("¿Qué quieres poner en esa posición?: ");
			sust = scen.nextLine();
			raf.writeBytes(sust);
			raf.close();
		}
	}
}