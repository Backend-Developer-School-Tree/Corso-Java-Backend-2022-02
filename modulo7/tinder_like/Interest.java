public class Interest {
    // Attributi

    private static int count = 1;
    private final int id;
    private final String text;

    // Costruttore

    public Interest(String text) {
        this.id = count++;
        this.text = text;
    }

    // Getter

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    // Metodi

    @Override
    public String toString() {
        return "Interest{" +
                "id=" + id +
                ", text='" + text + '\'' +
                '}';
    }
}
