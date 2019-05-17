import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;

public class Paint extends JPanel implements MouseMotionListener,MouseListener {

    private server server ;
    private client client;
    private int Port = 4566;
   private JButton jButton ;
    private Image background = Toolkit.getDefaultToolkit().createImage("e57409f822cfaf4c5141e151c6d7e9ae.jpg");




    private int[] tempx = new int[2];
    private int[] tempy = new int[2];


    private ArrayList<Rectangle> Stringrectangles = new ArrayList<>();

    private ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();


    Paint() {


        setBackground(Color.gray);
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
        Stringrectangles.add(new Rectangle(150 * 2, 90 * 3, 100, 80));//11
        Stringrectangles.add(new Rectangle(150 * 3, 90 * 3, 100, 80));//12
        Stringrectangles.add(new Rectangle(150 * 4, 90 * 3, 100, 80));
        Stringrectangles.add(new Rectangle(150 * 5, 90 * 3, 100, 80));
        Stringrectangles.add(new Rectangle(150, 90 * 4, 100, 80));
        Stringrectangles.add(new Rectangle(150 * 2, 90 * 4, 100, 80));
        Stringrectangles.add(new Rectangle(150 * 3, 90 * 4, 100, 80));
        Stringrectangles.add(new Rectangle(150 * 4, 90 * 4, 100, 80));
        Stringrectangles.add(new Rectangle(150 * 5, 90 * 4, 100, 80));
        Stringrectangles.add(new Rectangle(150, 90 * 5, 100, 80));
        Stringrectangles.add(new Rectangle(150 * 2, 90 * 5, 100, 80));//21
        Stringrectangles.add(new Rectangle(150 * 3, 90 * 5, 100, 80));//22
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
        setBackground(Color.WHITE);
        sound.start();
        Blue_Timer blueTimer = new Blue_Timer();
        Red_Timer red_timer = new Red_Timer();
        jButton = new JButton("CHANGE");

        jButton.setBorder( new RoundedBorder(50));
        blueTimer.setBounds(20,20,70,40);
        red_timer.setBounds(910,20,70,40);
        jButton.setBounds(425,20,150,50);
        jButton.addActionListener(e -> {
            if (blueTimer.BTurn)
            {



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
        });
        add(blueTimer);
        add(red_timer);


        fitRectangle1.start();




        try {
            StartServerorClient();
        } catch (IOException e) {
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

    Color color = new Color(63,59,59);
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);


        g.drawImage(background,0,0,null);
        for (int a = 0; a < 12; a++) {
            g.setColor(Color.pink);
            g.fillRect(rectangles.get(a).x, rectangles.get(a).y, rectangles.get(a).width, rectangles.get(a).height);
        }
        for (int a = 12; a < 24; a++) {
            g.setColor(Color.blue);
            g.fillRect(rectangles.get(a).x, rectangles.get(a).y, rectangles.get(a).width, rectangles.get(a).height);

        }
        for (int r = 0; r < Stringrectangles.size(); r++) {

            g.setColor(Color.gray);
            g.drawRect(Stringrectangles.get(r).x, Stringrectangles.get(r).y, Stringrectangles.get(r).width, Stringrectangles.get(r).height);
            g.setColor(Color.white);
            g.drawString(Card.list.get(r).CardString, Stringrectangles.get(r).x + Stringrectangles.get(r).width / 2 - 10, Stringrectangles.get(r).y + Stringrectangles.get(r).height / 2);
            StartScreen.card.rectangles = Stringrectangles;

        }
    }




    private Rectangle temp;

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
                    for (Rectangle rectangle : rectangles) {
                        if (temp == rectangle) {
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
    private Runnable runnable1 = new Runnable() {
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
                        } catch (IOException | InterruptedException e) {
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
                        } catch (IOException | InterruptedException e) {
                            e.printStackTrace();
                        }
                        Arraylocation++;
                    }
                }
            }
        }
    };
    private Thread send = new Thread(runnable1);
    private Runnable runnable2 = new Runnable() {
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
    private Thread read = new Thread(runnable2);


    private void StartServerorClient() throws IOException {
        if (StartScreen.temp==1)
        {
            Server();
        }else
        {
            Client();
        }
    }
    private void  Server() {
        server = new server();
        server.setServer(Port);

    }
    private void Client() {
        client = new client();
        client.setclient(TalkScreen.Ipaddr,Port);
    }
    private Runnable fitRectangle  = () -> {
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

    };
    private Thread fitRectangle1 = new Thread(fitRectangle);

    private Runnable runnable3 = () -> {
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

    };
    private Thread Scorekeep = new Thread(runnable3);
    private Runnable runnable4 = () -> {

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
    };
    private Thread Scorestart = new Thread(runnable4);


private Runnable runnable6 = () -> {

    while (true)
    {
        try {
            Thread.sleep(8500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Sound.music();


        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
};

private Thread sound = new Thread(runnable6);

}


