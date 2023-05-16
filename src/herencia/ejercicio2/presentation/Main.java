package herencia.ejercicio2.presentation;
import  herencia.ejercicio2.model.*;
/*
Crear las clases Coche, Barco, Avión y Tren heredando de Vehiculo. Debes añadir
aquellas propiedades y métodos que creas conveniente así como sobrescribir aquellos
métodos que consideras necesario.
Por ultimo crea una clase TestVehiculos donde instancias todas las clases y procedas
a llamar a sus métodos.*/
public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche(4,"rojo");
        System.out.println(coche.toString());
        Barco barco = new Barco(10,"azul");
        System.out.println(barco.toString());
        Avion avion = new Avion(1000,"blanco");
        System.out.println(avion.toString());
        Tren tren = new Tren(10,"verde");
        System.out.println(tren.toString());
    }
}
