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
		// ����
		resp.getWriter().println("<html><body>");

		resp.getWriter().println("<h1>�������� �Է�</h1>");

		// ���������� ����� ���̺�
		resp.getWriter().println("<table>");
		// �̸��� �޾ƿ� ���̺�
		// ������ : id
		resp.getWriter().println("<tr>");
		resp.getWriter().println("<td>ID</td>");
		resp.getWriter().println("<td>" + req.getParameter("id") + "</td>");
		resp.getWriter().println("</tr>");
		// �̸��� �޾ƿ� ���̺�
		// ������ : name
		resp.getWriter().println("<tr>");
		resp.getWriter().println("<td>�̸�</td>");
		resp.getWriter().println("<td>" + req.getParameter("name") + "</td>");
		resp.getWriter().println("</tr>");
		// �й��� �޾ƿ� ���̺� ������
		// ������ : stdNum
		resp.getWriter().println("<tr>");
		resp.getWriter().println("<td>�й�</td>");
		resp.getWriter().println("<td>" + req.getParameter("stdNum") + "</td>");
		resp.getWriter().println("</tr>");
		// ��ȭ��ȣ�� �޾ƿ� ���̺�
		// ������ : phoneNum
		resp.getWriter().println("<tr>");
		resp.getWriter().println("<td>��ȭ��ȣ</td>");
		resp.getWriter().println(
				"<td>" + req.getParameter("phoneNum") + "</td>");
		resp.getWriter().println("</tr>");
		// �����ּҸ� �޾ƿ� ���̺�
		// ������ : mailAddrass
		resp.getWriter().println("<tr>");
		resp.getWriter().println("<td>�����ּ�</td>");
		resp.getWriter().println(
				"<td>" + req.getParameter("mailAddrass") + "</td>");
		resp.getWriter().println("</tr>");
		// īī���� ���̵�
		// ������ : kaId
		resp.getWriter().println("<tr>");
		resp.getWriter().println("<td>īī���� ���̵�</td>");
		resp.getWriter().println("<td>" + req.getParameter("kaId") + "</td>");
		resp.getWriter().println("</tr>");
		// ���忩��
		// ������ : bossCheck req.getParameter("boosCheck")
		boolean check = req.getParameter("bossCheck") != null;
		resp.getWriter().println("<tr>");
		resp.getWriter().println("<td>���忩��</td>");
		if (check == true) {
			resp.getWriter().println("<td>" + "����" + "</td>");
		} else {
			resp.getWriter().println("<td>" + "����" + "</td>");
		}
		resp.getWriter().println("</tr>");
		// git ��� ���̵�
		// ������ : gitId
		resp.getWriter().println("<tr>");
		resp.getWriter().println("<td>git��� ���̵�</td>");
		resp.getWriter().println("<td>" + req.getParameter("gitId") + "</td>");
		resp.getWriter().println("</tr>");

		resp.getWriter().println("<tr>");
		resp.getWriter().println("<td><a href=\"MainPage.html\">ó������</a></td>");
		resp.getWriter().println("</tr>");
		resp.getWriter().println("</table>");

		resp.getWriter().println("</body></html>");
	}
}
*/