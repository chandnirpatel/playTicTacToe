import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;


public class TicTacToe {
    private PrintStream printStream;
    private ReadUserInput readUserInput;
    private List<String> board = new ArrayList<>();
    private int turnCounter = 0;

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

    private void turn(){
        turnCounter++;
        Integer location = getValidLocation();
        if (turnCounter % 2 == 1){
            addUserXMoveToBoard(location);
        } else {
            addUserOMoveToBoard(location);
        }
        displayBoard();
    }

    private Integer getValidLocation() {
        Integer location = readUserInput.locationFromUser();

        if (isTaken(location)){
            printStream.println("Location already taken");
            location = readUserInput.locationFromUser();
        }
        return location;
    }

    private boolean isTaken(Integer location) {
        String currentValue = board.get(location - 1);
        boolean isBlank = "  ".equals(currentValue);
        return !isBlank;
    }

    public void displayBoard() {
        String boardFormat = board.get(0) + "|" + board.get(1) +"|" + board.get(2)
                + "\n_________\n"
                + board.get(3) + "|" + board.get(4) + "|" + board.get(5)
                + "\n_________\n" + board.get(6) +"|"  + board.get(7) +"|" + board.get(8);
        printStream.println(boardFormat);
    }

    private void addUserOMoveToBoard(Integer location) {
        board.add(location - 1, "O");
    }

    private void addUserXMoveToBoard(Integer location){
        board.add(location - 1,"X ");
    }

    public void play() {
        turn();
        turn();
    }
}
