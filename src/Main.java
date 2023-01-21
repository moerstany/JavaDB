import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Main {
    public static void main(String[] args) {
        /*try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            //System.out.println("Connect");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDb","root","123123");
            System.out.println("Sql select");
            connection.close();
        } catch (Exception e) {
            System.out.println("Not Connect");
            throw new RuntimeException(e);
        }*/
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();

            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDb", "root", "123123")) {
                System.out.println("Connect");
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM Persons");
                while (resultSet.next()) {
                    System.out.print(resultSet.getString(1));
                    System.out.print(resultSet.getString(2));
                    System.out.print(resultSet.getInt(3));
                }
            }

        }
        catch (Exception e) {
            System.out.println("Not Connect");
            throw new RuntimeException(e);
        }
    }

}