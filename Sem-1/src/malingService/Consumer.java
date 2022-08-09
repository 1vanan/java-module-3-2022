package malingService;

public interface Consumer {
    void processMessages(String msg, String address);
}
