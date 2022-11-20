public class App {
    public static void main(String[] args) {
        Gamer g1 = new Gamer("Murathan");
        Gamer g2 = new Gamer("Stephane");

        Arena arena = new Arena();
        arena.addGamer(g1, g2);
        arena.startGame();
    }
}
