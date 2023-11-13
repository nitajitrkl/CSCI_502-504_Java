public class TriangularShapeCon {
    public TriangularShapeCon (int n){
        num = n;
    }
    public void printShape (){
        String r = "";
        for (int i=1; i<=num;i++){
            for (int j=1;j<=i;j++){
                r += "[]";
            }
            if (i <num)
                r += "\n";
        }
        System.out.print(r);
    }
    private final int num;
}
