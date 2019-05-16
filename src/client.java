import java.awt.*;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

 class client
{
    private Scanner inputStream;
     private PrintWriter outputstream;
   private Socket socket;
    void setclient(String ip,int port) throws IOException
    {
        try {
             socket = new Socket(ip,port);
            System.out.println("--------Connected---------");
        }catch (Exception e)
        {
            System.out.println("Error: "+e);
        }

    }
    Scanner getinput() throws IOException {
        inputStream = new Scanner(new InputStreamReader(socket.getInputStream()));
        return inputStream;
    }
    void sendOutput(String send) throws IOException
    {
        outputstream = new PrintWriter(new DataOutputStream(socket.getOutputStream()));
        outputstream.println(send);
        outputstream.flush();
    }
    void exit()
    {
        inputStream.close();
        outputstream.close();
    }
    ArrayList<Card1> getobject() throws IOException, ClassNotFoundException {

        inputStream = new Scanner(new InputStreamReader(socket.getInputStream()));
        ArrayList<Card1> temp = new ArrayList<>();
        String string = new String(inputStream.nextLine());


            String decoedString = new String(string);


            String[] list1 = decoedString.split(",");
            int i = 0;
            String[] list2 = new String[25];
            String[] temp1 = new String[0];
            for (String a : list1) {
                list2[i] = a;
                i++;
            }
            i = 0;
            for (String a : list2) {
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    temp1 = a.split("--");
                }catch (AWTError error)
                {

                }
                try {
                    temp.add(new Card1(temp1[0], temp1[1], temp1[2]));
                    Thread.sleep(300);
                }catch (Exception e)
                {
                    System.out.println("Error  " +e );
                }
            }

        return temp;

    }
    Scanner getinputmaouse() throws IOException {
        inputStream = new Scanner(new InputStreamReader(socket.getInputStream()));
        return inputStream;
    }
    void sendOutputmouse(String send) throws IOException
    {
        outputstream = new PrintWriter(new DataOutputStream(socket.getOutputStream()));
        outputstream.println(send);
        outputstream.flush();
    }


}
