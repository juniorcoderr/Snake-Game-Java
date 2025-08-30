package SnakeGame;

import javax.swing.*;

public class Snake extends JFrame {

    Snake() {
        super("Snake Game"); // super must be the first statement inside constructor

        add(new Board());
        pack(); // to refresh the frame

        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        new Snake().setVisible(true);
    }
}
