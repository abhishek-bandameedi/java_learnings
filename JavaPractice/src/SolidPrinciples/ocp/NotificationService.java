package SolidPrinciples.ocp;

public interface NotificationService {
    public void sendOtp(String medium);
    public void sendTransactionReport(String medium);
}
