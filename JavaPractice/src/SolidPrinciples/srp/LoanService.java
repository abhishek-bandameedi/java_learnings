package SolidPrinciples.srp;

public class LoanService {
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
}
