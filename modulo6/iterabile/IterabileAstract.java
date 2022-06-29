public abstract class IterabileAstract implements Iterabile {
    // Attributi

    protected int index;

    // Costruttore

    public IterabileAstract() {
        this.index = 0;
    }

    // Metodi

    public void reset() {
        this.index = 0;
    }
}
