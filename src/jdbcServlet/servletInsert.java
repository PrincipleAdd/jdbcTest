package jdbcServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servletInsert")
public class servletInsert extends HttpServlet
{
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		String id1 =new String(request.getParameter("ID1").getBytes("ISO8859-1"),"UTF-8");
		String name1 =new String(request.getParameter("name1").getBytes("ISO8859-1"),"UTF-8");
		String strAge1 =new String(request.getParameter("age1").getBytes("ISO8859-1"),"UTF-8");
		int age1 = Integer.parseInt(strAge1);
		String id2 =new String(request.getParameter("ID2").getBytes("ISO8859-1"),"UTF-8");
		String name2 =new String(request.getParameter("name2").getBytes("ISO8859-1"),"UTF-8");
		String strAge2 =new String(request.getParameter("age2").getBytes("ISO8859-1"),"UTF-8");
		int age2 = Integer.parseInt(strAge2);
		String id3 =new String(request.getParameter("ID3").getBytes("ISO8859-1"),"UTF-8");
		String name3 =new String(request.getParameter("name3").getBytes("ISO8859-1"),"UTF-8");
		String strAge3 =new String(request.getParameter("age3").getBytes("ISO8859-1"),"UTF-8");
		int age3 = Integer.parseInt(strAge3);
		
		jdbcInsert test = new jdbcInsert();
		test.setID1(id1);
		test.setName1(name1);
		test.setAge1(age1);
		test.setID2(id2);
		test.setName2(name2);
		test.setAge2(age2);
		test.setID3(id3);
		test.setName3(name3);
		test.setAge3(age3);
		test.insert();
		
		System.out.println(id1);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		doGet(request, response);
	}
}