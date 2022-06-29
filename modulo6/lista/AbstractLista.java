package lista;

import java.util.Arrays;

public abstract class AbstractLista implements Lista{
	
	protected Object[] lista;
	
	public AbstractLista() {
		lista = new Object[0];
	}
	public int size() {
			return lista.length;
	}
	public boolean remove(int i) {
		if(i >= 0 && i < lista.length -1) {
			for(int j = i; j < lista.length; j++) {
				if(j == lista.length-1) {
					lista[j] = null;
				}
				else
					lista[j] = lista[j+1];
			}
			lista = Arrays.copyOf(lista, lista.length-1);
			return true;
		}
		else {
			return false;
		} 
	}
	
	public Object get(int i) {
		if(i >= 0 && i < lista.length) {
			return lista[i];
		}
		return null; 
	}
	
	public void clear() {
		lista = new Object[0];
	}
	
}
