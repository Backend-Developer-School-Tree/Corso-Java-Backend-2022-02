import java.util.HashMap;
import java.util.HashSet;

public class TinderLike {
    // Attributi

    private HashMap<Integer, User> users;

    // Costruttore

    public TinderLike() {
        this.users = new HashMap<>();
    }

    // Metodi

    public User insertUserWithInterests(String name, HashSet<Interest> interests) {
        User newUser = new User(name, interests);
        this.users.put(newUser.getId(), newUser);
        return newUser;
    }

    public void removeUser(User user) {
        this.users.remove(user.getId());
    }

    public User getMostSimilarUser(User user) {
        User mostSimilarUser = null;
        int count = 0;

        if (users.containsKey(user.getId())) {
            for (User currentUser : this.users.values()) {
                if (currentUser.equals(user)) {
                    continue;
                }

                HashSet<Interest> userInterests = new HashSet<>(user.getInterests());
                userInterests.retainAll(currentUser.getInterests());

                if (mostSimilarUser == null || userInterests.size() > count) {
                    mostSimilarUser = currentUser;
                    count = userInterests.size();
                }
            }
        }

        return mostSimilarUser;
    }

    @Override
    public String toString() {
        return "TinderLike{" +
                "users=" + users +
                '}';
    }
}
