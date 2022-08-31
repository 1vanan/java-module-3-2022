import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConnectDBImpl implements ConnectDB{
    private final String URL;
    private final String USERNAME;
    private final String PWD;
    private final String DRIVER = "oracle.jdbc.driver.OracleDriver";

    Connection connection = null;
    Statement statement = null;

    ConnectDBImpl(String url, String userName, String pwd){
        this.URL = url;
        this.USERNAME = userName;
        this.PWD = pwd;
    }

    @Override
    public Map<Integer, List<String>> simpleQuery(String... args) {
        Map<Integer, String> result = new HashMap<>();
        try{
            Class.forName(DRIVER).newInstance();
            connection = DriverManager.getConnection(URL, USERNAME, PWD);


            String sql = "select * from table_name";

            int cntr = 0;

            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()){
                for(int i = 0; i < args.length - 1; i++){

                    result.put(cntr, rs.getString(args[i]));
                    cntr++;
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
