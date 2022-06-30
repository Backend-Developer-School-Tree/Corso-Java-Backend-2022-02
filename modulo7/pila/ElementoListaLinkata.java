public class ElementoListaLinkata<T> {
    // Attributi

    private final T data;
    private final ElementoListaLinkata<T> nextElement;

    // Costruttore

    public ElementoListaLinkata(T data, ElementoListaLinkata<T> nextElement) {
        this.data = data;
        this.nextElement = nextElement;
    }

    // Getter e Setter

    public T getData() {
        return data;
    }

    public ElementoListaLinkata<T> getNextElement() {
        return nextElement;
    }

    // Metodi

    @Override
    public String toString() {
        return "ElementoListaLinkata{" +
                "data=" + data +
                ", nextElement=" + nextElement +
                '}';
    }
}
