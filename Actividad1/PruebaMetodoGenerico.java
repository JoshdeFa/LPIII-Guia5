package Act1;

public class PruebaMetodoGenerico {
	public static <E> void imprimirArreglo(E[] arregloEntrada) {
		for(E elemento : arregloEntrada) {
			System.out.printf("%S ", elemento);
		}
		System.out.println();
	}
	
	public static <E> int imprimirArreglo(E[] arregloEntrada, int subindiceInferior, int subindiceSuperior) throws InvalidSubscriptException{
			if(subindiceInferior < 0 || subindiceSuperior >= arregloEntrada.length || subindiceInferior <= subindiceSuperior) {
				throw new InvalidSubscriptException("Error: indices invalidos . Inferior: " + subindiceInferior + " Superior: " + subindiceSuperior);
			}
			int elementosImpresos = 0;
			for(int i = subindiceSuperior; i <= subindiceSuperior; i ++) {
				System.out.printf("%S ", arregloEntrada[i]);
				elementosImpresos++;
			}
			System.out.println();
			return elementosImpresos;		
	}
	
	public static void main(String[] args) {
        Integer[] arregloInteger = { 1, 2, 3, 4, 5, 6 };
        Double[] arregloDouble = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
        Character[] arregloCharacter = { 'H', 'O', 'L', 'A' };

        System.out.println("--- PRUEBA DEL MÉTODO ORIGINAL ---");
        System.out.println("Arreglo Integer completo:");
        imprimirArreglo(arregloInteger);

        System.out.println("\n--- PRUEBA DEL MÉTODO SOBRECARGADO (RANGOS VÁLIDOS) ---");
        try {
            System.out.println("Arreglo Double (índices 1 al 4):");
            int cantidadDouble = imprimirArreglo(arregloDouble, 1, 4);
            System.out.println("Elementos impresos: " + cantidadDouble);

            System.out.println("\nArreglo Character (índices 1 al 3):");
            int cantidadChar = imprimirArreglo(arregloCharacter, 1, 3);
            System.out.println("Elementos impresos: " + cantidadChar);
            
        } catch (InvalidSubscriptException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n--- PRUEBA DEL MÉTODO SOBRECARGADO (RANGOS INVÁLIDOS) ---");
        try {
            System.out.println("Intentando imprimir Integer con subindiceSuperior menor al inferior...");
            imprimirArreglo(arregloInteger, 4, 2); 
        } catch (InvalidSubscriptException e) {
            System.out.println("Excepción capturada con éxito: " + e.getMessage());
        }
    }
}
