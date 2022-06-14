package actividad05;

public class Artista {
	public String DNI;
	public String nombre;
	private int anyo;
	private char sex;
	
	Artista(String DNA, String nambre, int anyyo, char sexo){
		this.DNI=DNA;
		this.nombre=nambre;
		this.anyo=anyyo;
		this.sex=sexo;
	}
	
	public Artista(String DNA, String nombre, int anyo) {
		this.DNI=DNA;
		this.nombre=nombre;
		this.anyo=anyo;
	}
	
	public Artista() {
	
	}
	
	@Override
	public String toString() {
		return "Artista [DNI=" + DNI + ", nombre=" + nombre + ", anyo=" + anyo + ", sex=" + sex + "]";
	}

	public void setDNI(String DNI) {
		DNI = DNI;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}
}
