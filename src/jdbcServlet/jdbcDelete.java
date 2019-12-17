package jdbcServlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcDelete
{
	public static String myName;

	void setName(String name)
	{
		myName = name;
	}

	public static void delete()
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

				String sql = "delete from student where name=?;";
				PreparedStatement ps = conn.prepareStatement(sql);

				ps.setString(1,myName);

				ps.executeUpdate();

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
