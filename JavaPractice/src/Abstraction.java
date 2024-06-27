abstract class Aaa {
    void m1() {
        System.out.println("Method--1");
    }

    abstract void m2();
    void m3() {
        System.out.println("method--m3");
    }
    abstract void m4();
}
class Abstraction extends Aaa{
    @Override
    void m2() {
        System.out.println("Method--m2");
    }

    @Override
    void m4() {
        System.out.println("Method--m3");
    }
    public static void main(String args[]) {
        Abstraction b=new Abstraction();
        b.m1();
        b.m2();
        b.m3();
        b.m4();
    }
}

