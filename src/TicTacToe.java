import java.util.Objects;

public class TicTacToe {
    public TicTacToe() {
        board = new String[BOARD_SIZE][BOARD_SIZE];
        for(int r = 0; r < BOARD_SIZE; r++) {
            for(int c = 0; c < BOARD_SIZE; c++) {
                board[r][c] = BLANK_SQUARE;
            }
        }
    }
    public void setMark(String m, int r, int c) {
        if(Objects.equals(board[r][c], BLANK_SQUARE)) {
            board[r][c] = m;
        }
    }
    public String toString() {
        StringBuilder temp = new StringBuilder();
        for(int r = 0; r < BOARD_SIZE; r++) {
            temp.append("|");
            for(int c = 0; c < BOARD_SIZE; c++) {
                temp.append(board[r][c]).append("|");
            }
            temp.append("\n");
        }
        return temp.toString();
    }
    private String[][] board;
    public static final int BOARD_SIZE = 3;
    public static final String BLANK_SQUARE = "";
}