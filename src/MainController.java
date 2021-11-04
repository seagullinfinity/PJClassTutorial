import applet.MyApp;
import refapp.ImageBoard;

public class MainController extends MyApp {
    public static void main(String[] args) {
        MyApp.main(java.lang.invoke.MethodHandles.lookup().lookupClass());
    }

    ImageBoard imageboard;

    @Override
    public void settings() {
        size(200, 200);
    }

    @Override
    public void setup() {
        imageboard = new ImageBoard(this);
        imageboard.setup();
    }

    @Override
    public void draw() {
        imageboard.draw();
    }

    @Override
    public void keyPressed() {
        if (key == ESC) {
            exit();
        }
    }
}