package uk.ac.swan.atm42.web;

// : c15:servlets:ServletsRule.java
//From 'Thinking in Java, 2nd ed.' by Bruce Eckel
//www.BruceEckel.com. See copyright notice in CopyRight.txt.

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res)
			throws IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<html><head><title>");
		out.print("Hello world servlet");
		out.print("</title></head><body>");
		out.print("<h1>Hello AT-M42 Class of 2009</h1>");
		out,print("<p>I am a Java Servlet</p>")
		out.print("</body></html>");
		out.close();
	}
} ///:~
