import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Camera implements KeyListener{
    public double xpos, ypos, xDir, yDir, xPlane, yPlane;
    public boolean left, right, forward, back;
    public final double MOVE_SPEED = .08;
    public final double ROTATION_SPEED = .045;
}
