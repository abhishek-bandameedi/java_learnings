interface Child1{
    default void method(){
        System.out.println("This is child1");
    }
}
interface Child2{
    default void method(){
        System.out.println("This is child2");
    }
}
class Child3 implements Child1, Child2{
    public void method(){
        //Child1.super.method();
        Child2.super.method();
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        Child3 obj=new Child3();
        obj.method();

    }
}