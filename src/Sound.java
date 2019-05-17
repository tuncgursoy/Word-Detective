import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Sound
{

    static  void  music()
    {
        try {
            FileInputStream fileInputStream = new FileInputStream("Fairy Tail Theme (Violin Cover) .mp3");
            Player player = new Player(fileInputStream);
            player.play();


        } catch (FileNotFoundException | JavaLayerException e) {
            e.printStackTrace();
        }
    }
}
