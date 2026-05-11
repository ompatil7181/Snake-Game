package snakegame;

import javax.swing.JFrame;

public class App {

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        SnakeGame game = new SnakeGame();

        frame.add(game);
        frame.setTitle("Snake Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}