import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;



public class blue extends Canvas implements MouseMotionListener, MouseListener {


        int[] tempx = new int[2];
        int[] tempy = new int[2];
     int x;
     int y;
     int width;
     int height;


        public  void draw(Graphics g) {
            Graphics2D g2d = (Graphics2D)g;
            x = 350;
            y = 350;
            width = 100;
            height = 50;

            g2d.setColor(Color.blue);
            g2d.fillRect(x,y,width,height);


        }

        blue()
        {
            addMouseListener(this);
            addMouseMotionListener(this);
        }





        @Override
        public void mouseClicked(MouseEvent e) {

        }
        @Override
        public void mousePressed(MouseEvent e) {
            tempx[0] = e.getX();
            tempy[0]=e.getY();
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

            tempx[1]= e.getX();
            tempy[1] = e.getY();
            setLocation(getLocation().x+(tempx[1]-tempx[0]),getLocation().y+(tempy[1]-tempy[0]));
        }

        @Override
        public void mouseMoved(MouseEvent e) {

        }

    }
