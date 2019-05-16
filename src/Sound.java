import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Sound
{

    public static  void  music()
    {
        try {
            FileInputStream fileInputStream = new FileInputStream("Fairy Tail Theme (Violin Cover) .mp3");
            Player player = new Player(fileInputStream);
            player.play();
            System.out.println(" playing");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}
