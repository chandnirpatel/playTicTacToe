import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Matchers.startsWith;
import static org.mockito.Mockito.*;


public class TicTacToeTest {

    private PrintStream printStream;
    private ReadUserInput readUserInput;
    private TicTacToe ticTacToe;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        readUserInput = mock(ReadUserInput.class);
        ticTacToe = new TicTacToe(printStream, readUserInput);
    }

    @Test
    public void shouldDisplayTicTacToeBoard() {
        ticTacToe.displayBoard();
        verify(printStream).println("  |  |  \n_________\n  |  |  \n_________\n  |  |  ");
    }

    @Test
    public void shouldDisplayXfirstWhenUserInputs1(){
        when(readUserInput.locationFromUser()).thenReturn(1);

        ticTacToe.turn();

        verify(printStream).println(startsWith("X"));
    }

    @Test
    public void shouldDisplayXinSecondSlotWhenIInput2(){
        when(readUserInput.locationFromUser()).thenReturn(2);

        ticTacToe.turn();

        verify(printStream).println(startsWith("  |X"));
    }




}