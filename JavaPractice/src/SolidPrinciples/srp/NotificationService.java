package SolidPrinciples.srp;

public class NotificationService {
    public void sendOtp(String medium){
        if(medium.equals("email")){
            //sending otp through email
        }
        if(medium.equals("mobile")){
            //sending otp through mobile
        }
    }
}
