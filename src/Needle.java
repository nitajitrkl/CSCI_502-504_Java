import java.util.Random;

public class Needle {
    public Needle() {
        myHits = 0;
        myTries = 0;
        myGenerator = new Random();
    }
    public void drop() {
        double ylow = 2 * myGenerator.nextDouble();
        double angle = 180 * myGenerator.nextDouble();

        double yhigh = ylow + Math.sin(Math.toRadians(angle));
        if (yhigh >= 2) myHits++;
        myTries++;
    }
    public int getHits()
    {
        return myHits;
    }
    public int getTries()
    {
        return myTries;
    }
    private final Random myGenerator;
    private int myHits;
    private int myTries;
}