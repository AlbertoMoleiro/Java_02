package abstractas.ejercicio2.model;

public abstract class Perro extends Animal{

        private String raza;

        public Perro(String nombre, String raza) {
            this.raza = raza;
        }


        @Override
        public String toString() {
            return "Perro{" +
                    "raza='" + raza + '\'' +
                    '}';
        }
}
