import java.util.Comparator;
import java.util.PriorityQueue;

public class Supermercato {
    // Attributi

    PriorityQueue<Cliente> coda;

    // Costruttore

    public Supermercato() {
        this.coda = new PriorityQueue<>(Comparator.comparingInt(Cliente::getEta).reversed());
        // this.coda = new PriorityQueue<>(new ClienteComparator());
        // this.coda = new PriorityQueue<>();
    }

    // Metodi

    public boolean inserimentoCliente(Cliente cliente) {
        boolean resultInserimento = this.coda.add(cliente);
        if (resultInserimento) {
            System.out.println("Inserimento cliente " + cliente.getNome() + " " + cliente.getCognome() +
                    " eseguito correttamente");
        } else {
            System.out.println("Impossibile inserire cliente " + cliente.getNome() + " " + cliente.getCognome());
        }
        return resultInserimento;
    }

    public boolean rimozioneCliente(Cliente cliente) {
        return this.coda.remove(cliente);
    }

    public void rimozioneNextCliente() {
        Cliente clienteRimosso = this.coda.poll();
        if (clienteRimosso != null) {
            System.out.println("Cliente " + clienteRimosso.getNome() + " " + clienteRimosso.getCognome() + " (Età: " +
                    clienteRimosso.getEta() + ") rimosso dalla coda");
        } else {
            System.out.println("Nessun cliente rimasto da rimuovere");
        }
    }

    public Cliente getNextCliente() {
        return this.coda.peek();
    }

    public int getNumeroClienti() {
        return this.coda.size();
    }

    @Override
    public String toString() {
        return "Supermercato{" +
                "coda=" + coda +
                '}';
    }
}
