package deneme4;

import java.awt.event.ActionListener;
import java.util.logging.Logger;

public class main {

    public static String serverOrClient;
    static selection a;

    public static void main(String[] args) {


        a = new selection();
        start();

    }

    private static void start() {
        while (true) {

            Logger.getLogger("t");
            if (!(a.temp == null)) {
                serverOrClient = a.temp;
                break;
            }
        }
    }
}
