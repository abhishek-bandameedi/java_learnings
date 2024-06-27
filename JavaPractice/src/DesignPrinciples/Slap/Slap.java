package DesignPrinciples.Slap;

public class Slap {
    public static void main(String[] args) {
        getDetailsAndMail();
    }
    public static void getDetailsAndMail(){
        //code to fetch details from database
        System.out.println("Fetching details from database");
        /*
       //code to email the user
        System.out.println("Mailing to the user");
        */
        String details="details";
        emailTheUser(details);
    }
    public static void emailTheUser(String details){
        //code to email the user
        System.out.println("Mailing to the user");
    }
}
