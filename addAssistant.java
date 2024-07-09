import java.sql.*;
import java.util.Vector;

public class addAssistant {

    //连接地址:格式为：jdbc:mysql://localhost:端口号(默认为3306)/数据库名称
    private static String Url = "jdbc:sqlserver://localhost:1433;database=TicketManagerSystem";
    //用户名
    private static String User = "DongranReal";
    //用户密码:这里是自己电脑上数据库的密码
    private static String Password = "102938475647382";
    public void Using_1(int id ,String name, String sex, String enterTime) {

        Connection con = null;
        try{
            //2、获取数据库连接
            con = DriverManager.getConnection(Url,User,Password);
            System.out.println("获取数据库连接成功！");
            System.out.println("进行数据库操作！");



            //执行sql语句
            PreparedStatement preparedStatement = con.prepareStatement("insert into assistant values (?, ?, ?, ?)");
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, sex);
            preparedStatement.setString(4, enterTime);
            int ina = preparedStatement.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("获取数据库连接失败！");
        }
        finally {
            try{
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

}
