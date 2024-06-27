package SolidPrinciples.dip;

public class DebitCard implements Card{
    public void doTransaction(int amount){
        System.out.println("payment through debit card");
    }
}
