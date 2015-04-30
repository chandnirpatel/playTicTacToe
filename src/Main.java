public class Main {

    public static void main(String[] args) {
        ReadUserInput readUserInput = new ReadUserInput();
        TicTacToe ticTacToe = new TicTacToe(System.out, readUserInput);
        ticTacToe.turn();

    }
}
