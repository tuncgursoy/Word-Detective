import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;

public class Paint extends JPanel implements MouseMotionListener,MouseListener {

    private server server ;
    private client client;
    private int Port = 4566;
   JButton jButton ;




    int[] tempx = new int[2];
    int[] tempy = new int[2];


    ArrayList<Rectangle> Stringrectangles = new ArrayList<>();

    ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();


    public Paint() {

        Stringrectangles.add(new Rectangle(150, 90, 100, 80));
        Stringrectangles.add(new Rectangle(150 * 2, 90, 100, 80));
        Stringrectangles.add(new Rectangle(150 * 3, 90, 100, 80));
        Stringrectangles.add(new Rectangle(150 * 4, 90, 100, 80));
        Stringrectangles.add(new Rectangle(150 * 5, 90, 100, 80));
        Stringrectangles.add(new Rectangle(150, 90 * 2, 100, 80));
        Stringrectangles.add(new Rectangle(150 * 2, 90 * 2, 100, 80));
        Stringrectangles.add(new Rectangle(150 * 3, 90 * 2, 100, 80));
        Stringrectangles.add(new Rectangle(150 * 4, 90 * 2, 100, 80));
        Stringrectangles.add(new Rectangle(150 * 5, 90 * 2, 100, 80));
        Stringrectangles.add(new Rectangle(150, 90 * 3, 100, 80));
        Stringrectangles.add(new Rectangle(150 * 2, 90 * 3, 100, 80));
        Stringrectangles.add(new Rectangle(150 * 3, 90 * 3, 100, 80));
        Stringrectangles.add(new Rectangle(150 * 4, 90 * 3, 100, 80));
        Stringrectangles.add(new Rectangle(150 * 5, 90 * 3, 100, 80));
        Stringrectangles.add(new Rectangle(150, 90 * 4, 100, 80));
        Stringrectangles.add(new Rectangle(150 * 2, 90 * 4, 100, 80));
        Stringrectangles.add(new Rectangle(150 * 3, 90 * 4, 100, 80));
        Stringrectangles.add(new Rectangle(150 * 4, 90 * 4, 100, 80));
        Stringrectangles.add(new Rectangle(150 * 5, 90 * 4, 100, 80));
        Stringrectangles.add(new Rectangle(150, 90 * 5, 100, 80));
        Stringrectangles.add(new Rectangle(150 * 2, 90 * 5, 100, 80));
        Stringrectangles.add(new Rectangle(150 * 3, 90 * 5, 100, 80));
        Stringrectangles.add(new Rectangle(150 * 4, 90 * 5, 100, 80));
        Stringrectangles.add(new Rectangle(150 * 5, 90 * 5, 100, 80));


        rectangles.add(new Rectangle(375, 550, 100, 80));
        rectangles.add(new Rectangle(375, 550, 100, 80));
        rectangles.add(new Rectangle(375, 550, 100, 80));
        rectangles.add(new Rectangle(375, 550, 100, 80));
        rectangles.add(new Rectangle(375, 550, 100, 80));
        rectangles.add(new Rectangle(375, 550, 100, 80));
        rectangles.add(new Rectangle(375, 550, 100, 80));
        rectangles.add(new Rectangle(375, 550, 100, 80));
        rectangles.add(new Rectangle(375, 550, 100, 80));
        rectangles.add(new Rectangle(375, 550, 100, 80));
        rectangles.add(new Rectangle(375, 550, 100, 80));
        rectangles.add(new Rectangle(375, 550, 100, 80));


        rectangles.add(new Rectangle(525, 550, 100, 80));
        rectangles.add(new Rectangle(525, 550, 100, 80));
        rectangles.add(new Rectangle(525, 550, 100, 80));
        rectangles.add(new Rectangle(525, 550, 100, 80));
        rectangles.add(new Rectangle(525, 550, 100, 80));
        rectangles.add(new Rectangle(525, 550, 100, 80));
        rectangles.add(new Rectangle(525, 550, 100, 80));
        rectangles.add(new Rectangle(525, 550, 100, 80));
        rectangles.add(new Rectangle(525, 550, 100, 80));
        rectangles.add(new Rectangle(525, 550, 100, 80));
        rectangles.add(new Rectangle(525, 550, 100, 80));
        rectangles.add(new Rectangle(525, 550, 100, 80));
        addMouseMotionListener(this);
        addMouseListener(this);
        setLayout(null);
        Blue_Timer blueTimer = new Blue_Timer();
        Red_Timer red_timer = new Red_Timer();
        jButton = new JButton("CHANGE");
        blueTimer.setBounds(20,20,100,50);
        red_timer.setBounds(880,20,100,50);
        jButton.setBounds(380,20,100,50);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (blueTimer.BTurn)
                {


                    System.out.println("red");
                   blueTimer.BTurn = false;
                    blueTimer.buton_pressed = false;
                    red_timer.buton_pressed = true;
                    red_timer.rTurn = true;
                    if (Red_Timer.r == 0) {
                        red_timer.t.start();

                        Red_Timer.r++;
                    }
                    red_timer.jButton.setVisible(false);
                    red_timer.jButton.setEnabled(false);



                }else if (red_timer.rTurn)
                {

                    System.out.println("blue");
                    red_timer.rTurn = false;
                    red_timer.buton_pressed = false;
                    if (Blue_Timer.b==0){
                    blueTimer.t.start();
                    Blue_Timer.b++;
                    }
                    blueTimer.jButton.setVisible(false);
                    blueTimer.setEnabled(false);
                    blueTimer.BTurn =true;
                    blueTimer.buton_pressed= true;


                }
            }
        });
        add(blueTimer);
        add(red_timer);

        fitRectangle1.start();




        try {
            StartServerorClient();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        send.start();
        read.start();
        if (StartScreen.temp == 1)
        {
            add(jButton);
        }
        Scorekeep.start();
        Scorestart.start();


    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);


        for (int a = 0; a < 12; a++) {
            g.setColor(Color.pink);
            g.fillRect(rectangles.get(a).x, rectangles.get(a).y, rectangles.get(a).width, rectangles.get(a).height);
        }
        for (int a = 12; a < 24; a++) {
            g.setColor(Color.blue);
            g.fillRect(rectangles.get(a).x, rectangles.get(a).y, rectangles.get(a).width, rectangles.get(a).height);

        }
        for (int r = 0; r < Stringrectangles.size(); r++) {

            g.setColor(Color.BLACK);
            g.drawRect(Stringrectangles.get(r).x, Stringrectangles.get(r).y, Stringrectangles.get(r).width, Stringrectangles.get(r).height);
            g.drawString(Card.list.get(r).CardString, Stringrectangles.get(r).x + Stringrectangles.get(r).width / 2 - 10, Stringrectangles.get(r).y + Stringrectangles.get(r).height / 2);
            StartScreen.card.rectangles = Stringrectangles;

        }
    }




    Rectangle temp;
    int tempiplace ;

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (StartScreen.temp == 1) {
            for (Rectangle r : rectangles) {
                if (r.contains(e.getPoint())) {
                    tempx[0] = e.getX() - r.x;
                    tempy[0] = e.getY() - r.y;
                    temp = r;
                    for (int i = 0; i < rectangles.size(); i++) {
                        if (temp == rectangles.get(i)) {
                            tempiplace = i;
                        }
                    }

                }

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
        if (StartScreen.temp == 1) {


            for (Rectangle cv : rectangles) {

                if (temp == cv) {


                    cv.setLocation(e.getX() - tempx[0], e.getY() - tempy[0]);

                }
            }
        }

        repaint();


    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }



    //-------------------------------------------------------------------------------------------------------------------
    Runnable runnable = new Runnable() {
        @Override
        public void run() {

            boolean flag = true;


            while (flag) {
                if (StartScreen.temp == 1) {
                    while (flag) {
                        try {

                            server.sendOutputmouse("-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        String i = null;
                        try {
                            i = server.getinputmouse().nextLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        if (i.equals("-")) {

                        } else {
                            for (Rectangle cv : rectangles) {
                                String[] a = i.split("-");
                                if (rectangles.get(Integer.parseInt(a[2])) == cv) {

                                    cv.setLocation(Integer.parseInt(a[1]), Integer.parseInt(a[0]));
                                    repaint();
                                    /*try {
                                        server.sendOutputmouse("" + cv.getLocation().y + "-" + cv.getLocation().x+"-"+tempiplace);
                                    } catch (IOException ex) {
                                        ex.printStackTrace();
                                    }*/
                                }
                            }

                        }
                    }



                } else {
                    while (flag) {

                        try {
                            client.sendOutputmouse("-");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        String i = null;
                        try {
                            i = client.getinputmaouse().nextLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        if (i.equals("-")) {

                        } else {
                            String[] a = i.split("-");
                            for (Rectangle cv : rectangles) {

                                if (rectangles.get(Integer.parseInt(a[2])) == cv) {

                                    cv.setLocation(Integer.parseInt(a[1]), Integer.parseInt(a[0]));
                                    repaint();
                                   /* try {
                                        server.sendOutputmouse("" + cv.getLocation().y + "-" + cv.getLocation().x);
                                    } catch (IOException ex) {
                                        ex.printStackTrace();
                                    }*/
                                }
                            }
                        }


                    }
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }

    };
    Thread t = new Thread(runnable);
    Runnable runnable1 = new Runnable() {
        @Override
        public void run() {
            if (StartScreen.temp == 1){
               while (true) {
                    int Arraylocation = 0;
                    for (Rectangle rectangle : rectangles) {

                        String send = Arraylocation +"-"+rectangle.x+"-"+rectangle.y+"";
                        try {
                            server.sendOutputmouse(send);
                            Thread.sleep(10);
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        Arraylocation++;
                    }
                }
            }else {
                while (true) {
                    int Arraylocation = 0;
                    for (Rectangle rectangle : rectangles) {

                        String send = Arraylocation +"-"+rectangle.x+rectangle.y+"";
                        try {
                            client.sendOutputmouse(send);
                            Thread.sleep(10);
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        Arraylocation++;
                    }
                }
            }
        }
    };
    Thread send = new Thread(runnable1);
    Runnable runnable2 = new Runnable() {
        @Override
        public void run() {
            if (StartScreen.temp == 1){
                while (true) {
                    String input = "";
                    try {
                        input = server.getinputmouse().nextLine();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    String[] input1 = input.split("-");

                    for (Rectangle rectangle : rectangles) {
                        if (rectangle == rectangles.get(Integer.parseInt(input1[0])))
                        {
                            rectangle.setLocation(Integer.parseInt(input1[1]),Integer.parseInt(input1[2]));
                        }


                    }
                    repaint();
                }
            }else {
                while (true) {
                    String input = "";
                    try {
                        input = client.getinputmaouse().nextLine();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    String[] input1 = input.split("-");
                    int Arraylocation  ;
                    for (Rectangle rectangle : rectangles) {
                        if (rectangle == rectangles.get(Integer.parseInt(input1[0])))
                        {
                            rectangle.setLocation(Integer.parseInt(input1[1]),Integer.parseInt(input1[2]));
                        }
                    }
                    repaint();
                }
            }
        }
    };
    Thread read = new Thread(runnable2);


    void StartServerorClient() throws IOException, ClassNotFoundException {
        if (StartScreen.temp==1)
        {
            Server();
        }else
        {
            Client();
        }
    }
    void  Server() throws IOException {
        server = new server();
        server.setServer(Port);

    }
    void Client() throws IOException {
        client = new client();
        client.setclient(TalkScreen.Ipaddr,Port);
    }
    Runnable fitRectangle  = new Runnable() {
        @Override
        public void run() {
            while(true)
            {
                for(Rectangle r : Stringrectangles)
                {
                    for (Rectangle t : rectangles)
                    {
                        if (r.contains(t.x,t.y))
                        {
                            t.setLocation(r.x,r.y);
                            repaint();
                        }
                    }
                }
                try {
                    Thread.sleep(15);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    };
    Thread fitRectangle1 = new Thread(fitRectangle);

    Runnable runnable3 = new Runnable() {
        @Override
        public void run() {
            while (true) {
                for (Rectangle a : Stringrectangles) {
                    for (Rectangle b : rectangles) {
                        if (a.contains(b)) {
                            String a1 = null;
                            if (Card.list.get(Stringrectangles.indexOf(a)).color.equalsIgnoreCase("black") && rectangles.indexOf(b) < 24 && rectangles.indexOf(b) > 12) {
                                Score.isBlueWon = false;
                                Score.isGameEnd = true;

                                break;
                            } else if (Card.list.get(Stringrectangles.indexOf(a)).color.equalsIgnoreCase("black") && rectangles.indexOf(b) < 12) {
                                Score.isBlueWon = true;
                                Score.isGameEnd = true;


                                break;
                            } else if (rectangles.indexOf(b) < 12) {
                                a1 = "pink";
                            } else if (rectangles.indexOf(b) < 24 && rectangles.indexOf(b) > 12) {
                                    a1 = "blue";
                            }
                            Card.list.get(Stringrectangles.indexOf(a)).team = a1;
                        }
                    }
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    };
    Thread Scorekeep = new Thread(runnable3);
    Runnable runnable4 = new Runnable() {
        @Override
        public void run() {

            boolean running = true;
            int lastscoreBlue = 0, lastScorePink = 0;
            while (running)
            {
                for (Card1 a : Card.list)
                {
                    if (a.team.equalsIgnoreCase("blue"))
                    {
                        Score.BlueScore++;
                    }else if (a.team.equalsIgnoreCase("pink"))
                    {
                        Score.pinkScore++;
                    }

                }
                Score.BlueScore -= lastscoreBlue;
                lastscoreBlue = Score.BlueScore;
                Score.pinkScore -= lastScorePink;
                lastScorePink = Score.pinkScore;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };
    Thread Scorestart = new Thread(runnable4);





}


