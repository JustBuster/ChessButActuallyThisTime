package Chess;

import javax.swing.JFrame;
import java.awt.*;

public class test {
    static JFrame window = new JFrame("Test program");

    public static JFrame getWindow() {
        window.setSize(1200, 900);
        window.setVisible(true);
        window.setLayout(new GridLayout());
        return window;
    }

    public static JFrame chessBoard() {
        window.setVisible(true);
        window.setSize(1000, 1000);
        window.setLocationRelativeTo(null);
        
    }


}
