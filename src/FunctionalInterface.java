@java.lang.FunctionalInterface
interface MyInterface {
    int myMethod(int i, int j);
}

//class B implements MyInterface {
//    public void myMethod() {
//        System.out.println("My Interface");
//    }
//}


// Will use Lambda expression to implement interface
public class FunctionalInterface {
    public static void main(String[] args) {
//        MyInterface myInterface = (i, j) -> i + j;
        MyInterface myInterface = Integer::sum;
        System.out.println("Result: " + myInterface.myMethod(1, 2));
    }
}
