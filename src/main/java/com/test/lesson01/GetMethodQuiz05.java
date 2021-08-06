package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz05")
public class GetMethodQuiz05 extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		Integer number = Integer.valueOf(request.getParameter("number"));
		
		out.print("<html><head><title>구구단 출력</title></head><body><ul>");
		for (int i = 1;i <= 9; i++) {
			out.print("<li>" + number + " X "+ i + " = " + (i*number) + "</li>");
		}
		out.print("</ul></body></html>");
		
	}
}
