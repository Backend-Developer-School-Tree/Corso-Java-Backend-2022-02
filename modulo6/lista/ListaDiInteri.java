package lista;

import java.util.Arrays;

public class ListaDiInteri extends AbstractLista{
	 
	
	public ListaDiInteri() {
		super();
	}
	public boolean contains(Object o) {
		if( o instanceof Integer) {
			for(int i = 0; i < this.lista.length; i++) {
				if(this.lista[i] == o) {
					return true;
				}
			}
		}
		return false;
	}
	public void add(Object o) {
		if( o instanceof Integer) {
			lista = Arrays.copyOf(lista, lista.length+1);
			lista[lista.length-1] = o; 
		} 
	}
	

}
