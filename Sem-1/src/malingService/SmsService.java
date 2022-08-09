package malingService;

public class SmsService implements MessageService{
    @Override
    public void sendMessage(String message, String address) {
        // logic to send mails

        final String messageTemplate = "Sending the following sms message \"%s\" to the address \"%s\"";

        System.out.println(String.format(messageTemplate, message, address));
    }
}
