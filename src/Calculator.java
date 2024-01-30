public class Calculator {
    public Calculator(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public double add(){
        return num1+num2;
    }
    public double subtract(){
        return num1-num2;
    }
    public double multiply(){
        return num1*num2;
    }
    public double divide(){
        return num1/num2;
    }
    private final double num1;
    private final double num2;
}
