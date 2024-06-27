package SolidPrinciples.dip;

public class CreditCard implements Card{
    public void doTransaction(int amount){
        System.out.println("payment through credit card");
    }
}
