package herencia.ejercicio2.model;

public class Tren extends Vehiculo{

    private int vagones;

    public Tren(int vagones,String color) {
        super(color);
        this.vagones = vagones;
    }

    public int getVagones() {
        return vagones;
    }

    public void setVagones(int vagones) {
        this.vagones = vagones;
    }

    @Override
    public String toString() {
        return "Tren{" +
                "vagones=" + vagones +
                ", color='" + color + '\'' +
                '}';
    }


}
