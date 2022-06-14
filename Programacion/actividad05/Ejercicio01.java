package actividad05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio01 {
	public static void main(String[] args) throws IOException{
		Artista art1 = new Artista();
		art1.setDNI("79696969J");
		art1.setAnyo(1990);
		art1.setNombre("Juan");
		art1.setSex("M");
		
		System.out.println(art1);
		
		Dibujante dib1 = new Dibujante("6868686868L", "September expo", "Les Menins", 25600.90, "69795939C", "Filipo", 1970, "M" );
		System.out.println(dib1);
		
		Musico mus1 = new Musico("1919818F", "Lil Pepo", 1996, "m", "https://www.lilpeep.com", "Come Over When You're Sober, Pt. 2" );
		
		System.out.println(mus1);
		
		mus1.setCancion("Falling Down", 0);
		mus1.setCancion("Five Degrees", 1);
	}

}
