import java.awt.*;
import java.applet.*;
/*<applet code="mouse" width="200" height="200">
</applet>*/
public class mouse extends Applet implements MouseListener
{
string msg;
int x,y;
public void init()
{
addMouseListener(this);
}
public void mouseClicked(MouseEvent me)
{
x=me.getX();
y=me.getY();
}
public void mouseEntered(MouseEvent me)
{}
public void mouseExited(MouseEvent me)
{}
public void mousePressed(MouseEvent me)
{}
public void mouseReleased(MouseEvent me)
{}
public void paint (Graphics g)
{
msg="mouse Clicked at "+x+" and "+y;
g.drawString(msg,100,100);
showStatus(msg);
}
}
