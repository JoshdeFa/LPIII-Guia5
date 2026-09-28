package Act4;

public class main {
    public static void main(String[] args) {
        Pila<Integer> pila1 = new Pila<>(5);
        Pila<Integer> pila2 = new Pila<>(5);
        Pila<Integer> pila3 = new Pila<>(5);
        pila1.push(10);
        pila1.push(20);
        pila1.push(30);
        pila2.push(10);
        pila2.push(20);
        pila2.push(30);
        pila3.push(10);
        pila3.push(20);
        pila3.push(99);

        System.out.println("--- PRUEBAS DEL MÉTODO esIgual ---");
        System.out.println("¿pila1 es igual a pila2? " + pila1.esIgual(pila2)); 
        System.out.println("¿pila1 es igual a pila3? " + pila1.esIgual(pila3)); 
        System.out.println("¿pila1 es igual a pila2 tras un pop()? " + pila1.esIgual(pila2));
        System.out.println("\n--- VERIFICACIÓN DEL ESTADO ---");
        System.out.println("Tope actual de pila1: " + pila1.pop()); 
    }
}

