class Score
{
   static int BlueScore = 0;
    static int pinkScore = 0 ;
    static boolean isBlueWon ;
    static boolean isGameEnd = false;

    void gameEnd()
    {
        if (isGameEnd)
        {
            if (BlueScore>pinkScore)
            {
                isBlueWon = true;

            }if (BlueScore<pinkScore)
            {
                isBlueWon = false;
            }
        }
    }
}
