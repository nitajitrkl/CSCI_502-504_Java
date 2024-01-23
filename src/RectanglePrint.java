public class RectanglePrint {
    public static void PrintRectangle(int height, int width, char ch){
        for (int i=0; i< height; i++){
            for (int j = 0; j< width; j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
