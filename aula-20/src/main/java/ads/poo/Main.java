package ads.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Main {
    static void main() throws InterruptedException {

        Draw draw = new Draw();
        draw.setCanvasSize(800,800);
        draw.setYscale(0,800);
        draw.setXscale(0,800);
        draw.setPenColor(Color.lightGray);

        draw.enableDoubleBuffering();

//
//        draw.circle(400,400,100);
//
//        draw.setPenColor(Color.RED);
//        draw.filledCircle(400,400,50);
//
//        draw.rectangle(400,400,250,130);
//
//        double [] x  = {100, 150, 250, 300};
//        double [] y  = {100, 150, 150, 100};
//
//        draw.filledPolygon(x,y);

        for(int i = 0; i<800; i+=5) {

            draw.line(i,0,i,800);
            draw.line(0,i,800,i);
        }
        draw.show();

//        draw.setFontSize(30);
//        draw.text(400,400,"POO");
//        draw.show();
        draw.setPenColor(Color.RED);
        for (int i = 0; i < 10; i++) {
            draw.clear();
            draw.text(400,400,"" + i);
            draw.show();
//            TimeUnit.SECONDS.sleep(1);
        }
        draw.filledCircle(350,500,50);
        draw.filledCircle(450,500,50);

        double [] x = {300,400,500};
        double [] y = {500,300,500};
        draw.filledPolygon(x, y);
        draw.show();
    }
}
