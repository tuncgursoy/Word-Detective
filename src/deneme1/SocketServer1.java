package deneme1;

import java.io.*;
import java.net.ServerSocket;
import java.util.Scanner;
import java.net.Socket;

public class SocketServer1
{
    private static ServerSocket serverSocket;
    private static Socket socket;
    private static Scanner InputStream;


    PrintWriter outputstream;


    public static void main(String[] args)  {



        try
        {
            System.out.println("Waitting for connetion");
            serverSocket = new ServerSocket(6888);
            socket =serverSocket.accept();
            System.out.println("Connected");
            SocketServer1 a = new SocketServer1();
            a.send(" ");




        }
        catch (Exception e)
        {
            System.out.println("Error "+ e);

        }

    }
    public String get()throws IOException {

            InputStream = new Scanner(new InputStreamReader(socket.getInputStream()));


            return (InputStream.nextLine());




    }
    public  void send(String input) throws IOException {
        outputstream = new PrintWriter(new DataOutputStream(socket.getOutputStream()));
        outputstream.println(input);
        outputstream.flush();


    }

}