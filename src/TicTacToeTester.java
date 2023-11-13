import java.util.Scanner;

public class TicTacToeTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String player = "x";
        TicTacToe game = new TicTacToe();
        boolean done = false;
        while (!done){
            System.out.println(game.toString());
            System.out.println("Row for" + player + "(-1 to exit): ");
            int row = in.nextInt();
            if (row < 0){
                done = true;
            } else{
                System.out.println("Column for" + player + ": ");
                int column = in.nextInt();
                game.setMark(player, row, column);
                if (player.equals(game.toString())){
                    System.out.println("Hello");
                }
            }
        }
    }
}