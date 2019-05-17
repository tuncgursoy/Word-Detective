import java.awt.*;
import java.util.ArrayList;

class Card {

          static ArrayList<Card1> list;

      ArrayList<Rectangle> rectangles = new ArrayList<>();
    Card()
    {
        list= new ArrayList();
        for (int i =0 ; i<25;i++) {
            list.add(new Card1());

        }
    }


}
