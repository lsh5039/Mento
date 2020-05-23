package kr.co.mento;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginSer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/login.jsp");
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get Att -> set Att했을때만 쓴다.
		String id = request.getParameter("id");
		String pw= request.getParameter("password");
//		System.out.println("id : "+id);
//		System.out.println("pw : "+pw);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/result.jsp");
		
		//한 페이지에서 내용을 받아서 -> 서블릿에 받는다->다른페이지로 보낸다. 거기서 출력한다. 
		//한번씩만 실습해보고 오면 좋겠어요..!
		
		request.setAttribute("id", id);
		request.setAttribute("pw", pw);
		
		rd.forward(request, response);
		
	}

}
