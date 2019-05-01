import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public  class server
{
    private PrintWriter outputstream;
    private static Scanner inputStream;
    private static Socket socket;
    public void setServer(int port) throws IOException {
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
    void exit()
    {
        inputStream.close();
        outputstream.close();
    }

    public Socket getSocket() {
        return socket;
    }


}
