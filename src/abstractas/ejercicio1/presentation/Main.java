package abstractas.ejercicio1.presentation;
import abstractas.ejercicio1.model.*;

public class Main {
    public static void main(String[] args) {

        Planta planta = new PlantaTropical("Planta1","Tropical",10,10,10);
        planta.regar(10,10);
        Planta planta2 = new Cactus("Planta2","Cactus",10,10,10);
        planta2.regar(10,10);

    }
}
