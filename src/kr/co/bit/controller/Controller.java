package kr.co.bit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controller extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		String cmd= req.getParameter("cmd");
		
		if(cmd==null) {
			cmd="";
			
		}
		String url = "./mvc/home.jsp";
		
		if(cmd.equals("viewRigist")) {
			
			url = "./mvc/regist_member.jsp";
		}
		else if(cmd.equals("serch_zip")) {
			
			url = "./serch_zip.jsp";
		}else if(cmd.equals("zipAll")) {
			
			
			
			url = "./serch_zip.jsp";
		}
	
		RequestDispatcher rd = req.getRequestDispatcher(url);
		rd.forward(req, resp);
	}

}
