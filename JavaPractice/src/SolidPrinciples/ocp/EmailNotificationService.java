package SolidPrinciples.ocp;

public class EmailNotificationService implements NotificationService{

    @Override
    public void sendOtp(String medium) {
        //logic for email otp
    }

    @Override
    public void sendTransactionReport(String medium) {
        //logic for email report
    }
}
