import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
	
	PImage imgBackground;


  public void settings() {
    size(400, 400);
    
  }

 
  public void setup() {
    imgBackground = loadImage("Background.webp");


  }

 
  public void draw() {
   background(128);
    image(imgBackground, 0, 0);

    


  }
  
  // define other methods down here.
}