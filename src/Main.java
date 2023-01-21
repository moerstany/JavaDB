import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;


public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            //System.out.println("Connect");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDb","root","123123");
            System.out.println("Sql select");
            connection.close();
        } catch (Exception e) {
            System.out.println("Not Connect");
            throw new RuntimeException(e);
        }

    }

}