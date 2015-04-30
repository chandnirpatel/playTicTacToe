import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by cpatel on 4/30/15.
 */
public class TicTacToe {
    private PrintStream printStream;
    private ReadUserInput readUserInput = new ReadUserInput();
    private ArrayList<String> board = new ArrayList<>();

    public TicTacToe(PrintStream printStream, ReadUserInput readUserInput) {
        this.printStream = printStream;
        generateEmptyBoard();
    }

    private void generateEmptyBoard(){
        for (int location = 0; location < 9 ; location++) {
            board.add("  ");
        }
    }

    public void displayBoard() {
        String boardForamt = "";
        for (int location = 1; location <=9 ; location++) {
            boardForamt += board.get(location-1);
            if (location % 3 != 0){
                boardForamt += "|";
            } else if (location < 9) {
                boardForamt += "\n_________\n";
            }
        }
        printStream.println(boardForamt);
    }

    public void turn(){
        addUserMoveToBoard(readUserInput.locationFromUser());
        displayBoard();
    }

    private ArrayList<String> addUserMoveToBoard(Integer location){
        board.add(location - 1,"X");
        return null;
    }



}
