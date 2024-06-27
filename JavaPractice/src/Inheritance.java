class A{
    int i=22;
    int j=30;
    int k=12;
    void method1(){
        System.out.println("This is method1. ");
    }
}
class B extends A {
    void sum() {
        int s = i + j + k;
        System.out.println("The sum is: " + s);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        B b=new B();
        b.method1();
        b.sum();
    }
}
