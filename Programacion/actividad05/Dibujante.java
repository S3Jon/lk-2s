package actividad05;

public class Dibujante extends Artista{
	String ult_expo;
	String dibujo_mas_caro;
	double precio_dibujo_mas_caro;
	
	public Dibujante(String DNI, String nombre, int anyo, char sex, String ult_expo, String dibujo_mas_caro, double precio_dibujo_mas_caro) {
		super(DNI, nombre, anyo, sex);
		this.ult_expo=ult_expo;
		this.dibujo_mas_caro=dibujo_mas_caro;
		this.precio_dibujo_mas_caro=precio_dibujo_mas_caro;
	}
	
	public Dibujante(String ult_expo, String dibujo_mas_caro, double precio_dibujo_mas_caro) {
		this.ult_expo=ult_expo;
		this.dibujo_mas_caro=dibujo_mas_caro;
		this.precio_dibujo_mas_caro=precio_dibujo_mas_caro;
	}

	@Override
	public String toString() {
		return "Dibujante{" +super.toString()+ "ult_expo=" + ult_expo + ", dibujo_mas_caro=" + dibujo_mas_caro + ", precio_dibujo_mas_caro="
				+ precio_dibujo_mas_caro + "}";
	}

	public String getUlt_expo() {
		return ult_expo;
	}

	public double getPrecio_dibujo_mas_caro() {
		return precio_dibujo_mas_caro;
	}

	public void setUlt_expo(String ult_expo) {
		this.ult_expo = ult_expo;
	}

	public void setPrecio_dibujo_mas_caro(double precio_dibujo_mas_caro) {
		this.precio_dibujo_mas_caro = precio_dibujo_mas_caro;
	}

}
