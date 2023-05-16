package abstractas.ejercicio1.model;
/*Crear la clase abstracta Planta con un método abstracto:
void regar(int cantidad, int tiempo)
además crearemos todas propiedades y métodos que se os ocurran
Creamos las clases PlantaTropical, Cactus donde implementaremos el método
abstracto.
Desde una clase principal crear objetos utilizando polimorfismo.*/
public class PlantaTropical extends Planta {

    protected  int temperatura;

    public PlantaTropical(String nombre, String tipo, int altura, int cantidadAgua, int temperatura) {
        super(nombre, tipo, altura, cantidadAgua);
        this.temperatura = temperatura;
    }

    @Override
    public void regar(int cantidad, int tiempo) {

        this.cantidadAgua += cantidad * tiempo;
    }
}
