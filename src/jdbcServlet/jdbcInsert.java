package jdbcServlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcInsert
{
	public static String myID1;
	public static String myName1;
	public static int myAge1;
	public static String myID2;
	public static String myName2;
	public static int myAge2;
	public static String myID3;
	public static String myName3;
	public static int myAge3;

	void setID1(String id1)
	{
		myID1 = id1;
	}

	void setName1(String name1)
	{
		myName1 = name1;
	}

	void setAge1(int age1)
	{
		myAge1 = age1;
	}

	void setID2(String id2)
	{
		myID2 = id2;
	}

	void setName2(String name2)
	{
		myName2 = name2;
	}

	void setAge2(int age2)
	{
		myAge2 = age2;
	}

	void setID3(String id3)
	{
		myID3 = id3;
	}

	void setName3(String name3)
	{
		myName3 = name3;
	}

	void setAge3(int age3)
	{
		myAge3 = age3;
	}

	public static void insert()
	{
		try {
			// 加载数据库驱动，注册到驱动管理器
			Class.forName("com.mysql.jdbc.Driver");
			// 数据库连接字符串
			String url = "jdbc:mysql://localhost:3306/mysql_javaee";
			// 数据库用户名
			String username = "root";
			// 数据库密码
			String password = "7890";
			// 创建Connection连接
			Connection conn = DriverManager.getConnection(url, username, password);
//			System.out.println();
			// 判断 数据库连接是否为空
			if (conn != null) {
				// 输出连接信息

				String sql = "insert into student value(?,?,?);";
				PreparedStatement ps = conn.prepareStatement(sql);

				ps.setString(1,myID1);
				ps.setString(2,myName1);
				ps.setInt(3,myAge1);
				ps.addBatch();

				ps.setString(1,myID2);
				ps.setString(2,myName2);
				ps.setInt(3,myAge2);
				ps.addBatch();
				
				ps.setString(1,myID3);
				ps.setString(2,myName3);
				ps.setInt(3,myAge3);
				ps.addBatch();

				ps.executeBatch();

				// 关闭数据库连接
				conn.close();
			} else {
				// 输出连接信息
				System.out.println("数据库连接失败！");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
