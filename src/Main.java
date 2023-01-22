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
                /*System.out.println("Connect");
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM Persons");
                while (resultSet.next()) {
                    System.out.print(resultSet.getString(1));
                    System.out.print(resultSet.getString(2));
                    System.out.print(resultSet.getInt(3));
                }*/

                Statement statement = connection.createStatement();
                 /*statement.executeUpdate("create table buyers (id INT,first_name VARCHAR(50),last_name VARCHAR(50),email VARCHAR(50),city VARCHAR(100),country VARCHAR(100))");

               statement.executeUpdate("insert into buyers (id, first_name, last_name, email, city, country) values (1, 'Roarke', 'Sive', 'rsive0@boston.com','Novosibirsk','Russia');");
                statement.executeUpdate("insert into buyers (id, first_name, last_name, email, city, country) values (2, 'Neile', 'Leverton', 'nleverton1@weibo.com','Essen','Germany');");
                statement.executeUpdate("insert into buyers (id, first_name, last_name, email, city, country) values (3, 'Kelcy', 'Peerman', 'kpeerman2@goo.ne.jp','Osaka','Japan');");
                        statement.executeUpdate("insert into buyers (id, first_name, last_name, email, city, country) values (4, 'Victoria', 'Lillicrap', 'vlillicrap3@reference.com','Novosibirsk','Russia');");
                statement.executeUpdate("insert into buyers (id, first_name, last_name, email, city, country) values (5, 'Roxanna', 'Hurdman', 'rhurdman4@state.tx.us','Ohio','USA');");
                        statement.executeUpdate("insert into buyers (id, first_name, last_name, email, city, country) values (6, 'Denver', 'Pendered', 'dpendered5@blogs.com','Ohio','USA');");
                statement.executeUpdate("insert into buyers (id, first_name, last_name, email, city, country) values (7, 'Kare', 'Osinin', 'kosinin6@cnet.com','Essen','Germany');");
                         statement.executeUpdate("insert into buyers (id, first_name, last_name, email, city, country) values (8, 'Dudley', 'Scroggie', 'dscroggie7@behance.net','Novosibirsk','Russia');");
                statement.executeUpdate("insert into buyers (id, first_name, last_name, email, city, country) values (9, 'Buffy', 'Riddiough', 'briddiough8@desdev.cn','Essen','Germany');");
                         statement.executeUpdate("insert into buyers (id, first_name, last_name, email, city, country) values (10, 'Carline', 'Hum', 'chum9@360.cn','Ohio','USA');");
                statement.executeUpdate("insert into buyers (id, first_name, last_name, email, city, country) values (11, 'Amalle', 'Buse', 'abusea@gizmodo.com','Osaka','Japan');");
                        statement.executeUpdate("insert into buyers (id, first_name, last_name, email, city, country) values (12, 'Lark', 'Janusik', 'ljanusikb@scientificamerican.com','Novosibirsk','Russia');");
                statement.executeUpdate("insert into buyers (id, first_name, last_name, email, city, country) values (13, 'Larissa', 'Hampton', 'lhamptonc@amazon.de','Ohio','USA');");
                        statement.executeUpdate("insert into buyers (id, first_name, last_name, email, city, country) values (14, 'Fitz', 'Le Estut', 'fleestutd@cisco.com','Essen','Germany');");
                statement.executeUpdate("insert into buyers (id, first_name, last_name, email, city, country) values (15, 'Garfield', 'Nelhams', 'gnelhamse@webs.com','Ohio','USA'); ");
                        statement.executeUpdate("insert into buyers (id, first_name, last_name, email, city, country) values (16, 'Nikoletta', 'McGrouther', 'nmcgroutherf@dot.gov','Novosibirsk','Russia');");
                statement.executeUpdate("insert into buyers (id, first_name, last_name, email, city, country) values (17, 'Devlin', 'Chese', 'dcheseg@patch.com','Osaka','Japan'); ");
                        statement.executeUpdate("insert into buyers (id, first_name, last_name, email, city, country) values (18, 'Trix', 'Higgoe', 'thiggoeh@bizjournals.com','Novosibirsk','Russia');");
                statement.executeUpdate("insert into buyers (id, first_name, last_name, email, city, country) values (19, 'Corine', 'Halbord', 'chalbordi@illinois.edu','Essen','Germany'); ");
                        statement.executeUpdate("insert into buyers (id, first_name, last_name, email, city, country) values (20, 'Desiree', 'Radage', 'dradagej@about.com','Essen','Germany');");
                statement.executeUpdate("insert into buyers (id, first_name, last_name, email, city, country) values (21, 'Linell', 'Macguire', 'lmacguirek@techcrunch.com','Osaka','Japan'); ");
                        statement.executeUpdate("insert into buyers (id, first_name, last_name, email, city, country) values (22, 'Guy', 'Labrum', 'glabruml@ycombinator.com','Novosibirsk','Russia');");
                statement.executeUpdate("insert into buyers (id, first_name, last_name, email, city, country) values (23, 'Elsbeth', 'Bolt', 'eboltm@usgs.gov','Ohio','USA'); ");
                        statement.executeUpdate("insert into buyers (id, first_name, last_name, email, city, country) values (24, 'Feliks', 'Cursey', 'fcurseyn@wiley.com','Essen','Germany');");
                statement.executeUpdate("insert into buyers (id, first_name, last_name, email, city, country) values (25, 'Jard', 'Camacke', 'jcamackeo@wiley.com','Ohio','USA'); ");
                        statement.executeUpdate("insert into buyers (id, first_name, last_name, email, city, country) values (26, 'Tore', 'Facchini', 'tfacchinip@shop-pro.jp','Novosibirsk','Russia');");
                statement.executeUpdate("insert into buyers (id, first_name, last_name, email, city, country) values (27, 'Ashia', 'Woolliams', 'awoolliamsq@ustream.tv','Essen','Germany');");
                        statement.executeUpdate("insert into buyers (id, first_name, last_name, email, city, country) values (28, 'Dav', 'Maris', 'dmarisr@time.com','Novosibirsk','Russia');");
                statement.executeUpdate("insert into buyers (id, first_name, last_name, email, city, country ) values (29, 'Natalee', 'Pixton', 'npixtons@networkadvertising.org','Novosibirsk','Russia'); ");
                        statement.executeUpdate("insert into buyers (id, first_name, last_name, email, city, country) values (30, 'Lindsay', 'Newlove', 'lnewlovet@ehow.com','Osaka','Japan');");


                        statement.executeUpdate("create table products (id INT, product_name VARCHAR(50), department VARCHAR(50), discount INT)");

                statement.executeUpdate("insert into products (id, product_name, department, discount) values (1, 'Beef - Short Ribs', 'Electronics', 20);");
                statement.executeUpdate("insert into products  (id, product_name, department, discount) values (2, 'Lid - 0090 Clear', 'Automotive', null);");
                statement.executeUpdate("insert into products  (id, product_name, department, discount) values (3, 'Mushroom - Oyster, Fresh', 'Music', 25);");
                statement.executeUpdate("insert into products  (id, product_name, department, discount) values (4, 'Red Currant Jelly', 'Grocery', 8);");
                statement.executeUpdate("insert into products  (id, product_name, department, discount) values (5, 'Mushroom - Morels, Dry', 'Garden', 88);");
                statement.executeUpdate("insert into products  (id, product_name, department, discount) values (6, 'Puree - Pear', 'Games', 76);");
                statement.executeUpdate("insert into products  (id, product_name, department, discount) values (7, 'Yogurt - French Vanilla', 'Books', 85);");
                statement.executeUpdate("insert into products  (id, product_name, department, discount) values (8, 'Cheese - Pont Couvert', 'Music', 8);");
                statement.executeUpdate("insert into products  (id, product_name, department, discount) values (9, 'Pork - Back, Long Cut, Boneless', 'Movies', 11);");
                statement.executeUpdate("insert into products  (id, product_name, department, discount) values (10, 'Scallops - 10/20', 'Home', 5);");
                statement.executeUpdate("insert into products  (id, product_name, department, discount) values (11, 'Whmis - Spray Bottle Trigger', 'Industrial', 1);");
                statement.executeUpdate("insert into products  (id, product_name, department, discount) values (12, 'Vinegar - Raspberry', 'Baby', 62);");
                statement.executeUpdate("insert into products  (id, product_name, department, discount) values (13, 'Tarts Assorted', 'Automotive', 69);");
                statement.executeUpdate("insert into products  (id, product_name, department, discount) values (14, 'Wine - Sawmill Creek Autumn', 'Tools', 65);");
                statement.executeUpdate("insert into products  (id, product_name, department, discount) values (15, 'Cheese - Parmesan Cubes', 'Automotive', 7);");
                statement.executeUpdate("insert into products  (id, product_name, department, discount) values (16, 'Mousse - Banana Chocolate', 'Shoes', 27);");
                statement.executeUpdate("insert into products  (id, product_name, department, discount) values (17, 'Lemonade - Natural, 591 Ml', 'Grocery', 82);");
                statement.executeUpdate("insert into products  (id, product_name, department, discount) values (18, 'Turkey - Ground. Lean', 'Movies', 23);");
                statement.executeUpdate("insert into products  (id, product_name, department, discount) values (19, 'Pepper - Red Chili', 'Shoes', 27);");
                statement.executeUpdate("insert into products  (id, product_name, department, discount) values (20, 'Nestea - Iced Tea', 'Grocery', null);");
                statement.executeUpdate("insert into products  (id, product_name, department, discount) values (21, 'Halibut - Fletches', 'Grocery', 93);");
                statement.executeUpdate("insert into products  (id, product_name, department, discount) values (22, 'French Pastries', 'Kids', 92);");
                statement.executeUpdate("insert into products  (id, product_name, department, discount) values (23, 'Fond - Chocolate', 'Clothing', 99);");
                statement.executeUpdate("insert into products  (id, product_name, department, discount) values (24, 'Broom - Corn', 'Health', null);");
                statement.executeUpdate("insert into products  (id, product_name, department, discount) values (25, 'Veal - Brisket, Provimi, Bone - In', 'Books', 22);");
                statement.executeUpdate("insert into products  (id, product_name, department, discount) values (26, 'Tart Shells - Sweet, 2', 'Computers', 15);");
                statement.executeUpdate("insert into products  (id, product_name, department, discount) values (27, 'Flower - Daisies', 'Kids', 6);");
                statement.executeUpdate("insert into products  (id, product_name, department, discount) values (28, 'Sword Pick Asst', 'Books', null);");
                statement.executeUpdate("insert into products  (id, product_name, department, discount) values (29, 'Pasta - Canelloni', 'Books', 35);");
                statement.executeUpdate("insert into products  (id, product_name, department, discount) values (30, 'Cut Wakame - Hanawakaba', 'Music', 9);");

               statement.executeUpdate("DELETE FROM buyers WHERE id = 21;");
                statement.executeUpdate("DELETE FROM buyers WHERE city = 'Ohio';");

                statement.executeUpdate("DELETE FROM buyers WHERE country = 'Japan';");
                statement.executeUpdate("DELETE FROM products WHERE department = 'Music';");
                statement.executeUpdate("DELETE FROM products WHERE discount > 85;");
               */
               String sqlScript = "SELECT first_name, last_name, country  from buyers";
               ResultSet resultSet = statement.executeQuery(sqlScript);
                int count = 1;
                while (resultSet.next()) {
                    System.out.print(count++ + ")" + resultSet.getString(1) + "  ");
                    System.out.print(resultSet.getString(2) + "  ");
                    System.out.println(resultSet.getString(3) + "  ");
                }
                System.out.println('\n');
                String sqlScript1 = "SELECT first_name, last_name, email  from buyers";
                ResultSet resultSet1 = statement.executeQuery(sqlScript1);
                int count1 = 1;
                while (resultSet1.next()) {

                    System.out.print(count1++ + ")" + resultSet1.getString(1) + "  ");
                    System.out.print(resultSet1.getString(2) + "  ");
                    System.out.println(resultSet1.getString(3) + "  ");
                }
                System.out.println('\n');
                String sqlScript2 = "SELECT DISTINCT city FROM buyers";
                ResultSet resultSet2 = statement.executeQuery(sqlScript2);
                int count2 = 1;
                while (resultSet2.next()) {

                    System.out.println(count2++ + ")" + resultSet2.getString(1));
                }
                System.out.println('\n');
                String sqlScript3 = "SELECT DISTINCT country FROM buyers";
                ResultSet resultSet3 = statement.executeQuery(sqlScript3);
                int count3 = 1;
                while (resultSet3.next()) {

                    System.out.println(count3++ + ")" + resultSet3.getString(1));
                }

                System.out.println('\n');
                String sqlScript4 = "SELECT first_name, last_name, country  from buyers WHERE city='Novosibirsk'";
                ResultSet resultSet4 = statement.executeQuery(sqlScript4);
                int count4 = 1;
                while (resultSet4.next()) {
                    System.out.print(count4++ + ")" + resultSet4.getString(1) + "  ");
                    System.out.print(resultSet4.getString(2) + "  ");
                    System.out.println(resultSet4.getString(3) + "  ");
                }

                System.out.println('\n');
                String sqlScript5 = "SELECT product_name, department, discount  from products WHERE discount>50";
                ResultSet resultSet5 = statement.executeQuery(sqlScript5);
                int count5 = 1;
                while (resultSet5.next()) {
                    System.out.print(count5++ + "." + resultSet5.getString(1) + " | ");
                    System.out.print(resultSet5.getString(2) + " | ");
                    System.out.println(resultSet5.getInt(3) + "%"+"  ");
                }
               /*
                 statement.executeQuery("");//select считывать таблицы
                statement.execute("");//select в формате bool
                statement.executeUpdate("");//Drop,update,insert,create,delete кол-во изменений
             */
            }

        }
        catch (Exception e) {
            System.out.println("Not Connect");
            throw new RuntimeException(e);
        }
    }

}