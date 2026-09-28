package Ejercicio_1;

public class Main {
    public static void main(String[] args) {
        Par<String, Integer> par1 = new Par<>("Semestre", 4);
        System.out.println(par1.toString());
        
        Par<Double, Boolean> par2 = new Par<>(3.1416, true);
        System.out.println(par2.toString());
        
        par1.setPrimero("Año");
        par1.setSegundo(2026);
        System.out.println(par1.toString());
    }
}