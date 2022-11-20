public class StatMaker {

    static void proccesMovesGamer(Gamer g1, Gamer g2) {

        if(g1.sign == null || g2.sign == null || Arena.isGameOver) return;
        
        else if(g1.sign == g2.sign)
            Gamer.numofDraw++;
        
        else if(g1.sign == HandSign.PAPER && g2.sign == HandSign.ROCK)
            g1.numoofWin++;
        
        else if(g1.sign == HandSign.SCISSOR && g2.sign == HandSign.PAPER)
            g1.numoofWin++;
        
        else if(g1.sign == HandSign.ROCK && g2.sign == HandSign.SCISSOR)
            g1.numoofWin++;
        
        else 
            g2.numoofWin++;
        
        Gamer.numofTrails++;

    }

    static void displayScores(Gamer g1, Gamer g2) {
        System.out.println(g1.name + " : " + g1.numoofWin + " % " + (Gamer.numofTrails == 0 ? 0 : (float)g1.numoofWin/Gamer.numofTrails)*100f);

        System.out.println(g2.name + " : " + g2.numoofWin + " % " + (Gamer.numofTrails == 0 ? 0 : (float)g2.numoofWin/Gamer.numofTrails)*100f);

        System.out.println("\nNum of Draw: " + Gamer.numofDraw);

    }
}
