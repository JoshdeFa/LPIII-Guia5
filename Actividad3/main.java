package Act3;

public class main {
	public static void main(String[] args) {
		System.out.println("--- PRUEBAS DEL MÉTODO esIgualA ---");
        System.out.println("Tipos integrados (5 y 5): " + esIgualA(5, 5));
        System.out.println("Tipos integrados (5 y 8): " + esIgualA(5, 8));

        // 2. null
        System.out.println("null y null: " + esIgualA(null, null));
        System.out.println("null y un String: " + esIgualA(null, "Texto"));

        // 3. Object
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("Object (misma referencia): " + esIgualA(obj1, obj1));
        System.out.println("Object (distintas instancias): " + esIgualA(obj1, obj2));

        // 4. Integer
        Integer int1 = Integer.valueOf(100);
        Integer int2 = Integer.valueOf(100);
        System.out.println("Integer (100 y 100): " + esIgualA(int1, int2));

        // 5. String
        String str1 = new String("Java");
        String str2 = new String("Java");
        System.out.println("String ('Java' y 'Java'): " + esIgualA(str1, str2));

	}
		public static <T> boolean esIgualA(T obj1, T obj2) {
			if(obj1 == null) {
				return obj2 == null;
			}
			return obj1.equals(obj2);
		}
	
}
