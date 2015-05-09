/**
 * 
 */
package headfirst.web;

import headfirst.model.BeerExpert;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author admin
 *
 */
public class BeerSelect extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out= resp.getWriter();
		out.println("Beere Selection Advice <br>");
		String c=req.getParameter("color");
		out.println("<br> Got beer color " +c); 
		
		List <String> brands=new BeerExpert().getBrands(c);
		out.println("<br> Experts give you advice, try: " );
		for(String b: brands){
			out.println("<br>" +b);
		}
	}

	
	
	
}
