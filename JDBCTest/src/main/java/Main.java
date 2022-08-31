public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        String db_url = "some url";
        String user = "dummy";
        String pwd = "qwerty123";

        ConnectDB connectDB = new ConnectDBImpl(db_url, user, pwd);
        connectDB.simpleQuery("id", "name", "timestamp");
    }
}
