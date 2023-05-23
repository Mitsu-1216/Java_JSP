
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// もととなるクラスを継承
public class HelloServlet extends HttpServlet {
	// doGet(メインのメソッド)をオーバーライド
	protected void doGet(HttpServletRequest request
			,HttpServletResponse response)
		throws ServletException,IOException{
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		out.printlen("<html>");
		out.printlen("・・・");
		out.printlen("</html>");
	}

}