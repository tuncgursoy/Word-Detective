import com.sun.javaws.util.JfxHelper;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.concurrent.RecursiveAction;

public class Table extends JPanel
{
     private ArrayList<Rectangle> rectangles = new ArrayList();


    public Table()
    {
        setLayout(null);

        int width = 70;
        int height = width;

        Color wood = new Color(150,111,51);
        setBackground(wood);

        rectangles.add(new Rectangle(25,25,width,height));
        rectangles.add(new Rectangle(25+95,25,width,height));
        rectangles.add(new Rectangle(25+95*2,25,width,height));
        rectangles.add(new Rectangle(25+95*3,25,width,height));
        rectangles.add(new Rectangle(25+95*4,25,width,height));
        rectangles.add(new Rectangle(25+95*5,25,width,height));
        rectangles.add(new Rectangle(25,25+95,width,height));
        rectangles.add(new Rectangle(25+95*2,25+95,width,height));
        rectangles.add(new Rectangle(25+95*3,25+95,width,height));
        rectangles.add(new Rectangle(25+95*4,25+95,width,height));
        rectangles.add(new Rectangle(25+95*5,25+95,width,height));
        rectangles.add(new Rectangle(25,25+95*2,width,height));
        rectangles.add(new Rectangle(25+95,25+95*2,width,height));
        rectangles.add(new Rectangle(25+95*2,25+95*2,width,height));
        rectangles.add(new Rectangle(25+95*3,25+95*2,width,height));
        rectangles.add(new Rectangle(25+95*4,25+95*2,width,height));
        rectangles.add(new Rectangle(25+95*5,25+95*2,width,height));
        rectangles.add(new Rectangle(25,25+95*3,width,height));
        rectangles.add(new Rectangle(25+95,25+95*3,width,height));
        rectangles.add(new Rectangle(25+95*2,25+95*3,width,height));
        rectangles.add(new Rectangle(25+95*3,25+95*3,width,height));
        rectangles.add(new Rectangle(25+95*4,25+95*3,width,height));
        rectangles.add(new Rectangle(25+95*5,25+95*3,width,height));
        rectangles.add(new Rectangle(25,25+95*4,width,height));
        rectangles.add(new Rectangle(25+95,25+95*4,width,height));
        rectangles.add(new Rectangle(25+95*2,25+95*4,width,height));
        rectangles.add(new Rectangle(25+95*3,25+95*4,width,height));
        rectangles.add(new Rectangle(25+95*4,25+95*4,width,height));
        rectangles.add(new Rectangle(25+95*5,25+95*4,width,height));
        rectangles.add(new Rectangle(25,25+95*5,width,height));
        rectangles.add(new Rectangle(25+95,25+95*5,width,height));
        rectangles.add(new Rectangle(25+95*2,25+95*5,width,height));
        rectangles.add(new Rectangle(25+95*3,25+95*5,width,height));
        rectangles.add(new Rectangle(25+95*4,25+95*5,width,height));
        rectangles.add(new Rectangle(25+95*5,25+95*5,width,height));









    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2d = (Graphics2D) g.create();

        for (int r = 0; r < 25; r++) {



            if (Card.list.get(r).color.equalsIgnoreCase("pink")){
                System.out.println("pink");
            g2d.setColor(Color.pink);
                g2d.fillRect(rectangles.get(r).x, rectangles.get(r).y, rectangles.get(r).width, rectangles.get(r).height);}
            else if (Card.list.get(r).color.equalsIgnoreCase("blue")) {
                System.out.println("blue");
                g2d.setColor(Color.blue);
                g2d.fillRect(rectangles.get(r).x, rectangles.get(r).y, rectangles.get(r).width, rectangles.get(r).height);
            }else
                {
                    System.out.println("black");
                    g2d.setColor(Color.black);
                    g2d.fillRect(rectangles.get(r).x, rectangles.get(r).y, rectangles.get(r).width, rectangles.get(r).height);
                }






        }
    }
}
