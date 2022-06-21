import java.awt.*;

public class MainFrame extends javax.swing.JFrame{

    public MainFrame() {
        GamePanel gamePanel = new GamePanel();
        gamePanel.setLocation(0,0);
        gamePanel.setSize(this.getSize());
        gamePanel.setBackground(Color.LIGHT_GRAY);
        gamePanel.setVisible(true);
        this.add(gamePanel);
    }
}
