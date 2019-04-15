import java.io.*;
import java.net.ServerSocket;
import java.util.Scanner;
import java.net.Socket;

public class SocketServer1
{
    private static ServerSocket serverSocket;
    private static Socket socket;
    private static Scanner InputStream;


    PrintWriter outputstream ;

    public static void main(String[] args)  {



        try
        {
            System.out.println("Waitting for connetion");
            serverSocket = new ServerSocket(6888);
            socket =serverSocket.accept();




        }
        catch (Exception e)
        {
            System.out.println("Error "+ e);

        }

    }
    public String get()throws IOException
    {
        InputStream = new Scanner(new InputStreamReader(socket.getInputStream()) );
        return InputStream.nextLine();
    }

}