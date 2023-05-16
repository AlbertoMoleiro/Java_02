package herencia.ejercicio2.model;
/*
Crear las clases Coche, Barco, Avión y Tren heredando de Vehiculo. Debes añadir
aquellas propiedades y métodos que creas conveniente así como sobrescribir aquellos
métodos que consideras necesario.
Por ultimo crea una clase TestVehiculos donde instancias todas las clases y procedas
a llamar a sus métodos.*/

public class Coche extends Vehiculo {
    private int ruedas;

    public Coche(int ruedas,String color) {
        super(color);
        this.ruedas = ruedas;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "ruedas=" + ruedas +
                ", color='" + color + '\'' +
                '}';
    }
}
