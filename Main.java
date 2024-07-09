import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Vector;

public class Main{
    public static void main(String[] args) throws URISyntaxException, IOException {

        //整体
        JFrame jf = new JFrame("后台管理系统管理员登录");
        jf.setSize(500, 500);
        jf.getContentPane().setBackground(Color.darkGray); //这块要改成这样才能显示
        jf.setVisible(true);
        jf.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //布局-面板
        GridLayout layout = new GridLayout();
        layout.setRows(2);
        jf.setLayout(layout);

        Panel top = new Panel();
        top.setBackground(Color.DARK_GRAY);
        jf.add(top);
        Panel low = new Panel();
        top.setBackground(Color.LIGHT_GRAY);
        jf.add(low);


        //菜单
        MenuBar bar = new MenuBar();
        Menu menu1 = new Menu("Sign up");
        Menu menu2 = new Menu("Settings");
        Menu menu3 = new Menu("Petrol");
        Menu menu4 = new Menu("Manager");
        CheckboxMenuItem item1 = new CheckboxMenuItem("VIP Assess");
        item1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame jf7 = new JFrame("请充值SVIP");
                jf7.setSize(500, 500);
                jf7.getContentPane().setBackground(Color.darkGray); //这块要改成这样才能显示
                jf7.setVisible(true);
                jf7.setCursor(new Cursor(Cursor.HAND_CURSOR));
                jf7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                GridLayout gridLayout = new GridLayout();
                gridLayout.setColumns(3);
                JPanel jPanel = new JPanel();
                jf7.add(jPanel);
                JLabel jLabel = new JLabel("");
                jLabel.setFont(new Font("Times New Roman",  Font.BOLD, 40));
                JTextArea jTextArea = new JTextArea();
                jTextArea.setPreferredSize(new Dimension(150, 70));
                JButton jButton = new JButton("最终确认");
                jButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        JFrame jf8 = new JFrame("SVIP窗口");
                        jf8.setSize(500, 500);
                        jf8.getContentPane().setBackground(Color.darkGray); //这块要改成这样才能显示
                        jf8.setVisible(true);
                        jf8.setCursor(new Cursor(Cursor.HAND_CURSOR));
                        jf8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                        JPanel  jPanel19 = new JPanel();
                        jPanel19.setFont(new Font("Times New Roman",  Font.BOLD, 40));

                    }
                });

                jPanel.add(jLabel);
                jPanel.add(jTextArea);
                jPanel.add(jButton);
                jf7.add(jPanel);

            }
        });

        menu4.add(item1);
        bar.add(menu1);
        bar.add(menu2);
        bar.add(menu3);
        bar.add(menu4);

        jf.setMenuBar(bar);


        //注册/登录
        GridLayout gridLayout2 = new GridLayout();
        gridLayout2.setRows(3);
        top.setLayout(gridLayout2);

        Label label1 = new Label("Sign in / Sign up");
        label1.setSize(150, 30);
        label1.setFont(new Font("Times New Roman", Font.BOLD, 30));
        top.add(label1);

        FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT);
        Panel panel2 = new Panel();
        panel2.setLayout(flowLayout);

        TextField textField1 = new TextField("请输入密码");
        textField1.setBounds(0, 250, 300, 40);
        panel2.add(textField1);

        Button button1 = new Button("OK");
        button1.setBounds(210, 250, 50, 30);
        panel2.add(button1);

        top.add(panel2);

        Checkbox checkbox = new Checkbox("Remember Password");
        checkbox.setSize(100, 20);
        top.add(checkbox);

        Button button_Click_School_Web = new Button("LNTU");
        button_Click_School_Web.setSize(150, 80);
        low.addMouseMotionListener(new MouseMotionListener() {

            @Override
            public void mouseDragged(MouseEvent e) {
            }

            @Override
            public void mouseMoved(MouseEvent e) {

                button_Click_School_Web.setLocation(e.getX(), e.getY());

            }
        });
        button_Click_School_Web.setFont(new Font("Times New Roman", Font.BOLD, 60));
        button_Click_School_Web.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = "https://www.lntu.edu.cn/";
                Desktop desktop = Desktop.getDesktop();
                try {
                    desktop.browse(new URI(url));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                } catch (URISyntaxException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        low.add(button_Click_School_Web);

        //登录事件
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String checking = "666666";
                String input = textField1.getText().toString();

                try {
                    if (checking.equals(input)){

                        JFrame jf1 = new JFrame("后台界面");
                        jf1.setSize(2000, 1600);
                        jf1.getContentPane().setBackground(Color.darkGray);
                        jf1.setVisible(true);
                        jf1.setCursor(new Cursor(Cursor.HAND_CURSOR));
                        jf1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

                        GridLayout gridLayout3 = new GridLayout();
                        gridLayout3.setRows(2);
                        gridLayout3.setColumns(2);
                        jf1.setLayout(gridLayout3);


                        Font font = new Font("Times New Roman", Font.BOLD, 80);

                        Button button3_0 = new Button("Scenic spot");
                        button3_0.setBackground(Color.GRAY);
                        button3_0.setFont(font);
                        button3_0.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                                JFrame jf2 = new JFrame("景区界面");
                                jf2.setSize(2000, 1600);
                                jf2.getContentPane().setBackground(Color.darkGray);
                                jf2.setVisible(true);
                                jf2.setCursor(new Cursor(Cursor.HAND_CURSOR));
                                jf2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

                                GridLayout gridLayout4 = new GridLayout();
                                gridLayout4.setColumns(3);
                                gridLayout4.setRows(4);
                                jf2.setLayout(gridLayout4);

                                ImageIcon imageIcon0 = new ImageIcon(getClass().getResource("312.jpg"));//注意，得用这个！！！
                                ImageIcon imageIcon1 = new ImageIcon(getClass().getResource("311.jpg"));
                                ImageIcon imageIcon2 = new ImageIcon(getClass().getResource("421.jpg"));
                                ImageIcon imageIcon3 = new ImageIcon(getClass().getResource("二食堂.jpg"));
                                ImageIcon imageIcon4 = new ImageIcon(getClass().getResource("一食堂.jpg"));
                                ImageIcon imageIcon5 = new ImageIcon(getClass().getResource("体育场.jpg"));
                                ImageIcon imageIcon6 = new ImageIcon(getClass().getResource("天猫校园.jpg"));
                                ImageIcon imageIcon7 = new ImageIcon(getClass().getResource("尔雅.jpg"));
                                ImageIcon imageIcon8 = new ImageIcon(getClass().getResource("靖远.jpg"));
                                ImageIcon imageIcon9 = new ImageIcon(getClass().getResource("乒乓球.jpg"));

                                JButton jbutton4_0 = new JButton("E1-312",imageIcon0);
                                JButton jbutton4_1 = new JButton("E1-311", imageIcon1);
                                JButton jbutton4_2 = new JButton("E1-421", imageIcon2);
                                JButton jbutton4_3 = new JButton("Double食堂", imageIcon3);
                                JButton jbutton4_4 = new JButton("First食堂", imageIcon4);
                                JButton jbutton4_5 = new JButton("靖远楼", imageIcon5);
                                JButton jbutton4_6 = new JButton("天茂校园", imageIcon6);
                                JButton jbutton4_7 = new JButton("而雅楼", imageIcon7);
                                JButton jbutton4_8 = new JButton("靖远楼", imageIcon8);
                                JButton jbutton4_9 = new JButton("乒乓球馆", imageIcon9);

                                jf2.add(jbutton4_0);
                                jf2.add(jbutton4_1);
                                jf2.add(jbutton4_2);
                                jf2.add(jbutton4_3);
                                jf2.add(jbutton4_4);
                                jf2.add(jbutton4_5);
                                jf2.add(jbutton4_6);
                                jf2.add(jbutton4_7);
                                jf2.add(jbutton4_8);
                                jf2.add(jbutton4_9);

                            }
                        });

                        Button button3_1 = new Button("Manager operate");
                        button3_1.setBackground(Color.GRAY);
                        button3_1.setFont(font);
                        button3_1.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                                JFrame jf3 = new JFrame("VIP操作");
                                jf3.setSize(2000, 1600);
                                jf3.getContentPane().setBackground(Color.darkGray);
                                jf3.setVisible(true);
                                jf3.setCursor(new Cursor(Cursor.HAND_CURSOR));
                                jf3.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

                                JPanel jpanel1 = new JPanel();

                                GridLayout gridLayout4 = new GridLayout();
                                gridLayout4.setColumns(4);
                                jf3.setLayout(gridLayout4);

                                GridLayout gridLayout5 = new GridLayout();
                                gridLayout5.setRows(4);
                                JPanel jPanel2 = new JPanel();
                                jPanel2.setLayout(gridLayout5);

                                Panel panel0 = new Panel();
                                Panel panel1 = new Panel();
                                Panel panel2 = new Panel();
                                Panel panel3 = new Panel();


                                TextField textField1 = new TextField();
                                textField1.setSize(200, 20);
                                textField1.setFont(new Font("Times New Roman", Font.BOLD, 20));
                                textField1.setPreferredSize(new Dimension(300,70));

                                TextField textField2 = new TextField();
                                textField2.setSize(200, 20);
                                textField2.setFont(new Font("Times New Roman", Font.BOLD, 20));
                                textField2.setPreferredSize(new Dimension(300,70));

                                TextField textField3 = new TextField();
                                textField3.setSize(200, 20);
                                textField3.setFont(new Font("Times New Roman", Font.BOLD, 20));
                                textField3.setPreferredSize(new Dimension(300,70));

                                TextField textField4 = new TextField();
                                textField4.setSize(200, 20);
                                textField4.setFont(new Font("Times New Roman", Font.BOLD, 20));
                                textField4.setPreferredSize(new Dimension(300,70));

                                panel0.add(textField1);
                                panel1.add(textField2);
                                panel2.add(textField3);
                                panel3.add(textField4);
                                jPanel2.add(panel0);
                                jPanel2.add(panel1);
                                jPanel2.add(panel2);
                                jPanel2.add(panel3);
                                jpanel1.add(jPanel2);
                                jf3.add(jpanel1);

                                JButton jButton1 = new JButton("Enter To Submit");
                                jButton1.setSize(240, 200);
                                jButton1.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        int a1 = Integer.parseInt(textField1.getText().toString());
                                        int a2 = Integer.parseInt(textField2.getText().toString());
                                        String a3 = textField3.getText().toString();
                                        int a4 = Integer.parseInt(textField4.getText().toString());

                                        AdderCustomerTicket adderCustomerTicket = new AdderCustomerTicket();
                                        adderCustomerTicket.Using_1(a1, a2, a3, a4);

                                    }
                                });

                                jpanel1.add(jButton1);

                                MenuBar menuBar1 = new MenuBar();
                                Menu menu1 = new Menu("DifferOpe / Flashing");
                                Menu menu2 = new Menu("UserName");
                                MenuItem menuItem = new MenuItem("SaleTable");
                                MenuItem menuItem1 = new MenuItem("AssistantTable");
                                MenuItem menuItem2 = new MenuItem("CustomerTable");
                                MenuItem menuItem3 = new MenuItem("ManageTable");
                                MenuItem menuItem4 = new MenuItem("viewAreaTable");
                                menu1.add(menuItem);
                                menu1.add(menuItem1);
                                menu1.add(menuItem2);
                                menu1.add(menuItem3);
                                menu1.add(menuItem4);
                                menuBar1.add(menu1);
                                menuBar1.add(menu2);
                                jf3.setMenuBar(menuBar1);
                                JTabbedPane jTabbedPane = new JTabbedPane();
                                //panel.add(jTabbedPane);
                                jTabbedPane.setBounds(0, 0, 2000, 1600);
                                jf3.add(jTabbedPane);
                                menuItem.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        Vector<String> colNames1 = new Vector<>();
                                        colNames1.add("cust_id");
                                        colNames1.add("ass_id");
                                        colNames1.add("ticket_buy_time");
                                        colNames1.add("price_of_customer");
                                        Conn conn = new Conn();
                                        Vector<Vector<Object>> data1 = conn.Using_1();
                                        JTable table = new JTable(data1, colNames1);
                                        jTabbedPane.addTab("TableView1", table);


                                    }
                                });

                                jf3.setMenuBar(menuBar1);
                                menuItem1.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {



                                        Vector<String> colNames1 = new Vector<>();
                                        colNames1.add("ass_id");
                                        colNames1.add("ass_name");
                                        colNames1.add("ass_sex");
                                        colNames1.add("ass_enterTime");
                                        Conn1 conn1 = new Conn1();
                                        Vector<Vector<Object>> data2 = conn1.Using_1();
                                        JTable table = new JTable(data2, colNames1);
                                        jTabbedPane.addTab("TableView2", table);


                                    }
                                });

                                jf3.setMenuBar(menuBar1);
                                menuItem2.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {



                                        Vector<String> colNames1 = new Vector<>();
                                        colNames1.add("cust_id");
                                        colNames1.add("cust_name");
                                        colNames1.add("cust_age");
                                        colNames1.add("cust_isVIP");
                                        colNames1.add("cust_sex");
                                        Conn2 conn2 = new Conn2();
                                        Vector<Vector<Object>> data3 = conn2.Using_1();
                                        JTable table = new JTable(data3, colNames1);
                                        jTabbedPane.addTab("TableView3", table);

                                    }
                                });

                                jf3.setMenuBar(menuBar1);
                                menuItem3.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {



                                        Vector<String> colNames1 = new Vector<>();
                                        colNames1.add("view_point_id");
                                        colNames1.add("ass_id");
                                        Conn3 conn3 = new Conn3();
                                        Vector<Vector<Object>> data4 = conn3.Using_1();
                                        JTable table = new JTable(data4, colNames1);
                                        jTabbedPane.addTab("TableView4", table);


                                    }
                                });

                                jf3.setMenuBar(menuBar1);
                                menuItem4.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        Vector<String> colNames1 = new Vector<>();
                                        colNames1.add("view_point_id");
                                        colNames1.add("view_point_name");
                                        colNames1.add("open_time");
                                        colNames1.add("view_price_child");
                                        colNames1.add("view_price_general");
                                        colNames1.add("view_point_older");
                                        colNames1.add("view_Max_volume");
                                        Conn4 conn4 = new Conn4();
                                        Vector<Vector<Object>> data5 = conn4.Using_1();
                                        JTable table = new JTable(data5, colNames1);
                                        jTabbedPane.addTab("TableView5", table);

                                    }
                                });

                            }
                        });

                        Button button3_2 = new Button("Specification");
                        button3_2.setBackground(Color.GRAY);
                        button3_2.setFont(font);
                        button3_2.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                                JFrame jf7 = new JFrame("请充值SVIP");
                                jf7.setSize(1500, 1400);
                                jf7.getContentPane().setBackground(Color.darkGray); //这块要改成这样才能显示
                                jf7.setVisible(true);
                                jf7.setCursor(new Cursor(Cursor.HAND_CURSOR));
                                jf7.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

                                GridLayout gridLayout = new GridLayout();
                                gridLayout.setRows(3);
                                GridLayout gridLayout1 = new GridLayout();
                                gridLayout1.setRows(2);
                                jf7.setLayout(gridLayout1);
                                JPanel jPanel1 = new JPanel();
                                JPanel jPanel2 = new JPanel();
                                JLabel jLabel1 = new JLabel("Please Enter The Money Recharge!");
                                jLabel1.setFont(new Font("Times New Roman",  Font.BOLD, 40));
                                JTextArea jTextArea = new JTextArea();
                                jTextArea.setPreferredSize(new Dimension(150, 70));
                                JButton jButton = new JButton("最终确认");
                                jButton.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        JFrame jf8 = new JFrame("SVIP窗口--预测分析");
                                        jf8.setSize(1500, 1420);
                                        jf8.getContentPane().setBackground(Color.darkGray); //这块要改成这样才能显示
                                        jf8.setVisible(true);
                                        jf8.setCursor(new Cursor(Cursor.HAND_CURSOR));
                                        jf8.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

                                        JPanel jPanel19 = new JPanel();
                                        JLabel jLabel20 = new JLabel("This forecasting algorithm predicts the scenic trends for the coming week.");
                                        jLabel20.setFont(new Font("Times New Roman",  Font.BOLD, 40));



                                        JLabel jLabel3 = new JLabel(new ImageIcon(getClass().getResource("预测.png")));
                                        jPanel19.add(jLabel3);
                                        jPanel19.add(jLabel20);

                                        jf8.add(jPanel19);

                                    }
                                });

                                JLabel jLabel2 = new JLabel(new ImageIcon(getClass().getResource("QCard.jpg")));
                                jPanel2.add(jLabel2);

                                jf7.add(jPanel2);


                                jPanel1.add(jLabel1);
                                jPanel1.add(jTextArea);
                                jPanel1.add(jButton);
                                jf7.add(jPanel1);


                            }
                        });

                        Button button3_3 = new Button("Log out");
                        button3_3.setBackground(Color.GRAY);
                        button3_3.setFont(font);
                        button3_3.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                                JFrame jf4 = new JFrame("营业员管理");
                                jf4.setSize(2000, 1600);
                                jf4.getContentPane().setBackground(Color.darkGray);
                                jf4.setVisible(true);
                                jf4.setCursor(new Cursor(Cursor.HAND_CURSOR));
                                jf4.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

                                JPanel jPanel3 = new JPanel();
                                JPanel jPanel4 = new JPanel();

                                GridLayout gridLayout5 = new GridLayout();
                                gridLayout5.setColumns(2);
                                jf4.setLayout(gridLayout5);

                                GridLayout gridLayout6 = new GridLayout();
                                gridLayout6.setRows(7);
                                jPanel3.setLayout(gridLayout6);


                                TextField textField6 = new TextField("ass_id");
                                textField6.setSize(200, 20);
                                textField6.setFont(new Font("Times New Roman", Font.BOLD, 20));
                                textField6.setPreferredSize(new Dimension(300,70));

                                TextField textField7 = new TextField("ass_name");
                                textField7.setSize(200, 20);
                                textField7.setFont(new Font("Times New Roman", Font.BOLD, 20));
                                textField7.setPreferredSize(new Dimension(300,70));

                                TextField textField8 = new TextField("ass_sex");
                                textField8.setSize(200, 20);
                                textField8.setFont(new Font("Times New Roman", Font.BOLD, 20));
                                textField8.setPreferredSize(new Dimension(300,70));

                                TextField textField9 = new TextField("ass_enterTime");
                                textField9.setSize(200, 20);
                                textField9.setFont(new Font("Times New Roman", Font.BOLD, 20));
                                textField9.setPreferredSize(new Dimension(300,70));

                                jPanel3.add(textField6);
                                jPanel3.add(textField7);
                                jPanel3.add(textField8);
                                jPanel3.add(textField9);

                                JButton jButton6 = new JButton("添加");
                                jButton6.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        int id = Integer.parseInt(textField6.getText());
                                        String name = textField7.getText().toString();
                                        String sex = textField8.getText().toString();
                                        String date = textField9.getText().toString();
                                        addAssistant assistant = new addAssistant();
                                        assistant.Using_1(id, name, sex, date);

                                    }
                                });

                                JButton jButton7 = new JButton("删除");
                                jButton7.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {

                                        String name = textField9.getText().toString();
                                        deleteData_Ass deleteDataAss = new deleteData_Ass();
                                        deleteDataAss.Using_1(name);

                                    }
                                });

                                jPanel3.add(jButton6);

                                TextField textField10 = new TextField("离职营业员姓名");
                                textField10.setSize(200, 20);
                                textField10.setFont(new Font("Times New Roman", Font.BOLD, 20));
                                textField10.setPreferredSize(new Dimension(300,70));

                                jPanel3.add(textField10);
                                jPanel3.add(jButton7);

                                jf4.add(jPanel3);
                                jf4.add(jPanel4);

                                Vector<String> colNames1 = new Vector<>();
                                colNames1.add("ass_id");
                                colNames1.add("ass_name");
                                colNames1.add("ass_sex");
                                colNames1.add("ass_enterTime");
                                Conn1 conn1 = new Conn1();
                                Vector<Vector<Object>> data2 = conn1.Using_1();
                                JTable table = new JTable(data2, colNames1);
                                table.setSize(800, 800);
                                table.setPreferredSize(new Dimension(800, 800));
                                jPanel4.add(table);

                            }
                        });


                        jf1.add(button3_0);
                        jf1.add(button3_1);
                        jf1.add(button3_2);
                        jf1.add(button3_3);

                    }else{

                       JOptionPane.showMessageDialog(null,"请重新输入");

                    }
                }catch (NumberFormatException ee){}

            }
        });


    }
}