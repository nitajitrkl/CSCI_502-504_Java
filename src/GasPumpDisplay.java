public class GasPumpDisplay{
    public GasPumpDisplay (int numberOfPosition){
//        if (numberOfPosition > 1)
//            tail = new GasPumpDisplay(numberOfPosition-1);
        digits = numberOfPosition;
        max = 0;
        currentDigit = 0;
        while (numberOfPosition > 0){
            max = (int) (max + MAX_DIGIT * Math.pow(10, numberOfPosition - 1));
            numberOfPosition--;
        }
    }
    public String nextElement (){
        boolean status = false;
        int x = currentDigit;
        String number = Integer.toString(currentDigit);
        while(x != 0)
        {
            if (x % 10 > MAX_DIGIT) {
                status = true;
//                tail.nextElement();
                break;
            }
            x /= 10;
        }
        if(!status)
        {
            double i = 1;
            StringBuilder numberBuilder = new StringBuilder(number);
            while (i < digits){
                if(currentDigit < Math.pow(10,i)){
                    for (int j = 0; j < (digits - i); j++)
                        numberBuilder.insert(0, "0");
                    break;
                }
                i++;
            }
            number = numberBuilder.toString();
        }
        else number = "";
        currentDigit++;
        return number;
    }
    public Boolean hasMoreElements (){
        return((currentDigit) <= max);
    }

    private final int digits;
    private GasPumpDisplay tail;
    private int currentDigit;
    private static final int MAX_DIGIT = 4;
    private int max;
}