package singletone;

public class SingletonObject {
    private static SingletonObject singleInstance = null;
    private String logingMessage;

    private SingletonObject() {
        logingMessage = "Greetings from a constructor of a singletone class!";
    }

    public static SingletonObject getInstance() {
        if (singleInstance == null) {
            singleInstance = new SingletonObject();
        }
        return singleInstance;
    }

    public void printLogging() {
        System.out.println(logingMessage);
    }
}
