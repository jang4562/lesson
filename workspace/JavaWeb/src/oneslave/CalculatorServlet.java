package oneslave;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/calc")
@SuppressWarnings("serial") // 경고 무시 코드
public class CalculatorServlet extends GenericServlet {

	@Override
	// request 요청을 받겠다 , response 응답을 하겠다
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		String operator = request.getParameter("op");
		int v1 = Integer.parseInt(request.getParameter("v1"));
		int v2 = Integer.parseInt(request.getParameter("v2"));
		int result = 0;
		
		response.setContentType("text/html;Charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		switch(operator) {
		case "+": result = v1 + v2; break;
		case "-": result = v1 - v2; break;
		case "*": result = v1 * v2; break;
		case "/": 
			if( v2 == 0){
				out.println("0으로 나눌 수 없습니다.");
				return;
			}
			result = v1 / v2; 
			break;
		
		}// end of switch
		
		out.print(v1 + " " + operator + " " + v2 + " = " + result);
		
	}
	
}
