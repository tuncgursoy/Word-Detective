import java.awt.*;
import java.util.ArrayList;

public class Table extends Canvas
{
     private ArrayList<Rectangle> rectangles = new ArrayList();

    @Override
    public void paint(Graphics g) {
        Color wood = new Color(150,111,51);
        setBackground(wood);
        for (int i = 0 ; i<rectangles.size();i++)
        {
            if (Card.list.get(i).color.equalsIgnoreCase("blue"))
            {
                g.setColor(Color.blue);
                g.fillRect(rectangles.get(i).x, rectangles.get(i).y, rectangles.get(i).width, rectangles.get(i).height);
            }else if (Card.list.get(i).color.equalsIgnoreCase("pink"))
            {
                g.setColor(Color.pink);
                g.fillRect(rectangles.get(i).x, rectangles.get(i).y, rectangles.get(i).width, rectangles.get(i).height);
            }else if (Card.list.get(i).color.equalsIgnoreCase("black"))
                {
                    g.setColor(Color.darkGray);
                    g.fillRect(rectangles.get(i).x, rectangles.get(i).y, rectangles.get(i).width, rectangles.get(i).height);
                }
        }
    }

     Table()
    {


        int width = 70;
        int height = width;

        /*
        */

        rectangles.add(new Rectangle(25,25,width,height));
        rectangles.add(new Rectangle(25+95,25,width,height));
        rectangles.add(new Rectangle(25+95*2,25,width,height));
        rectangles.add(new Rectangle(25+95*3,25,width,height));
        rectangles.add(new Rectangle(25+95*4,25,width,height));

        rectangles.add(new Rectangle(25,25+95,width,height));
        rectangles.add(new Rectangle(25+95,25+95,width,height));
        rectangles.add(new Rectangle(25+95*2,25+95,width,height));
        rectangles.add(new Rectangle(25+95*3,25+95,width,height));
        rectangles.add(new Rectangle(25+95*4,25+95,width,height));

        rectangles.add(new Rectangle(25,25+95*2,width,height));
        rectangles.add(new Rectangle(25+95,25+95*2,width,height));
        rectangles.add(new Rectangle(25+95*2,25+95*2,width,height));
        rectangles.add(new Rectangle(25+95*3,25+95*2,width,height));
        rectangles.add(new Rectangle(25+95*4,25+95*2,width,height));

        rectangles.add(new Rectangle(25,25+95*3,width,height));
        rectangles.add(new Rectangle(25+95,25+95*3,width,height));
        rectangles.add(new Rectangle(25+95*2,25+95*3,width,height));
        rectangles.add(new Rectangle(25+95*3,25+95*3,width,height));
        rectangles.add(new Rectangle(25+95*4,25+95*3,width,height));

        rectangles.add(new Rectangle(25,25+95*4,width,height));
        rectangles.add(new Rectangle(25+95,25+95*4,width,height));
        rectangles.add(new Rectangle(25+95*2,25+95*4,width,height));
        rectangles.add(new Rectangle(25+95*3,25+95*4,width,height));
        rectangles.add(new Rectangle(25+95*4,25+95*4,width,height));











    }

}
