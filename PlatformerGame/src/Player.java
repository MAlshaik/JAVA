import java.awt.*;

public class Player {
    GamePanel panel;

    int x;
    int y;
    int width;
    int height;

    double xspeed;
    double yspeed;

    Rectangle hitBox;

    boolean keyLeft;
    boolean keyRight;
    boolean keyUp;
    boolean keyDown;

    public Player(int x, int y, GamePanel panel){
        this.panel = panel;
        this.x = x;
        this.y = y;

        width = 50;
        height = 100;
        hitBox = new Rectangle(x,y, width, height);
    }

    public void set(){

        x += xspeed;
        y += yspeed;

        hitBox.x = x;
        hitBox.y = y;
    }

    public void draw(Graphics2D gtd){
        gtd.setColor(Color.BLACK);
        gtd.fillRect(x, y, width, height);
    }
}
