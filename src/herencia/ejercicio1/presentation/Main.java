package herencia.ejercicio1.presentation;
import herencia.ejercicio1.model.*;
public class Main {
    public static void main(String[] args) {
        Figura figura = new Figura(2,3);
        Circulo circulo = new Circulo(3,4,3);
        Rectangulo rectangulo = new Rectangulo(4,5,6,8);

        int[] position = figura.getPosition();
        System.out.println("X: " + position[0] + " Y: " + position[1]);

        position = circulo.getPosition();
        System.out.println("X: " + position[0] + " Y: " + position[1]);

        position = rectangulo.getPosition();
        System.out.println("X: " + position[0] + " Y: " + position[1]);
    }
}