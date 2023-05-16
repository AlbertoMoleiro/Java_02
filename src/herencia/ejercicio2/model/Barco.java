package herencia.ejercicio2.model;

public class Barco extends Vehiculo {

    private int eslora;

    public Barco(int eslora,String color) {
        super(color);
        this.eslora = eslora;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "eslora=" + eslora +
                ", color='" + color + '\'' +
                '}';
    }
}
