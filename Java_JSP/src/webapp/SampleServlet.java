import java.io.IOExseption;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletResponse;


@WebServlet("/SampleServlet")
public class SampleServlet extends HttpServlet{
	private static final long seriaVersionUID 	= 1L;
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response)
	throws ServletException,IOException{
		String[] animalArray= {"うさぎ","パンダ","ライオン"};
		int index =(int)(Math.random()*3);
		String animal=animalArray[index];
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM月日dd");
		String today_date = sdf.format(date);
		
		// HTMLを出力
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>動物選び</title>");
		out.println("</head>");
		out.println("<p>"+today+"のアニマルは"+luck+"です！"</p>);
		out.println("</body>");
		out.println("</html>");
	
	
	}
	
		
}