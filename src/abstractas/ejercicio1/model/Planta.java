package abstractas.ejercicio1.model;
/*Crear la clase abstracta Planta con un método abstracto:
void regar(int cantidad, int tiempo)
además crearemos todas propiedades y métodos que se os ocurran
Creamos las clases PlantaTropical, Cactus donde implementaremos el método
abstracto.
Desde una clase principal crear objetos utilizando polimorfismo.*/
public abstract class Planta{

    protected String nombre;
    protected String tipo;
    protected int altura;
    protected int cantidadAgua;

    public Planta(){

    }
    public Planta(String nombre, String tipo, int altura, int cantidadAgua){
        this.nombre = nombre;
        this.tipo = tipo;
        this.altura = altura;
        this.cantidadAgua = cantidadAgua;
    }

    public abstract void regar(int cantidad, int tiempo);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getCantidadAgua() {
        return cantidadAgua;
    }

    public void setCantidadAgua(int cantidadAgua) {
        this.cantidadAgua = cantidadAgua;
    }
}

