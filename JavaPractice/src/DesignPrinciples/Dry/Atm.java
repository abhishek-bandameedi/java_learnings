package DesignPrinciples.Dry;

public class Atm {
    public void withdraw(){
//        System.out.println("insert the card");
//        System.out.println("enter the current pin number");
        performCommonTasks();
        System.out.println("enter withdrawal amount");

    }
    public void changePin(){
//        System.out.println("insert the card");
//        System.out.println("enter the current pin number");
        performCommonTasks();
        System.out.println("enter the new pin number");

    }
    public void performCommonTasks(){
        System.out.println("insert the card");
        System.out.println("enter the current pin number");
    }
}
