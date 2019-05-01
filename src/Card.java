import java.util.ArrayList;

public class Card {
   String colour = "", team = "",CardString;
    static int  pinkcount= 0;
    static int blueCount = 0 ;
     ArrayList<Card1> list;
    public  Card ()
    {
         list= new ArrayList();
        for (int i =0 ; i<25;i++) {
            list.add(new Card1());
        }
   }
}
