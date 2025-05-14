@java.lang.FunctionalInterface
interface MyInterface {
    void myMethod();
}

//class B implements MyInterface {
//    public void myMethod() {
//        System.out.println("My Interface");
//    }
//}


// Will use Lambda expression to implement interface
public class FunctionalInterface {
    public static void main(String[] args) {
        MyInterface myInterface = () -> System.out.println("My Interface");
        myInterface.myMethod();
    }
}
