public class TriangularShape {
    public TriangularShape (int n){
        num = n;
    }
    public void printTriangle(){
        for (int i=0; i<num; i++)
        {
            for (int j=0; j<=i; j++){
                System.out.print("[]");
            }
            if (i < num-1)
                System.out.println();
        }
    }
    private final int num;
}
