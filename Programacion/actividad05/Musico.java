package actividad05;

public class Musico extends Artista{
    private String sitioWeb;
    private String ultimoDisco;
    private String[] topCanciones = new String[10];

    public Musico(String dni, String nombre, int anyo, String sex, String sitioWeb, String ultimoDisco ) {
        super(dni, nombre, anyo, sex);
        this.sitioWeb = sitioWeb;
        this.ultimoDisco = ultimoDisco;
    }
    
    

    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    public String getUltimoDisco() {
        return ultimoDisco;
    }

    public void setUltimoDisco(String ultimoDisco) {
        this.ultimoDisco = ultimoDisco;
    }

    public String[] getTopCanciones() {
        return topCanciones;
    }

    public void setTopCanciones(String[] topCanciones) {
        this.topCanciones = topCanciones;
    }
    public void muestraCanciones(){
        for(int k=0;k<this.topCanciones.length;k++){
            System.out.println("posicion 0:"+this.topCanciones[k]);
        }
    }
    public void setCancion(String cancion, int posicion){
        this.topCanciones[posicion] = cancion;
    }

    @Override
    public String toString() {
        return "Musico{" +super.toString()+ " ,sitioWeb=" + sitioWeb + ", ultimoDisco=" + ultimoDisco + ", topCanciones=" + topCanciones + '}';
    }

            
}