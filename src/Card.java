import java.awt.*;
import java.util.ArrayList;

public class Card {
   String color = "", team = "",CardString;
          ArrayList<Card1> list;
      ArrayList<String> Stringlist = new ArrayList();
      ArrayList<String> Colors = new ArrayList<>();
      ArrayList<String> Teams = new ArrayList<>();
      ArrayList<Rectangle> rectangles = new ArrayList<>();
    public  Card ()
    {
        list= new ArrayList();
        for (int i =0 ; i<25;i++) {
            list.add(new Card1());
            Colors.add(list.get(i).color);
            Stringlist.add(list.get(i).CardString);
            Teams.add(list.get(i).team);
        }
    }


}
