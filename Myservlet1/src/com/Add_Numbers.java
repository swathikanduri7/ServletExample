package com;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;
public class Add_Numbers extends HttpServlet{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void service(HttpServletRequest request,HttpServletResponse response) throws IOException
{
int num1 = Integer.parseInt(request.getParameter("num1"));
int num2 = Integer.parseInt(request.getParameter("num2"));
int sum = num1 + num2;
int product = num1 * num2;
PrintWriter output = response.getWriter();
output.println("The Answer :"+sum +"\n The product :"+product);
}
}
