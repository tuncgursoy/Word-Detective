class Card1 {
    String color = "", team,CardString;
    private static int  pinkcount= 0;
    private static int blueCount = 0 ;
    private static int blackcount = 0 ;
    private Dictionary dictionary = new Dictionary();
    Card1()
    {


        this.CardString = dictionary.randomWord;


        this.team = " ";
            double i = Math.random()*100;
        if (i<50 && blueCount<12)
        {
            this.color = "blue";
            blueCount++;
        }else if (blackcount == 0)
        {color = "black";
            blackcount++;
        }else if (pinkcount<12)
            {
                this.color = "pink";
                pinkcount++;
            }
        else if (blueCount<12)
            {
                this.color = "blue";
                blueCount++;
            }




    }
    Card1(String stringname, String Color, String team) {
        this.CardString = stringname;
        this.color = Color;
        this.team = team;

    }
}

