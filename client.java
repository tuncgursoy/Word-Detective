import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class client
{
    Scanner inputStream;
    PrintWriter outputstream;
    Socket socket;
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

}
