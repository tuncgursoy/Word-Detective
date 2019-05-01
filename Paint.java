import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class Paint extends JPanel implements MouseMotionListener,MouseListener   {


    int[] tempx = new int[2];
    int[] tempy = new int[2];









     ArrayList<Rectangle> Stringrectangles = new ArrayList<>();

    ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();


    public Paint()
        {
            Stringrectangles.add(new Rectangle(150,90,100,80));
            Stringrectangles.add(new Rectangle(150*2,90,100,80));
            Stringrectangles.add(new Rectangle(150*3,90,100,80));
            Stringrectangles.add(new Rectangle(150*4,90,100,80));
            Stringrectangles.add(new Rectangle(150*5,90,100,80));
            Stringrectangles.add(new Rectangle(150,90*2,100,80));
            Stringrectangles.add(new Rectangle(150*2,90*2,100,80));
            Stringrectangles.add(new Rectangle(150*3,90*2,100,80));
            Stringrectangles.add(new Rectangle(150*4,90*2,100,80));
            Stringrectangles.add(new Rectangle(150*5,90*2,100,80));
            Stringrectangles.add(new Rectangle(150,90*3,100,80));
            Stringrectangles.add(new Rectangle(150*2,90*3,100,80));
            Stringrectangles.add(new Rectangle(150*3,90*3,100,80));
            Stringrectangles.add(new Rectangle(150*4,90*3,100,80));
            Stringrectangles.add(new Rectangle(150*5,90*3,100,80));
            Stringrectangles.add(new Rectangle(150,90*4,100,80));
            Stringrectangles.add(new Rectangle(150*2,90*4,100,80));
            Stringrectangles.add(new Rectangle(150*3,90*4,100,80));
            Stringrectangles.add(new Rectangle(150*4,90*4,100,80));
            Stringrectangles.add(new Rectangle(150*5,90*4,100,80));
            Stringrectangles.add(new Rectangle(150,90*5,100,80));
            Stringrectangles.add(new Rectangle(150*2,90*5,100,80));
            Stringrectangles.add(new Rectangle(150*3,90*5,100,80));
            Stringrectangles.add(new Rectangle(150*4,90*5,100,80));
            Stringrectangles.add(new Rectangle(150*5,90*5,100,80));



            rectangles.add( new Rectangle(375, 550, 100, 80) );
            rectangles.add( new Rectangle(375, 550, 100, 80) );
            rectangles.add( new Rectangle(375, 550, 100, 80) );
            rectangles.add( new Rectangle(375, 550, 100, 80) );
            rectangles.add( new Rectangle(375, 550, 100, 80) );
            rectangles.add( new Rectangle(375, 550, 100, 80) );
            rectangles.add( new Rectangle(375, 550, 100, 80) );
            rectangles.add( new Rectangle(375, 550, 100, 80) );
            rectangles.add( new Rectangle(375, 550, 100, 80) );
            rectangles.add( new Rectangle(375, 550, 100, 80) );
            rectangles.add( new Rectangle(375, 550, 100, 80) );
            rectangles.add( new Rectangle(375, 550, 100, 80) );


            rectangles.add( new Rectangle(525, 550, 100, 80) );
            rectangles.add( new Rectangle(525, 550, 100, 80) );
            rectangles.add( new Rectangle(525, 550, 100, 80) );
            rectangles.add( new Rectangle(525, 550, 100, 80) );
            rectangles.add( new Rectangle(525, 550, 100, 80) );
            rectangles.add( new Rectangle(525, 550, 100, 80) );
            rectangles.add( new Rectangle(525, 550, 100, 80) );
            rectangles.add( new Rectangle(525, 550, 100, 80) );
            rectangles.add( new Rectangle(525, 550, 100, 80) );
            rectangles.add( new Rectangle(525, 550, 100, 80) );
            rectangles.add( new Rectangle(525, 550, 100, 80) );
            rectangles.add( new Rectangle(525, 550, 100, 80) );
            addMouseMotionListener(this);
            addMouseListener(this);
        }
        @Override
        protected void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            for (int a = 0;a<12;a++)
            {
                g.setColor(Color.pink);
                g.fillRect(rectangles.get(a).x,rectangles.get(a).y,rectangles.get(a).width,rectangles.get(a).height);
            }
            for (int a = 12;a<24;a++)
            {
                g.setColor(Color.blue);
                g.fillRect(rectangles.get(a).x,rectangles.get(a).y,rectangles.get(a).width,rectangles.get(a).height);

            }
            for (int r = 0 ; r<Stringrectangles.size();r++)
            {

                g.setColor(Color.BLACK);
                g.drawRect(Stringrectangles.get(r).x, Stringrectangles.get(r).y, Stringrectangles.get(r).width, Stringrectangles.get(r).height);
                g.drawString(StartScreen.card.list.get(r).CardString,Stringrectangles.get(r).x+Stringrectangles.get(r).width/2-10,Stringrectangles.get(r).y+Stringrectangles.get(r).height/2);

            }
        }




        Rectangle temp;
    @Override
    public void mouseClicked(MouseEvent e) {

    }
    @Override
    public void mousePressed(MouseEvent e) {
        for (Rectangle r: rectangles)
        {
            if (r.contains(e.getPoint())) {
            tempx[0] = e.getX();
            tempy[0] = e.getY();
            temp = r;

        }
        }

    }


    @Override
    public void mouseReleased(MouseEvent e) {


    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {


        for (Rectangle cv : rectangles)
        {

            if (temp == cv)
            {
                cv.setLocation(e.getX(),e.getY());
            }
        }

        System.out.println("release");
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

}


