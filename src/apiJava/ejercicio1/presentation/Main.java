package apiJava.ejercicio1.presentation;
/*Ejercicio1
Crear la cadena de texto: “Bienvenidos al curso de Java”
Mostrar la cadena toda en mayúsculas
Mostrar la cadena en minúsculas
Mostrar solo la palabra Bienvenidos
Mostrar solo la palabra Java
Mostrar la palabra curso
Mostrar la posición de la letra c
Devolver la longitud de la cadena
Modificar las e minúsculas por E mayúsculas
Concatenar la frase anterior con “con fecha 14 de Septiembre”*/
public class Main {
    public static void main(String[] args) {

        String cadena = "Bienvenidos al curso de Java";
        System.out.println(cadena.toUpperCase());
        System.out.println(cadena.toLowerCase());
        System.out.println(cadena.substring(0,11));
        System.out.println(cadena.substring(24,28));
        System.out.println(cadena.substring(15,20));
        System.out.println(cadena.indexOf('c'));
        System.out.println(cadena.length());
        System.out.println(cadena.replace('e','E'));
        System.out.println(cadena.concat(" con fecha 14 de Septiembre"));
    }
}
