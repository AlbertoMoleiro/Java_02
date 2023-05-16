package abstractas.ejercicio2.model;
/*Crear la clase abstracta Animal con los métodos abstractos comer() y moverse(). A
        continuación crearemos varias clases Perro, Pez, Pajaro, Gusano, ...etc.

        -¿Qué ocurre si no implemento todos los métodos?
        Debo implementar los métodos o marcar la clase como abstracta.

        -¿Puedo crear instancias igualmente?
        No se pueden crear instamcias de clases abstractas.

        -¿Puedo modificar parte de la definición de los métodos abstractos?
        No se puede modificar la definición de los métodos abstractos.

        -¿Puedo utilizar polimorfismo?
        Se puede utilizar polimorfismo.

        -Crea clases extendiendo la clase Pajaro, por ejemplo Gorrión y Buitre.
        -¿También son abstractas estas clases?
        No son abstractas. A no ser que así lo indiquemos.

        */
public abstract class Animal {
    public abstract String comer();
    public abstract String moverse();
}
