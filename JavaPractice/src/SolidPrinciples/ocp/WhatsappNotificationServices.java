package SolidPrinciples.ocp;

public class WhatsappNotificationServices implements NotificationService{
    @Override
    public void sendOtp(String medium) {
        //logic for whatsapp otp
    }

    @Override
    public void sendTransactionReport(String medium) {
        //logic for whatsapp report
    }
}
