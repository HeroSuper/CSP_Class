package com.ac.company;

import java.io.IOException;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SelectAllMember extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
	PersistenceManager pm = MemberManager.getManager();
	Query q = pm.newQuery(Member.class);
	List<Member> memberList = (List<Member>)q.execute();
	
	resp.setCharacterEncoding("UTF-8");
	resp.setContentType("text/html");
	
	resp.getWriter().println("<html>");
	resp.getWriter().println("<body>");
	resp.getWriter().println("<table>");
	resp.getWriter().println("<tr>");
	resp.getWriter().println("<th>index</th>");
	resp.getWriter().println("<th>ID</th>");
	resp.getWriter().println("<th>이름</th>");
	resp.getWriter().println("<th>학번</th>");
	resp.getWriter().println("<th>전화번호</th>");
	resp.getWriter().println("<th>메일주소</th>");
	resp.getWriter().println("<th>카카오톡 아이디</th>");
	resp.getWriter().println("<th>팀장여부</th>");
	resp.getWriter().println("<th>git허브 ID</th>");
	resp.getWriter().println("</tr>");
	
	for(Member m:memberList){
		resp.getWriter().println("<tr>");
		resp.getWriter().println("<th>"+ m.getIndex() +"</th>");
		resp.getWriter().println("<th>"+ m.getId() +"</th>");
		resp.getWriter().println("<th>"+ m.getName()+"</th>");
		resp.getWriter().println("<th>"+ m.getStdNum()+"</th>");
		resp.getWriter().println("<th>"+ m.getPhoneNum()+"</th>");
		resp.getWriter().println("<th>"+ m.getMailAddrass()+"</th>");
		resp.getWriter().println("<th>"+ m.getKaId()+"</th>");
		
		if (m.getBossCheck() == true) {
			resp.getWriter().println("<td>" + "팀장" + "</td>");
		} else {
			resp.getWriter().println("<td>" + "팀원" + "</td>");
		}
		
		resp.getWriter().println("<th>"+ m.getGitId()+"</th>");
		resp.getWriter().println("</tr>");
	}
	
	resp.getWriter().println("<table>");
	resp.getWriter().println("</body>");
	resp.getWriter().println("</html>");
	
	}
}
