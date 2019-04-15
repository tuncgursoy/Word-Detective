package deneme1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Timer;

public class main1
{
    public static void  main(String[] args) throws IOException {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        String i  ;
        String[] a ;
        String userName = "";
        SocketClient1.main(args);
        SocketClient1 server = new SocketClient1();
        Timer v = new Timer();



        boolean isTrue = true;
        while (isTrue)
        {
            server.send(" ");
            i = " ";
            i =server.get();
            if (!(i.equalsIgnoreCase(" ")))
            {

                System.out.println(i);

            }else {


                i = keyboard.readLine();
                a = i.split(" ");
                String h ="";
                for (String q : a) {
                    if (q.equalsIgnoreCase("send")) {
                        continue;
                    }else {
                        h += q + " ";
                    }}


                switch (a[0]) {
                    case "send":
                        server.send("[" + userName + "]:" + h);
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