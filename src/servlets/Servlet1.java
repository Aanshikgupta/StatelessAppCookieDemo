package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Servlet1 extends HttpServlet{

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		
		String name=req.getParameter("name");
		
		pw.write("<h1>Hello "+name+"</h1>");
		pw.write("<h2><a href='servlet2'>Move to servlet 2</a></h2>");
		Cookie c=new Cookie("name",name);
		
		res.addCookie(c);
	}
}
