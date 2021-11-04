package refapp;

import applet.MyApp;
import processing.core.PApplet;
import processing.core.PImage;

public class ImageBoard {

    int x = 0;
    int ellapsedMillis = 1;
    int previousTime = 0;

    PImage webImg;
    MyApp p;

    public ImageBoard(MyApp p){
        this.p = p;
    }

    public void setup() {
        p.background(0);
        String url = "https://i.imgur.com/91TZLL0.png";
        webImg = p.loadImage(url, "png");
        webImg.resize(300, 300);
    }

    public void draw() {
        if (p.millis() - previousTime >= ellapsedMillis && x < 6) {
            if (webImg == null) {
                previousTime = p.millis();
                PApplet.println(x);
                x += 1;
            } else {
                p.getSurface().setSize(webImg.width, webImg.height);
                p.image(webImg, 0, 0);
            }
        }
    }
}