public class ListaDiInteri extends IterabileAstract {
    // Attributi

    private int[] listaDiInteri;

    // Costruttore

    public ListaDiInteri(int[] listaDiInteri) {
        this.listaDiInteri = listaDiInteri;
    }

    // Getter e Setter

    public int[] getListaDiInteri() {
        return listaDiInteri;
    }

    public void setListaDiInteri(int[] listaDiInteri) {
        this.listaDiInteri = listaDiInteri;
    }

    // Metodi
    @Override
    public Object next() {
        if (this.hasNext()) {
            return this.listaDiInteri[this.index++];
        } else {
            System.out.println("Lista terminata");
            return null;
        }
    }

    @Override
    public boolean hasNext() {
        return this.index < this.listaDiInteri.length;
    }
}
