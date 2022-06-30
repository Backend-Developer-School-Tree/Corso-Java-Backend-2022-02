public class ListaLinkataMain {
    public static void main(String[] args) {
        /*
        ListaLinkata<String> listaLinkata = new ListaLinkata<>();

        listaLinkata.addFirst("ciao");
        listaLinkata.addFirst("come");
        listaLinkata.addFirst("stai");
        listaLinkata.addFirst("grazie");
        System.out.println(listaLinkata);

        listaLinkata.removeFirst();
        System.out.println(listaLinkata);

        listaLinkata.removeFirst();
        listaLinkata.removeFirst();
        System.out.println(listaLinkata);
         */

        Pila<String> pila = new Pila<>();

        pila.push("va?");
        pila.push("come");
        pila.push("a tutti");
        pila.push("Buonasera");

        System.out.println(pila);

        pila.pop();
        pila.pop();

        System.out.println(pila);
    }
}
