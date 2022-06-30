public abstract class ListaLinkata<T> {
    // Attributi

    private ElementoListaLinkata<T> head;

    // Costruttore

    public ListaLinkata() {
        this.head = null;
    }

    // Getter e Setter

    public ElementoListaLinkata<T> getHead() {
        return head;
    }

    public void setHead(ElementoListaLinkata<T> head) {
        this.head = head;
    }

    // Metodi

    public void addFirst(T data) {
        this.head = new ElementoListaLinkata<>(data, this.head);
    }

    public void removeFirst() {
        this.head = this.head.getNextElement();
    }

    @Override
    public String toString() {
        String output = "{ ";

        if (this.head != null) {
            ElementoListaLinkata<T> currentElement = this.head;

            while (currentElement.getNextElement() != null) {
                output += currentElement.getData() + ", ";
                currentElement = currentElement.getNextElement();
            }
            output += currentElement.getData();
        }

        output += " }";
        return output;
    }
}
