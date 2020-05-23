package kr.co.mento;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/join")
public class JoinSer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//URL이 추가된다->별로 쓸모없는정보(검색)
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/join.jsp");//주소값 연결
		//내가 지정한 데이터를 들고갈수있다.
		
		String str="jsp수업입니다.";
		
		request.setAttribute("str",str);
		
		rd.forward(request, response);//그리로 이동
	}

	//URL추가되지 않는다. -> 보안이 되어야 할 정보(로그인 정보)
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
