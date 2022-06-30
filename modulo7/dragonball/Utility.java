import java.util.Random;

public class Utility {
    public static int getRandomIntByMax(int max) {
        return new Random().nextInt(max + 1);
    }
}
