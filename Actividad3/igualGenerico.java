package Act3;

public class igualGenerico {
	public static <T> boolean esIgualA(T obj1, T obj2) {
		if(obj1 == null) {
			return obj2 == null;
		}
		return obj1.equals(obj2);
	}
}
