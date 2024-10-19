import java.awt.*;
import javax.swing.*;

public class Chomp extends JFrame {
    private ChompGame game;
    private JTextField display;
    private Player players[];
    private int currentPlayer;
    private JButton newGameButton; // Button to start a new game

    public Chomp() {
        Container c = getContentPane();

        display = new JTextField(20);
        display.setBackground(Color.YELLOW);
        display.setEditable(false);
        c.add(display, BorderLayout.NORTH);

        BoardPanel board = new BoardPanel();
        c.add(board, BorderLayout.CENTER);

        game = new ChompGame(board);

        HumanPlayer human = new HumanPlayer(this, game, board);
        ComputerPlayer computer = new ComputerPlayer(this, game, board);
        computer.setStrategy(new Chomp4by7Strategy());

        players = new Player[2];
        players[0] = human;
        players[1] = computer;
        currentPlayer = 0;

        display.setText("You go first...");

        // Create a new game button
        newGameButton = new JButton("New Game");
        newGameButton.addActionListener(e -> startNewGame());
        c.add(newGameButton, BorderLayout.SOUTH);

        players[currentPlayer].makeMove();
    }

    // Method to start a new game
    private void startNewGame() {
        game.reset(); // Assuming reset method in ChompGame resets the game state
        currentPlayer = 0; // Reset to the first player
        display.setText("You go first...");
        players[currentPlayer].makeMove();
    }

    // Called by the player when its move is completed.
    public void hasMoved() {
        currentPlayer = (currentPlayer + 1) % 2;
        Player p = players[currentPlayer];
        if (game.isWon()) {
            display.setText(p.getWinMessage() + " Press 'New Game' to play again.");
        } else {
            display.setText(p.getPrompt());
            p.makeMove();
        }
    }

    public static void main(String[] args) {
        Chomp window = new Chomp();
        window.setTitle("Chomp");
        window.setBounds(200, 200, 360, 300);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setVisible(true);
    }
}
