import java.awt.*;
import  java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public class Texture {

    public static Texture wood = new Texture("res/wood.jpg", 64);
    public static Texture brick = new Texture("res/redbrick.jpg", 64);
    public static Texture bluestone = new Texture("res/bluestone.jpg", 64);
    public static Texture stone = new Texture("res/greystone.png", 64);

    public int[] pixels;
    private String loc;
    public int SIZE = 0;



    public Texture(String location, int size){
        loc = location;
        SIZE = size;
        pixels = new int[SIZE * SIZE];
        load();
    }

    private void load(){
        try {
            BufferedImage image = ImageIO.read(new File(loc));
            int w = image.getWidth();
            int h = image.getHeight();
            image.getRGB(0, 0, w, h, pixels, 0, w);
        } catch (IOException e ){
            e.printStackTrace();
        }
    }


}
