package Exam;

public class Deneme {
    
    public static void Main() {

        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
        
    }
}
