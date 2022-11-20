public class Arena {
    Gamer gamer1;
    Gamer gamer2;
    static boolean isGameOver;

    void addGamer(Gamer g1, Gamer g2) {
        this.gamer1 = g1;
        this.gamer2 = g2;
    }

    void startGame() {
        while (!isGameOver) {
            gamer1.move();
            gamer2.move();
            StatMaker.proccesMovesGamer(gamer1, gamer2);
            StatMaker.displayScores(gamer1, gamer2);
        }
    }

}
