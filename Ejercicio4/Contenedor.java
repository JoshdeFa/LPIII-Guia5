package Ejercicio_4;

import java.util.ArrayList;

public class Contenedor<F, S> {
    private ArrayList<Par<F, S>> pares;

    public Contenedor() {
        this.pares = new ArrayList<>();
    }

    public void agregarPar(F primero, S segundo) {
        Par<F, S> nuevoPar = new Par<>(primero, segundo);
        this.pares.add(nuevoPar);
    }

    public Par<F, S> obtenerPar(int indice) {
        if (indice >= 0 && indice < pares.size()) {
            return pares.get(indice);
        }
        return null;
    }

    public ArrayList<Par<F, S>> obtenerTodosLosPares() {
        return pares;
    }

    public void mostrarPares() {
        for (Par<F, S> par : pares) {
            System.out.println(par.toString());
        }
    }
}