package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class Servlet2 extends HttpServlet{

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		
		Cookie[] cookies=req.getCookies();
		
		String name=null;
		if(cookies!=null) {
			name=cookies[0].getValue();
		}
		
		
		
		pw.write("<h1>Hello "+name+"</h1>");
	}
	
}
