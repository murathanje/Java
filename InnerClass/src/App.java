class OuterClass{

    int x = 5;

    public class InnerClass{
        int y = 10;
    }
}






public class App {
    public static void main(String[] args){
    
        OuterClass outerClass = new OuterClass();
        System.out.println(outerClass.x);

        OuterClass.InnerClass myInnerClass = outerClass.new InnerClass();
        System.out.println(myInnerClass.y);

    }
}
