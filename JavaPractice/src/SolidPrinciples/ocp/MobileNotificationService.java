package SolidPrinciples.ocp;

public class MobileNotificationService implements NotificationService{

    @Override
    public void sendOtp(String medium) {
        //logic for mobile otp
    }

    @Override
    public void sendTransactionReport(String medium) {
        //logic for mobile report
    }
}
