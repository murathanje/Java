class OuterClas{
    int x = 10;

    static class InnerClass {
        int y = 5;
        
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        OuterClas myInner = new OuterClas();
        System.out.println(myInner.x);

    }
}
