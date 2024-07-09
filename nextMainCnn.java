import java.sql.*;


public class nextMainCnn {

    String url = "jdbc:sqlserver://localhost:1433;database=TicketManagerSystem";
    String name = "DongranReal";
    String Password = "102938475647382";
    Connection connection = DriverManager.getConnection(url,name,Password);
    Statement statement = connection.createStatement();

    String search = "select * from sale";
    ResultSet resultSet = statement.executeQuery(search);



    public nextMainCnn() throws SQLException {
    }

    public static void main(String[] args) throws SQLException {
        nextMainCnn c = new nextMainCnn();
        System.out.println(c.resultSet);
    }
}




