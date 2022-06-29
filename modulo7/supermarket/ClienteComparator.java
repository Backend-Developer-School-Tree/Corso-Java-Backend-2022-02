import java.util.Comparator;

public class ClienteComparator implements Comparator<Cliente> {

    @Override
    public int compare(Cliente c1, Cliente c2) {
        if (c1.getEta() > c2.getEta()) {
            return -1;
        } else if (c1.getEta() < c2.getEta()) {
            return 1;
        }
        return 0;
    }
}
