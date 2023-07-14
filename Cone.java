import java.io.*;
import java.awt.*;;
import java.applet.*;

public class Cone extends Applet
{
   public void paint(Graphics g)
   {
     setBackground(Color.yellow);
     g.setColor(Color.black);

    g.drawOval(100,40,100,25);
    g.drawLine(100,50,150,250);
    g.drawLine(200,50,150,250);
   }
}
/*<Applet code="Cone.class" WIDTH="400" HEIGHT="200"></Applet>*/
