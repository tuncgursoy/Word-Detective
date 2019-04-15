package deneme1;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SocketClient1
{
    private static Socket clientScoket;
    Scanner inputStream;
    PrintWriter outputstream;

    public static void main(String[] args)
    {

        try
        {
            clientScoket = new Socket("192.168.172.2",6888);//Ip will change
            System.out.println("Connected");
            SocketClient1 a = new SocketClient1();
            a.send(" ");

        }
        catch (Exception e)
        {

            System.out.println("Error "+e);
        }
    }
    public  void send(String input) throws IOException {
        outputstream = new PrintWriter(new DataOutputStream(clientScoket.getOutputStream()));
        outputstream.println(input);
        outputstream.flush();


    }
    public String get()throws IOException
    {

        inputStream = new Scanner(new InputStreamReader(clientScoket.getInputStream()) );
        return inputStream.nextLine();

    }
}
