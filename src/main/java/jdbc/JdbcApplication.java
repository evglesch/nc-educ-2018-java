package jdbc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class JdbcApplication {

    public static void main(String[] args) {
        Connection connection = DatabaseDriver.openPostgresConnection();
    }

    private static void selectExample() {

    }

    private static void insertExample() {

    }

    private static void updateExample() {

    }

    private static void deleteExample() {

    }

    private static void autoCommitExample() {

    }

    private static void mapToObjectExample() {

    }






}


