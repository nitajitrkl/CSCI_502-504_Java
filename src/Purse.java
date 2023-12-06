import java.util.ArrayList;

public class Purse {

    public Purse() {
        coins = new ArrayList<String>();
    }

    public void add(String coinName) {
        coins.add(coinName);
    }

    public String toString() {
        if (coins.isEmpty())
            return "Purse[]";
        String output = "Purse[";
        for (String coin : coins) {
            output = output + coin + ",";
        }
        output = output.substring(0, output.length() - 1);
        return output + "]";
    }

    public void reverse() {
        int i = 0;
        int j = coins.size() - 1;
        while (i < j) {
            String temp = coins.get(i);
            coins.set(i, coins.get(j));
            coins.set(j, temp);
            i++;
            j--;
        }
    }

    private final ArrayList<String> coins;
}