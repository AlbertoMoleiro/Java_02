package herencia.ejercicio2.model;

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
