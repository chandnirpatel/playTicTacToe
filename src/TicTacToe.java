import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;


public class TicTacToe {
    private PrintStream printStream;
    private ReadUserInput readUserInput;
    private List<String> board = new ArrayList<>();

    public TicTacToe(PrintStream printStream, ReadUserInput readUserInput) {
        this.printStream = printStream;
        this.readUserInput = readUserInput;
        generateEmptyBoard();
    }

    private void generateEmptyBoard(){
        for (int location = 0; location < 9; location++) {
            board.add("  ");
        }
    }

    public void turn(){
        Integer location = readUserInput.locationFromUser();
        addUserMoveToBoard(location);
        displayBoard();
    }

    public void displayBoard() {
        String boardFormat = board.get(0) + "|" + board.get(1) +"|" + board.get(2)
                + "\n_________\n"
                + board.get(3) + "|" + board.get(4) + "|" + board.get(5)
                + "\n_________\n" + board.get(6) +"|"  + board.get(7) +"|" + board.get(8);

        printStream.println(boardFormat);
    }

    private boolean isEndOfTopTwoRows(int location) {
        return location < 9;
    }

    private boolean isNotEndOfRow(int location) {
        return location % 3 != 0;
    }

    private void addUserMoveToBoard(Integer location){
        board.add(location - 1,"X ");
    }


}
