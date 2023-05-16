package herencia.ejercicio2.model;

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
