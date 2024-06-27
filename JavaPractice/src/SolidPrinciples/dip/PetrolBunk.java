package SolidPrinciples.dip;

public class PetrolBunk {
    private DebitCard debitCard;
    //private CreditCard creditCard;
    public PetrolBunk(DebitCard debitCard){
        this.debitCard=debitCard;
    }
    public void doPurchase(int amount){
        debitCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        DebitCard debitCard=new DebitCard();
        //CreditCard creditCard=new CreditCard();
        PetrolBunk getPetrol=new PetrolBunk((debitCard));
        getPetrol.doPurchase(1000);
    }
}
