public class Pila<T> extends ListaLinkata<T> {
    // Metodi

    public void push(T data) {
        this.addFirst(data);
    }

    public T pop() {
        T dataToRemove = this.getHead().getData();
        this.removeFirst();
        return dataToRemove;
    }

    public T peek() {
        return this.getHead().getData();
    }
}
