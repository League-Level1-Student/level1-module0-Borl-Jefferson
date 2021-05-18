
void setup(){
background(#add8e6);
size (1000, 1000);
  
}
void draw(){

 makeMagical();
 for(int i = 0; i < 100; i++){

   float x = getWormX(i);
   float y = getWormY(i);
    fill(#000000);
    noStroke();
   ellipse(x, y, 10, 10);
   
 }
  makeMagical();
 for(int j = 0; j < 100; j++){

   float x = getWormX(j);
   float y = getWormY(j);
   y = y + 3;
   x = x + 3;
    fill(#FFFFFF);
    noStroke();
   ellipse(x, y, 10, 10);
   
 }

}
    float frequency = .0025;
    float noiseInterval = (6/2)*PI;

    void makeMagical() {
        fill( 255, 0, 0, 2 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
