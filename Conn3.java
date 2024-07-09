import java.sql.*;
import java.util.Vector;

public class Conn3 {

    //连接地址:格式为：jdbc:mysql://localhost:端口号(默认为3306)/数据库名称
    private static String Url = "jdbc:sqlserver://localhost:1433;database=TicketManagerSystem";
    //用户名
    private static String User = "DongranReal";
    //用户密码:这里是自己电脑上数据库的密码
    private static String Password = "102938475647382";
    public Vector<Vector<Object>> Using_1() {

        Vector<Vector<Object>> sale_Query = new Vector<>();
        Connection con = null;
        try{
            //2、获取数据库连接
            con = DriverManager.getConnection(Url,User,Password);
            System.out.println("获取数据库连接成功！");
            System.out.println("进行数据库操作！");
            //执行sql语句
            Statement statement = con.createStatement();
            ResultSet resultSet1 = statement.executeQuery("select * from manage");

            Vector<Object> col = new Vector<>();
            col.add("view_point_id");
            col.add("ass_id");

            sale_Query.addElement(col);

            //打印结果集
            while (resultSet1.next()){



                Vector<Object> item_sale = new Vector<>();

                String s1 = resultSet1.getString("view_point_id");
                String s2 = resultSet1.getString("ass_id");


                item_sale.addElement(s1);
                item_sale.addElement(s2);

                sale_Query.addElement(item_sale);

            }
            System.out.println(sale_Query);

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

        return sale_Query;

    }



}
