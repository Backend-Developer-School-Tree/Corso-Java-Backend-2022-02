public class FormaGeometrica {
    // Attributi

    private int base;
    private int altezza;

    // Costruttore
    public FormaGeometrica(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    // Setter

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    // Getter

    public int getBase() {
        return base;
    }

    public int getAltezza() {
        return altezza;
    }

    // Metodi

    public int getArea() {
        return this.base * this.altezza;
    }

    public int getPerimeter() {
        return (this.base + this.altezza) * 2;
    }
}
