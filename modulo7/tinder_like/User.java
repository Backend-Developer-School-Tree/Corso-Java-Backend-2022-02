import java.util.HashSet;

public class User {
    // Attributi

    private static int count = 1;
    private final int id;
    private final String name;
    private final HashSet<Interest> interests;

    // Costruttore

    public User(String name, HashSet<Interest> interests) {
        this.id = count++;
        this.name = name;
        this.interests = interests;
    }

    // Getter

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HashSet<Interest> getInterests() {
        return interests;
    }

    // Metodi

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", interests=" + interests +
                '}';
    }
}
