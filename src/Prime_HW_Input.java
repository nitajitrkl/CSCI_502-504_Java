public class Prime_HW_Input {
    public Prime_HW_Input (int n){
        number = n;
    }
    public boolean isPrime(){
        if (number <= 1){
            return false;
        } else {
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    private final int number;
}
