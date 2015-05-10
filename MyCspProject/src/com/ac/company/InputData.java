/*package com.ac.company;

import java.io.IOException;

import javax.jdo.PersistenceManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InputData {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		String index = req.getParameter("index");
		long lIndex = Long.parseLong(index);
		
		PersistenceManager pm = MemberManager.getManager();
		Member m = pm.getObjectById(Member.class, lIndex);
		
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String stdNum = req.getParameter("stdNum");
		String phoneNum = req.getParameter("phoneNum");
		String mailAddrass = req.getParameter("mailAddrass");
		String kaId = req.getParameter("kaId");
		boolean bossCheck = req.getParameter("bossCheck") != null;
		String gitId = req.getParameter("gitId");
		
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html");
		// 구조
		resp.getWriter().println("<html><body>");

		resp.getWriter().println("<h1>팀원정보 입력</h1>");

		// 개인정보를 출력할 테이블
		resp.getWriter().println("<table>");
		// 이름을 받아올 테이블
		// 변수명 : id
		resp.getWriter().println("<tr>");
		resp.getWriter().println("<td>ID</td>");
		resp.getWriter().println("<td>" + req.getParameter("id") + "</td>");
		resp.getWriter().println("</tr>");
		// 이름을 받아올 테이블
		// 변수명 : name
		resp.getWriter().println("<tr>");
		resp.getWriter().println("<td>이름</td>");
		resp.getWriter().println("<td>" + req.getParameter("name") + "</td>");
		resp.getWriter().println("</tr>");
		// 학번을 받아올 테이블 변수명
		// 변수명 : stdNum
		resp.getWriter().println("<tr>");
		resp.getWriter().println("<td>학번</td>");
		resp.getWriter().println("<td>" + req.getParameter("stdNum") + "</td>");
		resp.getWriter().println("</tr>");
		// 전화번호를 받아올 테이블
		// 변수명 : phoneNum
		resp.getWriter().println("<tr>");
		resp.getWriter().println("<td>전화번호</td>");
		resp.getWriter().println(
				"<td>" + req.getParameter("phoneNum") + "</td>");
		resp.getWriter().println("</tr>");
		// 메일주소를 받아올 테이블
		// 변수명 : mailAddrass
		resp.getWriter().println("<tr>");
		resp.getWriter().println("<td>메일주소</td>");
		resp.getWriter().println(
				"<td>" + req.getParameter("mailAddrass") + "</td>");
		resp.getWriter().println("</tr>");
		// 카카오톡 아이디
		// 변수명 : kaId
		resp.getWriter().println("<tr>");
		resp.getWriter().println("<td>카카오톡 아이디</td>");
		resp.getWriter().println("<td>" + req.getParameter("kaId") + "</td>");
		resp.getWriter().println("</tr>");
		// 팀장여부
		// 변수명 : bossCheck req.getParameter("boosCheck")
		boolean check = req.getParameter("bossCheck") != null;
		resp.getWriter().println("<tr>");
		resp.getWriter().println("<td>팀장여부</td>");
		if (check == true) {
			resp.getWriter().println("<td>" + "팀장" + "</td>");
		} else {
			resp.getWriter().println("<td>" + "팀원" + "</td>");
		}
		resp.getWriter().println("</tr>");
		// git 허브 아이디
		// 변수명 : gitId
		resp.getWriter().println("<tr>");
		resp.getWriter().println("<td>git허브 아이디</td>");
		resp.getWriter().println("<td>" + req.getParameter("gitId") + "</td>");
		resp.getWriter().println("</tr>");

		resp.getWriter().println("<tr>");
		resp.getWriter().println("<td><a href=\"MainPage.html\">처음으로</a></td>");
		resp.getWriter().println("</tr>");
		resp.getWriter().println("</table>");

		resp.getWriter().println("</body></html>");
	}
}
*/