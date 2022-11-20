class OuterClas{
    int x = 10;

    static class InnerClass {
        int y = 5;
        
    }
}

public class App {
    public static void main(String[] args){
        
        OuterClas outerClas = new OuterClas();
        System.out.println(outerClas.x);

        OuterClas.InnerClass myInner = new OuterClas.InnerClass();
        System.out.println(myInner.y);

    }
}
