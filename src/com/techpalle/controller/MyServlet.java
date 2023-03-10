package com.techpalle.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techpalle.dao.DataAccess;
import com.techpalle.model.Student;


@WebServlet("/My")
public class MyServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//read the data given by user/student
		String name=request.getParameter("tbName");
		String email=request.getParameter("tbEmail");
		String qual=request.getParameter("tbQual");
		String password=request.getParameter("tbPass");
		String mobile1=request.getParameter("tbMob");
		//reading in string type of vari and then converted to long(wrapper class)
		long mobile=Long.parseLong(mobile1);
		
		/*or 
		 * long mobile=Long.parseLong(request.getParameter("tbMob"));
		 */
		
		//add above data to student object
		Student stud=new Student(name,email,qual,password,mobile);
		
		//call the insertStu method and pass above value as i/p
		DataAccess.insertStudent(stud);
		
		//redirect user to login.html page
		//response.getWriter().append("<h1>Data is Inserted...</h1>");(success msg)
		//sendRed method only for direct not will transfer data
		//response.sendRedirect("login.jsp");
		
		//redirect to login.jsp and transfer the data from reg.html to login.jsp
		RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
		//write the code to transfer data
		//(now im not writing)
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		doGet(request, response);
	}

}
