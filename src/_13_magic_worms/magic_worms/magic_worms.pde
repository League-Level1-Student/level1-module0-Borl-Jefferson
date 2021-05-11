int d = 0;
void setup(){
size (1000, 1000);
background(#8F9090);
}
void draw(){
 makeMagical();
 for(int i = 0; i < 300; i++){

   float x = (int)random(100000);
   float y = (int)random(100000);
    fill(#00FF1F);
    noStroke();
   ellipse(y, x, 10, 10);
   d = d + 2;
 }
 

}
    float frequency = .001;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
