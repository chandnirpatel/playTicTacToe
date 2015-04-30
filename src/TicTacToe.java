import java.io.PrintStream;
import java.util.ArrayList;


public class TicTacToe {
    private PrintStream printStream;
    private ReadUserInput readUserInput;
    private ArrayList<String> board = new ArrayList<>();

    public TicTacToe(PrintStream printStream, ReadUserInput readUserInput) {
        this.printStream = printStream;
        this.readUserInput = readUserInput;
        generateEmptyBoard();
    }

    private void generateEmptyBoard(){
        for (int location = 0; location < 9 ; location++) {
            board.add("  ");
        }
    }

    public void turn(){
        Integer location = readUserInput.locationFromUser();
        addUserMoveToBoard(location);
        displayBoard();
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

    private void addUserMoveToBoard(Integer location){
        board.add(location - 1,"X ");
    }



}
