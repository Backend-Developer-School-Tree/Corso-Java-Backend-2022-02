package lista;

import java.util.Arrays;

public class MiaStringa extends AbstractLista{
	 
	public MiaStringa() {
		super();
	}
	public boolean contains(Object o) {
		if( o instanceof Character) {
			for(int i = 0; i < this.lista.length; i++) {
				if(this.lista[i] == o) {
					return true;
				}
			}
		}
		return false;
	}
	public void add(Object o) {
		if( o instanceof Character) {
			lista = Arrays.copyOf(lista, lista.length+1);
			lista[lista.length-1] = o; 
		} 
	}

}
