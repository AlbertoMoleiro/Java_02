package herencia.ejercicio2.model;
/*
Crear las clases Coche, Barco, Avión y Tren heredando de Vehiculo. Debes añadir
aquellas propiedades y métodos que creas conveniente así como sobrescribir aquellos
métodos que consideras necesario.
Por ultimo crea una clase TestVehiculos donde instancias todas las clases y procedas
a llamar a sus métodos.*/
public class Vehiculo {


    protected String color;

    public Vehiculo(String color ){
        this.color = color;

    }
    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "color='" + color + '\'' +
                '}';
    }
}
