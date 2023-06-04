package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Site;
import model.SiteLogic;

@WebServlet("/Index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext application = this.getServletContext();
		Site site = (Site) application.getAttribute("site");

		if (site == null) {
			site = new Site();
		}

		request.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");

		SiteLogic siteLogic = new SiteLogic();
		if (action != null && action.equals("like")) {
			siteLogic.like(site);
		} else if (action != null && action.equals("dislike")) {
			siteLogic.dislike(site);
		}

		application.setAttribute("site", site);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/Index.jsp");

		dispatcher.forward(request, response);

	}

}
