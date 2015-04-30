import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by cpatel on 4/30/15.
 */
public class TicTacToeTest {

    @Test
    public void shouldDisplayTicTacToeBoard() {
        PrintStream printStream = mock(PrintStream.class);
        TicTacToe ticTacToe = new TicTacToe(printStream);
        ticTacToe.displayBoard();
        verify(printStream).println("  |   |\n_________\n  |   |\n_________\n  |   |");

    }




}