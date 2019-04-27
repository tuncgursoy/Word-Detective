package deneme1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main
{
    public static void  main(String[] args) throws IOException {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        String i  ;
        String[] a ;
        String userName = "";
    SocketServer1.main(args);
    SocketServer1 server = new SocketServer1();


    boolean isTrue = true;
    while (isTrue)
    {
        i = " ";

        server.send(" ");
        i =server.get();
        if (!(i.equalsIgnoreCase(" ")))
        {
            System.out.println(i);
        }else {




            i = keyboard.readLine();
            a = i.split(" ");
            String h = "";
            for (String q : a) {
                if (q.equalsIgnoreCase("send")) {
                    continue;
                }else {
                h += q + " ";
            }}

            switch (a[0]) {
                case "send":
                    server.send("[" + userName + "]:" + h);
                    i = "";
                    break;
                case "exit":
                    isTrue = false;
                default:
                    server.send(" ");
            }
        }

   }



    }



}
