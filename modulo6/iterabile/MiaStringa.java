public class MiaStringa extends IterabileAstract {
    // Attributi

    private String myString;

    // Costruttore

    public MiaStringa(String myString) {
        this.myString = myString;
    }

    // Getter e Setter

    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }

    // Metodi

    @Override
    public Object next() {
        if (this.hasNext()) {
            return this.myString.charAt(this.index++);
        } else {
            System.out.println("Stringa terminata");
            return null;
        }
    }

    @Override
    public boolean hasNext() {
        return this.index < this.myString.length();
    }
}
