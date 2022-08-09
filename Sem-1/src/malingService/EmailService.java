package malingService;

public class EmailService implements MessageService {

    @Override
    public void sendMessage(String message, String address) {
        // logic to send mails

        final String messageTemplate = "Sending the following email message \"%s\" to the address \"%s\"";

        System.out.println(String.format(messageTemplate, message, address));
    }
}
