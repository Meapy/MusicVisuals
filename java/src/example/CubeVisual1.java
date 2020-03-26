package example;

import ie.tudublin.Visual;
import processing.core.PApplet;

public class CubeVisual1 extends Visual {

    float angle = 0;
    public void settings()
    {
        size(800,600, P3D);
    }

    public void setup()
    {
        startMinim();
        startListening();
        colorMode(HSB);
    }

    public void keyPressed(){

        if (key == ' '){
            getAudioPlayer().cue(0);
        }
    }

    public void draw(){
        background(0);
        stroke(map(getSmoothedAmplitude(),0,1,0,255),255,255,255);
        strokeWeight((5));
        noFill();
        lights();
        translate(width/2, height /2, 0);
        rotateX(angle);
        rotateY(angle);
        box(getSmoothedAmplitude() * 100);

        angle += 0.01f;
    }

    public static void main (String...args){
        PApplet.main("example.CubeVisual1");
    }

}
