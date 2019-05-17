import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;


class server
{
    private PrintWriter outputstream;
    private  Scanner inputStream;
    private  Socket socket;
    void setServer(int port) {
        try {
            System.out.println("--------Waiting for Connetion-------");
            ServerSocket server = new ServerSocket(port);
            socket = server.accept();
            System.out.println("---------Connected---------");
        }catch (Exception e)
        {
            System.out.println("Error : "+e);
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

     void sendArraylist(ArrayList<Card1> list) throws IOException {
         StringBuilder send = new StringBuilder(new String());
         for (Card1 a : list)
        {
            send.append(a.CardString).append("--").append(a.color).append("--").append(a.team).append(",");
        }

         outputstream = new PrintWriter(new DataOutputStream(socket.getOutputStream()));
         outputstream.println(send);
         outputstream.flush();
    }


    Scanner getinputmouse() throws IOException {
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
