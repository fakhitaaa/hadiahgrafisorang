package grafis;
import java.awt.*;
public class tugaspboorang extends Panel{
tugaspboorang(){
}
public void paint (Graphics g) {
g.drawLine(350,400,550,400);
g.drawLine(450,350,450,500);
g.drawLine(450,500,350,550);
g.drawLine(450,500,550,550);
g.setColor(Color.PINK);
g.fillArc(400,270,100,100,0,360);
g.setColor(Color.RED);
g.fillArc(420,290,30,20,0,360);
g.fillArc(460,290,30,20,0,360);
g.setColor(Color.BLACK);
g.drawArc(420,330,60,20,0,-200);
g.drawArc(420,331,60,20,0,-200);
g.drawArc(420,332,60,20,0,-200);
g.drawArc(420,333,60,20,0,-200);
g.drawArc(420,334,60,20,0,-200);
g.drawArc(420,335,60,20,0,-200);
g.setColor(Color.RED);
g.drawLine(450,270,450,250);
g.drawLine(460,270,460,250);
g.drawLine(470,276,470,250);
g.drawLine(480,280,480,250);
g.drawLine(440,270,440,250);
g.drawLine(430,275,430,250);
g.drawLine(420,280,420,250);
}

public static void main(String[] args) {
Frame f = new Frame ("TUGAS PBO");
tugaspboorang gp = new tugaspboorang();
  f.add (gp);
   f.setSize (900, 900); 
   f. setVisible(true);
   }
   }