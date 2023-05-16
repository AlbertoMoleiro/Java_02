package abstractas.ejercicio1.model;

public class Cactus extends Planta {

    protected  int temperatura;

    public Cactus(String nombre, String tipo, int altura, int cantidadAgua, int temperatura) {
        super(nombre, tipo, altura, cantidadAgua);
        this.temperatura = temperatura;
    }

    @Override
    public void regar(int cantidad, int tiempo) {
        this.cantidadAgua += cantidad * tiempo;
    }
}

