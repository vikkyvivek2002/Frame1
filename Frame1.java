import java.awt.*;
class Frame1 extends Frame
{
 public static void main(String args[])
{
 Frame1 f1=new Frame1();
 f1.setTitle("Frame-1");
 f1.setSize(400,400);
 f1.setVisible(true);
 f1.setBackground(Color.pink);
}
public void paint(Graphics g)
{
 Font f=new Font("verdana",Font.BOLD,50);
g.setFont(f);
g.setColor(Color.red);
g.drawString("Welcome to ECE-D",150,250);
g.drawLine(100,100,200,100);
 g.setColor(Color.green);
g.drawRect(200,200,150,250);
g.fillRect(200,200,150,250);
 
g.setColor(Color.yellow);
g.drawRoundRect(100,100,100,50,20,30);
g.fillRoundRect(100,100,100,50,20,30);
g.setColor(Color.blue);
g.drawOval(150,150,100,50);
g.fillOval(150,150,100,50);
g.setColor(Color.red);
g.drawOval(200,200,150,150);
g.fillOval(200,200,150,150);
}
}