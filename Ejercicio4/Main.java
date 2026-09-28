package Ejercicio_4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Contenedor<String, Integer> miContenedor = new Contenedor<>();

        miContenedor.agregarPar("C", 1972);
        miContenedor.agregarPar("Java", 1995);
        miContenedor.agregarPar("Python", 1991);

        miContenedor.mostrarPares();

        Par<String, Integer> parBuscado = miContenedor.obtenerPar(1);
        if (parBuscado != null) {
            System.out.println(parBuscado.toString());
        }

        ArrayList<Par<String, Integer>> todosLosPares = miContenedor.obtenerTodosLosPares();
        System.out.println(todosLosPares.size());
    }
}