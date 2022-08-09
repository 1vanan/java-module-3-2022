package malingService;

public class MyDIApplication implements Consumer{
    private MessageService messageService;

    public MyDIApplication(MessageService messageService){
        this.messageService = messageService;
    }

    @Override
    public void processMessages(String msg, String address) {
        // do some email address validation, checking the message etc
        this.messageService.sendMessage(msg, address);
    }
}
