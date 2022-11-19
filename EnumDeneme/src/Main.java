public class Main {
    public static void main(String[] args) throws Exception {
        Level[] levels = Level.values();
        for (Level l : levels)
            System.out.println(l + ":" + l.getDesc());
    }
}
