
import java.io.IOException;

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
	}

}