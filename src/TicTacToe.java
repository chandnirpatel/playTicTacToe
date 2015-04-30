import java.io.PrintStream;

/**
 * Created by cpatel on 4/30/15.
 */
public class TicTacToe {
    private PrintStream printStream;
    public TicTacToe(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void displayBoard() {
        printStream.println("  |   |\n_________\n  |   |\n_________\n  |   |");
    }
}
