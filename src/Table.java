import com.sun.javaws.util.JfxHelper;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.concurrent.RecursiveAction;

public class Table extends JPanel
{
    ArrayList<Rectangle> rectangles = new ArrayList();


    public Table()
    {
        int width = 70;

        /*Color wood = new Color(150,111,51);
        setBackground(wood);*/

        rectangles.add(new Rectangle(25,25,width,width));
        rectangles.add(new Rectangle(25+95,25,width,width));
        rectangles.add(new Rectangle(25+95*2,25,width,width));
        rectangles.add(new Rectangle(25+95*3,25,width,width));
        rectangles.add(new Rectangle(25+95*4,25,width,width));
        rectangles.add(new Rectangle(25+95*5,25,width,width));
        rectangles.add(new Rectangle(25,25+95,width,width));
        rectangles.add(new Rectangle(25+95*2,25+95,width,width));
        rectangles.add(new Rectangle(25+95*3,25+95,width,width));
        rectangles.add(new Rectangle(25+95*4,25+95,width,width));
        rectangles.add(new Rectangle(25+95*5,25+95,width,width));
        rectangles.add(new Rectangle(25,25+95*2,width,width));
        rectangles.add(new Rectangle(25+95,25+95*2,width,width));
        rectangles.add(new Rectangle(25+95*2,25+95*2,width,width));
        rectangles.add(new Rectangle(25+95*3,25+95*2,width,width));
        rectangles.add(new Rectangle(25+95*4,25+95*2,width,width));
        rectangles.add(new Rectangle(25+95*5,25+95*2,width,width));
        rectangles.add(new Rectangle(25,25+95*3,width,width));
        rectangles.add(new Rectangle(25+95,25+95*3,width,width));
        rectangles.add(new Rectangle(25+95*2,25+95*3,width,width));
        rectangles.add(new Rectangle(25+95*3,25+95*3,width,width));
        rectangles.add(new Rectangle(25+95*4,25+95*3,width,width));
        rectangles.add(new Rectangle(25+95*5,25+95*3,width,width));
        rectangles.add(new Rectangle(25,25+95*4,width,width));
        rectangles.add(new Rectangle(25+95,25+95*4,width,width));
        rectangles.add(new Rectangle(25+95*2,25+95*4,width,width));
        rectangles.add(new Rectangle(25+95*3,25+95*4,width,width));
        rectangles.add(new Rectangle(25+95*4,25+95*4,width,width));
        rectangles.add(new Rectangle(25+95*5,25+95*4,width,width));
        rectangles.add(new Rectangle(25,25+95*5,width,width));
        rectangles.add(new Rectangle(25+95,25+95*5,width,width));
        rectangles.add(new Rectangle(25+95*2,25+95*5,width,width));
        rectangles.add(new Rectangle(25+95*3,25+95*5,width,width));
        rectangles.add(new Rectangle(25+95*4,25+95*5,width,width));
        rectangles.add(new Rectangle(25+95*5,25+95*5,width,width));

        setLayout(null);


        repaint();




    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
        for (int r = 0; r < rectangles.size(); r++) {

            if (StartScreen.card.list.get(r).color.equalsIgnoreCase("pink")){
            g.setColor(Color.pink);
                g.fillRect(rectangles.get(r).x, rectangles.get(r).y, rectangles.get(r).width, rectangles.get(r).height);}
            else if (StartScreen.card.list.get(r).color.equalsIgnoreCase("blue")) {
                g.setColor(Color.blue);
                g.fillRect(rectangles.get(r).x, rectangles.get(r).y, rectangles.get(r).width, rectangles.get(r).height);
            }else
                {
                    g.setColor(Color.black);
                    g.fillRect(rectangles.get(r).x, rectangles.get(r).y, rectangles.get(r).width, rectangles.get(r).height);
                }






        }
    }
}
