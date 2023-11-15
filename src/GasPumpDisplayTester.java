public class GasPumpDisplayTester{
    public static void main (String[] args){
        GasPumpDisplay d = new GasPumpDisplay(3);
        int count = 0;
        while(d.hasMoreElements()) {
            String word = d.nextElement();
            if(!word.isEmpty()){
                System.out.print(word + " ");
                count++;
                if((count % 20) == 0)
                    System.out.println();
            }
        }
    }
}