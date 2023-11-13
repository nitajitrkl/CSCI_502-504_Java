public class GpdTester {
    public static void main(String[] args) {
        Gpd d = new Gpd(3);
        int count = 0;
        System.out.println("hello world");
        for ( int i= 0; i< 25; i++){
            while (d.hasMoreElements()) {
                System.out.print(d.nextElement() + " ");
                count++;
                if (count % 25 == 0) System.out.println();
            }
        }
    }
}
