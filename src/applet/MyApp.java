package applet;

import processing.core.PApplet;

public class MyApp extends PApplet {

    public void settings() {
        size(400, 400);
    }

    public void  setup(){
        background(0);
        smooth(1);
    }

    public void draw(){
        strokeWeight(1);
        stroke(255);
        line(0, 0, width, height);
    }
}
