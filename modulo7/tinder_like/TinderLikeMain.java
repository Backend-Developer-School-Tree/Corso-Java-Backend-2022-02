import java.util.Arrays;
import java.util.HashSet;

public class TinderLikeMain {
    public static void main(String[] args) {
        TinderLike tinderLike = new TinderLike();

        Interest i1 = new Interest("Calcio");
        Interest i2 = new Interest("Tennis");
        Interest i3 = new Interest("Ping Pong");
        Interest i4 = new Interest("Pesca");
        Interest i5 = new Interest("Libri");
        Interest i6 = new Interest("Informatica");
        Interest i7 = new Interest("Serie TV");
        Interest i8 = new Interest("Cinema");
        Interest i9 = new Interest("Bricolage");
        Interest i10 = new Interest("Dormire");

        HashSet<Interest> interest1Set = new HashSet<>(Arrays.asList(i1, i2, i3, i4, i5, i6, i7));
        User u1 = tinderLike.insertUserWithInterests("Marco", interest1Set);

        HashSet<Interest> interest2Set = new HashSet<>(Arrays.asList(i1, i2, i8, i9, i10));
        User u2 = tinderLike.insertUserWithInterests("Paola", interest2Set);

        HashSet<Interest> interest3Set = new HashSet<>(Arrays.asList(i5, i6, i7, i8, i9));
        User u3 = tinderLike.insertUserWithInterests("Filippo", interest3Set);

        System.out.println(tinderLike);
        System.out.println(tinderLike.getMostSimilarUser(u3));

        tinderLike.removeUser(u1);
        System.out.println(tinderLike.getMostSimilarUser(u3));
    }
}
