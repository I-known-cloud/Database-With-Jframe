import java.sql.*;
import java.util.Vector;

public class proc1 {

    //连接地址:格式为：jdbc:mysql://localhost:端口号(默认为3306)/数据库名称
    private static String Url = "jdbc:sqlserver://localhost:1433;database=TicketManagerSystem";
    //用户名
    private static String User = "DongranReal";
    //用户密码:这里是自己电脑上数据库的密码
    private static String Password = "102938475647382";
    public void Using_1(int month) {

        Vector<Vector<Object>> sale_Query = new Vector<>();
        Connection con = null;
        try{
            //2、获取数据库连接
            con = DriverManager.getConnection(Url,User,Password);
            System.out.println("获取数据库连接成功！");
            System.out.println("进行数据库操作！");

            CallableStatement callableStatement = null;
            //执行sql语句
            callableStatement = con.prepareCall("{execute month_Sale (?)}");callableStatement.setInt(1, month);
            ResultSet resultSet1 = callableStatement.getResultSet();

            //打印结果集
            while (resultSet1.next()){



                Vector<Object> item_sale = new Vector<>();

                String s1 = resultSet1.getString("cust_id");
                String s2 = resultSet1.getString("ass_id");
                String s3 = resultSet1.getString("ticket_buy_time");
                String s4 = resultSet1.getString("price_of_customer");


                item_sale.addElement(s1);
                item_sale.addElement(s2);
                item_sale.addElement(s3);
                item_sale.addElement(s4);

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

    }

    public static void main(String[] args) {

        proc1 proc1 = new proc1();
        proc1.Using_1(1);

    }

}
