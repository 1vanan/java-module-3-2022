package malingService;

public class MyMessagesDITest {
    public static void main(String[] args) {
        String msgEmail = "Hi from the first email message!";
        String email = "elon.mask@phystech.edu";

        String msgSms = "Hi from the first sms message!";
        String phone = "88005553535";


        //Send email
        MessageServiceInjector injectorEmail = new EmailServiceInjector();
        Consumer appEmail = injectorEmail.getConsumer();
        appEmail.processMessages(msgEmail, email);

        //Send sms
        MessageServiceInjector injectorSms = new SmsServiceInjector();
        Consumer appSms = injectorSms.getConsumer();
        appSms.processMessages(msgSms, phone);
    }
}
