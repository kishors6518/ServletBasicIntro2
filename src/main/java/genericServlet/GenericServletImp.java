package genericServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class GenericServletImp extends GenericServlet{
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		arg1.setContentType("text/html");
		PrintWriter pr=arg1.getWriter();
		
		pr.println("<html>");
		pr.println("<body>");
		pr.println("<p>Hii, my name is Kishor Shembe.<br> I am from Latur but now I live in Pune for technical education.");
		pr.println("</html>");
		pr.println("</body>");
		
	}

}
