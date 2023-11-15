import java.util.Random;
public class Die {
    public Die(int s) {
        sides = s;
        generator = new Random();
    }
    public int cast() {
        return 1 + generator.nextInt(sides);
    }
    private final int sides;
    private final Random generator;
}