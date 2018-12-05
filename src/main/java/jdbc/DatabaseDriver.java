package jdbc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseDriver {

    public static Connection openPostgresConnection() {
        try {
            Driver driver = createPostgresDriver();
            DriverManager.registerDriver(driver);

            Properties properties = loadProperties();
            Connection connection = getConnection(properties);

            return connection;

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static Driver createPostgresDriver() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (Driver) Class.forName("org.postgresql.Driver").newInstance();
    }

    private static Properties loadProperties() {
        Properties properties = new Properties();
        try {
            properties.load(new BufferedReader(new FileReader("postgres.properties")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    private static Connection getConnection(Properties properties) {
        try {
            return DriverManager.getConnection(properties.getProperty("url"), properties);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
