public class NeedleTester {
    public static void main(String[] args) {
        Needle n = new Needle();
        final int TRIES1 = 1000000;
        final int TRIES2 = 2000000;
        for (int i = 1; i <=TRIES1; i++){
            n.drop();
        }
        System.out.printf("Tries = %d, Tries/Hits = %8.5f\n", TRIES1,(double)n.getTries()/n.getHits());
        for (int i = 1; i <=TRIES2; i++){
            n.drop();
        }
        System.out.printf("Tries = %d, Tries/Hits = %8.5f\n", TRIES2,(double)n.getTries()/n.getHits());
    }
}
