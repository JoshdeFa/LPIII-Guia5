package Ejercicio_3;

public class Main {

    public static <F, S> void imprimirPar(Par<F, S> par) {
        System.out.println(par.toString());
    }

    public static void main(String[] args) {
        Par<String, Integer> par1 = new Par<>("Texto", 50);
        
        Par<Double, Boolean> par2 = new Par<>(99.99, true);
        
        Persona persona = new Persona("Carlos", 30);
        Par<Persona, Integer> par3 = new Par<>(persona, 1);

        imprimirPar(par1);
        imprimirPar(par2);
        imprimirPar(par3);
    }
}