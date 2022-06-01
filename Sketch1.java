import processing.core.PApplet;
import processing.core.PImage;

public class Sketch1 extends PApplet {
	
	PImage imgBackground;
  PImage imgApples;
  PImage imgMonkey;
  PImage imgHeart;



  //Apples
  float fltApplesX = -100;
  float fltApplesY = 0;

  float circleX = 150;
float circleT = 150;
float[] circleY = new float[25];

    float MonkeyX = 150;
float MonkeyY = 150;

  public void settings() {
    size(400, 400);
    
  }

  

 
  public void setup() {
    imgBackground = loadImage("Background.jpg");

    imgHeart = loadImage("Heart.png");
    imgHeart.resize(10,10);

    imgApples = loadImage("Apples.png");
    imgApples.resize(20,20);

    imgMonkey = loadImage("Monkey.png");
     imgMonkey.resize(100,100);

        background(210, 255, 173);
     for (int i = 0; i < circleY.length; i++) {
    circleY[i] = random(height);
     }
  }

 
  public void draw() {
    //background
   background(128);
    image(imgBackground, 0, 0);

    fill(0,255,0);
    ellipse(0,0,50,50);

     
    


 //falling
fill(255);
  for (int i = 0; i < circleY.length; i++) {
    float circleX = width * i / circleY.length;
    image(imgApples,circleX,circleY[i]);

    circleY[i]++;
    if(circleY[i]>=height){
      circleY[i]=1;
    }

  }
  
    if (keyPressed) {
    if (keyCode == UP) {
      MonkeyY--;
    } 
    else if (keyCode == DOWN) {
      MonkeyY++;
    } 
    else if(keyCode == LEFT){
      MonkeyX--;
    }
    else if(keyCode == RIGHT){
     MonkeyX++; 
    }
  } 

  image(imgMonkey,MonkeyX,MonkeyY);
    
  
    image(imgHeart,380,10);
    image(imgHeart,370,10);
    image(imgHeart,360,10);
} 
    
    // define other methods down here.
}
