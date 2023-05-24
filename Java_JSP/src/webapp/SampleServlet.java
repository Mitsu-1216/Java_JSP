import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

@WebServlet("/SampleServlet")
public class SampleServlet extends HttpServlet {
	private static final long seriaVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response)
	throws ServletException,IOException{
		String[] animalArray= {"うさぎ","パンダ","ライオン"};
		int index =(int)(Math.random()*3);
		String animal=animalArray[index];
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日");
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