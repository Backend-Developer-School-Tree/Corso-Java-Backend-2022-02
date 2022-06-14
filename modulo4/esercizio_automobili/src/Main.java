public class Main {

    public static void main(String[] args) {
        Automobile automobile = new Automobile("Ferrari", "Testarossa", 4000, 6);
        System.out.println(automobile);
        System.out.println();
        automobile.accendiMotore();
        System.out.println(automobile);
        System.out.println();
        automobile.aumentaMarcia();
        automobile.aumentaMarcia();
        System.out.println(automobile);
        System.out.println();
        automobile.scalaMarcia();
        System.out.println(automobile);
        System.out.println();
        automobile.inserisciMarcia(6);
        System.out.println(automobile);
        System.out.println();
        automobile.aumentaMarcia();
        automobile.spegniMotore();
        System.out.println(automobile);
    }

}
