package jdbcServlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbcSelect
{
	public static String myID;

	void setID(String id)
	{
		myID = id;
	}

	public static void select()
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

				String sql = "select * from student where id = ?;";
				PreparedStatement ps = conn.prepareStatement(sql);

				ps.setString(1,myID);

				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					String cur_id = rs.getString(1);
					String cur_name = rs.getString(2);
					int cur_age = rs.getInt(3);
					System.out.println(cur_id + "\t" + cur_name+"\t"+cur_age);
				}

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
