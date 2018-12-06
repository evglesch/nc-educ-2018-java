package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcApplication {

    public static void main(String[] args) {
        Connection connection = DatabaseDriver.openPostgresConnection();
    }

    private static void selectExample(Connection connection) throws SQLException {
        String query = "SELECT * FROM user";
        Statement stmt = connection.createStatement();
        ResultSet resultSet = stmt.executeQuery(query);
        while (resultSet.next()) {
            String userId = resultSet.getString("user_id");
            String firstName = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");
            Integer age = resultSet.getInt("age");
            System.out.println(String.format("User [%s, %s %s, %i]", userId, firstName, lastName, age));
        }
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


