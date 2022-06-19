public class Caffe extends Prodotto{
    private boolean withSugar;

    //private static double prezzoCaffe;

    public Caffe(String codice, double prezzo){
        super(codice, prezzo);

    }

    public Caffe(String codice, double prezzo, boolean withSugar){
        super(codice, prezzo);

        this.withSugar = withSugar;
    }
}
