public class Automobile {

    // attributi d'istanza
    private String marchio;
    private String modello;
    private int cilindrata;
    private int nMarce;
    // attributi di stato
    private int marciaInserita;
    private boolean motoreAcceso;

    // costruttori
    public Automobile(String marchio, String modello, int cilindrata, int nMarce) {
        this.marchio = marchio;
        this.modello = modello;
        this.cilindrata = cilindrata;
        this.nMarce = nMarce;
        this.marciaInserita = 0;
        this.motoreAcceso = false;
    }

    // metodi

    /* questo metodo cambia lo stato del motore da spento ad acceso */
    public void accendiMotore() {
        if (!motoreAcceso) {
            motoreAcceso = true;
        }
        else {
            System.out.println("Non puoi accendere un motore già acceso!");
        }
    }

    /* questo metodo cambia lo stato del motore da acceso a spento */
    public void spegniMotore() {
        if (motoreAcceso) {
            motoreAcceso = false;
            marciaInserita = 0;
        }
        else {
            System.out.println("Non puoi spegnere un motore già spento!");
        }
    }

    /* questo metodo aumenta la marcia dell'auto */
    public void aumentaMarcia() {
        if (marciaInserita != nMarce) {
            this.marciaInserita++;
        }
        else {
            System.out.println("Non puoi aumentare una marcia se stai già sull'ultima!");
        }
    }

    /* questo metodo scala la marcia dell'auto */
    public void scalaMarcia() {
        if (marciaInserita != -1) {
            this.marciaInserita--;
        }
        else {
            System.out.println("Non puoi scalare oltre la retromarcia!");
        }
    }

    /* questo metodo cambia la marcia inserita nella marcia n presa in input */
    public void inserisciMarcia(int n) {
        if (n >= -1 && n <= nMarce) {
            this.marciaInserita = n;
        }
        else {
            System.out.println("Marcia inserita non valida");
        }
    }

    public String toString() {
        String s = "";
        s += "Marchio: " + this.marchio + "\n";
        s += "Modello: " + this.modello + "\n";
        s += "Cilindrata: " + this.cilindrata + "\n";
        s += "Numero di marce: " + this.nMarce + "\n";
        s += "Il motore è acceso: " + this.motoreAcceso + "\n";
        s += "La marcia inserita è: " + this.marciaInserita + "\n";
        return s;
    }

}
