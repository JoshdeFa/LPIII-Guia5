package Act4;

import Act2.ExcepcionPilaLlena;
import Act2.ExcepcionPilaVacia;

public class Pila<E> {
	private final int tamanio;
	private int superior;
	private E[] elementos;
	
	public Pila(){
		this(10);
	}
	@SuppressWarnings("unchecked")
	public Pila(int s) {
		tamanio = s > 0 ? s :10;
		superior = -1;
		elementos = (E[]) new Object[tamanio];
	}
	public void push(E valorAMeter) {
		if(superior == tamanio -1) {
			throw new ExcepcionPilaLlena(String.format("La pila esta llena, no se puede meter %s", valorAMeter));
		}
		elementos[++superior] = valorAMeter;
	}
	public E pop() {
		if(superior == -1) {
			throw new ExcepcionPilaVacia("La pila esta vacia, no se puede sacar");
		}
		return elementos[superior--];
	}
	
	public boolean contains(E elemento) {
		for(int i = superior ; i >= 0; i--) {
			if(elementos[i].equals(elemento)) {
				return true;
			}
		}
		return false;
	}
	public boolean esIgual(Pila<E> otraPila) {
        if (this.superior != otraPila.superior) {
            return false;
        }

        for (int i = 0; i <= this.superior; i++) {
            if (!this.elementos[i].equals(otraPila.elementos[i])) {
                return false; 
            }
        }
        return true;
    }
}

