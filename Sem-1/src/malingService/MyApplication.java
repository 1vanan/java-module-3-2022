package malingService;

public class MyApplication {
    private EmailService emailService = new EmailService();

    public void processMessages(String msg, String address) {
        // do some email address validation, checking the message etc
        this.emailService.sendMessage(msg, address);
    }
}
