public class Factorial_HW {
    public Factorial_HW (int n){
        number = n;
    }
    public long getFactorial (){
        long factorial = 1;
        for (int i = 1; i <= number; i++){
            factorial = factorial * i;
        }
        return factorial;
    }
    private final int number;
}
