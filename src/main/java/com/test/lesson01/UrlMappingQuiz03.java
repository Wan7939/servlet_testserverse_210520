package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz03")
public class UrlMappingQuiz03 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>뉴스</html></head><body></body></title>");
		out.println("<strong>" + "[단독] 고양이가 야옹해" + "</strong>" + "<br>");
		Date today = new Date();
		SimpleDateFormat time = new SimpleDateFormat(
				"기사 입력 시간:" + "yyyy/MM/dd hh:mm:ss");
		out.println(time.format(today));
		out.println("<hr>");
		out.println("끝");
	}
}
