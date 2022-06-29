public class IterabileMain {
    public static void main(String[] args) {
        // Test ListaDiInteri
        int[] listaInteri = new int[]{3, 4, 6, 9, 10, 11};
        ListaDiInteri iterabileListaDiInteri = new ListaDiInteri(listaInteri);

        for (int i = 0; i < 3; i++) {
            System.out.println("Prossimo intero: " + iterabileListaDiInteri.next());
            if (iterabileListaDiInteri.hasNext()) {
                System.out.println("Presente un intero successivo, proseguo");
            } else {
                break;
            }
        }

        iterabileListaDiInteri.reset();
        while (iterabileListaDiInteri.hasNext()) {
            System.out.println("Corrente intero: " + iterabileListaDiInteri.next());
            if (iterabileListaDiInteri.hasNext()) {
                System.out.println("Presente un intero successivo, proseguo");
            } else {
                break;
            }
        }

        // Test MiaStringa
        String miaStringa = "test";
        MiaStringa iterabileStringa = new MiaStringa(miaStringa);

        for (int i = 0; i < 2; i++) {
            System.out.println("Prossimo carattere: " + iterabileStringa.next());
            if (iterabileStringa.hasNext()) {
                System.out.println("Presente carattere successivo, proseguo");
            } else {
                break;
            }
        }

        iterabileStringa.reset();
        while (iterabileStringa.hasNext()) {
            System.out.println("Prossimo carattere: " + iterabileStringa.next());
            if (iterabileStringa.hasNext()) {
                System.out.println("Presente carattere successivo, proseguo");
            } else {
                break;
            }
        }
    }
}
