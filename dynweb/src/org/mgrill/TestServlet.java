package org.mgrill;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    static String PAGE_HEADER = "<html><head><title>helloworld</title></head><body>";

    static String PAGE_FOOTER = "</body></html>";
	
    @Inject
    HelloService helloService;

    
  	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		 resp.setContentType("text/html");
	        PrintWriter writer = resp.getWriter();
	        writer.println(PAGE_HEADER);
	        writer.println("<h1>" + helloService.createHelloMessage("World222") + "</h1>");
	        writer.println("<h1>demo24566</h1>");
	        writer.println(PAGE_FOOTER);
	        writer.close();
	}


}
