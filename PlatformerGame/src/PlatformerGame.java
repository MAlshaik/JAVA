import java.awt.*;

public class PlatformerGame {
    public static void main(String[] args) {
        MainFrame frame = new MainFrame();

        frame.setSize(700, 700);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("Platformer Game");
        frame.setVisible(true);
    }
}
