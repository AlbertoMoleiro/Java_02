package herencia.ejercicio2.model;
/*
Crear las clases Coche, Barco, Avión y Tren heredando de Vehiculo. Debes añadir
aquellas propiedades y métodos que creas conveniente así como sobrescribir aquellos
métodos que consideras necesario.
Por ultimo crea una clase TestVehiculos donde instancias todas las clases y procedas
a llamar a sus métodos.*/
public class Avion extends Vehiculo {

    private int altitudVuelo;

    public Avion(int altitudVuelo,String color) {
        super(color);
        this.altitudVuelo = altitudVuelo;
    }

    public int getAltitudVuelo() {
        return altitudVuelo;
    }

    public void setAltitudVuelo(int altitudVuelo) {
        this.altitudVuelo = altitudVuelo;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "altitudVuelo=" + altitudVuelo +
                ", color='" + color + '\'' +
                '}';
    }
}
