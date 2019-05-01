import java.util.ArrayList;

public class Card1
{
    String color = "", team = "",CardString;
    static int  pinkcount= 0;
    static int blueCount = 0 ;
    static int blackcount = 0 ;
    Dictionary dictionary = new Dictionary();
    Card1()
    {


        this.CardString = dictionary.randomWord;


        this.team = team;
            double i = Math.random()*100;
        if (i<50 && blueCount<13)
        {
            this.color = "blue";
        }else if (pinkcount<13)
        {
            this.color = "pink";
        }else if (blackcount == 0)
            {
                color = "black";
            }
        else
            {
                new Card1();
            }


    }
}

