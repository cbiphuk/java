public class ColorIntro
{
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle(20, 70, 40, 30);
        Rectangle box2 = new Rectangle(60, 70, 40, 30);
        Rectangle box3 = new Rectangle(100, 70, 40, 30);
        Rectangle box4 = new Rectangle(40, 40, 40, 30);
        Rectangle box5 = new Rectangle(80, 40, 40, 30);
        Rectangle box6 = new Rectangle(60, 10, 40, 30);
        
        box.draw();
        box2.draw();
        box3.draw();
        box4.draw();
        box5.draw();
        box6.draw();
        
        box.setColor(new Color(0, 0, 255));
        box.fill();
        box2.setColor(Color.MAGENTA);
        box2.fill();
        box3.setColor(Color.CYAN);
        box3.fill();
        box4.setColor(new Color(255, 0, 0));
        box4.fill();
        box5.setColor(Color.PINK);
        box5.fill();
        box6.setColor(new Color(125, 125, 255));
        box6.fill();
    }
}