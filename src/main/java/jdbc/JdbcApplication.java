package jdbc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JdbcApplication {

    public static void main(String[] args) {
        Connection connection = DatabaseDriver.openPostgresConnection();


    }




}


