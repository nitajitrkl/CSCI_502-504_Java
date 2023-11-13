public class Prime_HW {
    public Prime_HW (){
        i = 1;
    }
    public int nextPrime(){
        do{
            i++;
        } while(!isPrime());
        return i;
    }
    public boolean isPrime(){
        if (i<=1){
            return false;
        }
        if (i > 2 && i%2==0){
            return false;
        }
        for (int j = 2; j <= Math.sqrt(i); j++){
            if (i%j == 0) return false;
        }
        return true;
    }
    public int i;
}
