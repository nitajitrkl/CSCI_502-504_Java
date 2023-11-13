public class Gpd {
    public Gpd (int numberOfPosition){
        if (numberOfPosition > 1)
            tail = new Gpd(numberOfPosition-1);
        digits = numberOfPosition;
        currentDigit = 0;
    }
    public String nextElement (){
        String display = Integer.toString(currentDigit);
        for (int i = display.length(); i < digits; i++){
            display = "0" + display;
        }
        currentDigit +=1;
        return display;
    }
    public Boolean hasMoreElements (){
        if((currentDigit) > MAX_DIGIT && digits > 0) {
            currentDigit = 0;
            tail.nextElement();
            return false;
        }
        else if(currentDigit == MAX_DIGIT && digits == 1) {
            return false;
        } else {
            return true;
        }
    }
    private int digits;
    private Gpd tail;
    private int currentDigit;
    private static final int MAX_DIGIT = 4;
}
