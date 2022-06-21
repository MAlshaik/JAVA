package sample;
import java.util.*;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Tetris extends Application {
    //vars
    public static final int MOVE = 25;
    public static final int SIZE = 25;
    public static int XMAX = SIZE * 12;
    public static int YMAX = SIZE * 24;
    public static int [][] MESH = new int [XMAX/ SIZE][YMAX/SIZE];
    private static Pane group = new Pane();
    private static Form Object;
    private static  Scene scene = new Scene(gorup, XMAX + 150, YMAX);
    public static int score = 0;

    @Override
    public void start(Stage stage) throws Exception {

    }
}
