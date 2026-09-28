package Act2;

public class main {
    public static void main(String[] args) {
        Pila<String> pilaNombres = new Pila<>(5);
        
        pilaNombres.push("Ana");
        pilaNombres.push("Luis");
        pilaNombres.push("Carlos");

        System.out.println("--- PRUEBA DEL MÉTODO CONTAINS ---");
        System.out.println("¿La pila contiene a 'Luis'? " + pilaNombres.contains("Luis")); 
        System.out.println("¿La pila contiene a 'Pedro'? " + pilaNombres.contains("Pedro")); 
        
        System.out.println("\n--- VERIFICACIÓN DEL ESTADO ---");
        System.out.println("Extrayendo el tope para verificar que la pila no se modificó:");
        System.out.println("Tope actual: " + pilaNombres.pop()); // Esperado: Carlos (El último ingresado)
    }
}
