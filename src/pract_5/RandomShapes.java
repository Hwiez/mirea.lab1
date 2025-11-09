package pract_5;

import javax.swing.*;

public class RandomShapes extends JFrame {
    public RandomShapes() {
        setTitle("Random Shapes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        ShapesPanel shapesPanel = new ShapesPanel();
        add(shapesPanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RandomShapes();
            }
        });
    }
}