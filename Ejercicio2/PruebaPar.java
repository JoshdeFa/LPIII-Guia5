package Ejercicio_2;

public class PruebaPar {
    public static void main(String[] args) {
        Par<String, Integer> par1 = new Par<>("Texto", 10);
        Par<String, Integer> par2 = new Par<>("Texto", 10);
        Par<String, Integer> par3 = new Par<>("Diferente", 20);

        System.out.println(par1.esIgual(par2));
        System.out.println(par1.esIgual(par3));
        
        Par<Double, Boolean> par4 = new Par<>(5.5, true);
        Par<Double, Boolean> par5 = new Par<>(5.5, false);
        
        System.out.println(par4.esIgual(par5));
    }
}