package SolidPrinciples.dip;

public class PetrolBunkValid {
    private Card card;
    public PetrolBunkValid(Card card){
        this.card=card;
    }
    public void doPurchase(int amount){
        Card.doTransaction(amount);
    }

    public static void main(String[] args) {
        Card card=new DebitCard();
        //Card card=new CreditCard();
        PetrolBunkValid getPetrol=new PetrolBunkValid((card));
        getPetrol.doPurchase(1000);
    }
}
