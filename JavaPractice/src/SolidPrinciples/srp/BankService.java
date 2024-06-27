package SolidPrinciples.srp;

public class BankService {
    public long deposit(long amount){
        return 0;
    }
    public long withdraw(long amount){
        return 0;
    }
    public void printPassbook(){
        //update transaction information in passbook
    }
    public void getLoanInterestInfo(String loanType){
        if(loanType.equals("homeLoan")){
            //procedure for homeLoan
        }
        if(loanType.contains("personalLoan")){
            //procedure for personalLoan
        }
        if(loanType.equals("vehicle")) {
            //procedure for vehicle loan
        }
    }
    public void sendOtp(String medium){
        if(medium.equals("email")){
            //sending otp through email
        }
    }
}
