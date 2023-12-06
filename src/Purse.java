import java.util.ArrayList;

public class Purse {

    public Purse() {
        coins = new ArrayList<String>();
    }

    public void add(String coinName) {
        coins.add(coinName);
    }

    public String toStrng() {
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
    public boolean sameContents(Purse other){
        if (coins.size() == ((Purse) other).coins.size()) {
            for (int i = 0; i < coins.size(); i++)
                if (!coins.get(i).equals(((Purse) other).coins.get(i)))
                    return false;
        }
        else
            return false;
        return true;
    }

    private final ArrayList<String> coins;
}