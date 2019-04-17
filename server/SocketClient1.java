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
            clientScoket = new Socket("10.10.203.25",6888);//Ip will change
            System.out.println("Connected");

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
