public class DieTester{
    public static void main(String[] args){
        Die d = new Die(6);
        final int TRIES = 10;
        for (int i = 1; i <= TRIES; i++)
        {
            System.out.print(d.cast() + " ");
        }
    }
}