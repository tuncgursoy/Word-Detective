import java.awt.*;
import java.util.ArrayList;

public class Card {

          static ArrayList<Card1> list;

      ArrayList<Rectangle> rectangles = new ArrayList<>();
    public  Card ()
    {
        list= new ArrayList();
        for (int i =0 ; i<25;i++) {
            list.add(new Card1());

        }
    }


}
