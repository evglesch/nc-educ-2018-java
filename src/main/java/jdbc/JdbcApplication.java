package jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class JdbcApplication {

    public static void main(String[] args) throws SQLException {
        PostgresDriverManager driverManager = new PostgresDriverManager();
        Connection connection = driverManager.openPostgresConnection();
        
        SimpleExample simpleExample = new SimpleExample(connection);
        simpleExample.selectExample();
    }
}


