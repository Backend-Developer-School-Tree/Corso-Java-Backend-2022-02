import java.util.HashSet;

public class DictionaryMain {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();

        HashSet<String> calcioMeanings = new HashSet<>();
        calcioMeanings.add("Sport di squadra");
        calcioMeanings.add("Elemento chimico");
        calcioMeanings.add("Comune di 5353 abitanti");
        calcioMeanings.add("Impugnatura del fucile");
        dictionary.insertWord("Calcio", calcioMeanings);
        dictionary.insertMeaningByWord("Calcio", "Colpo sferrato con il piede");

        HashSet<String> retinaMeanings = new HashSet<>();
        retinaMeanings.add("Membrana più interna del bulbo oculare");
        retinaMeanings.add("Rete, spesso elastica, indossata sopra i capelli lunghi per tenerli in posizione");
        dictionary.insertWord("Retina", retinaMeanings);

        HashSet<String> circuitoMeanings = new HashSet<>();
        circuitoMeanings.add("Catena di elementi attraversati da corrente elettrica");
        circuitoMeanings.add("Luogo in cui si svolgono corse");
        dictionary.insertWord("Circuito", circuitoMeanings);

        dictionary.print();
    }
}
