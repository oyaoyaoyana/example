package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.RegisterUserLogic;
import model.User;


@WebServlet("/RegistUser")
public class RegistUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RegistUser() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forwardPath = null;

		String action = request.getParameter("action");

		if (action == null) {
			forwardPath = "/WEB-INF/jsp/registerForm.jsp";
		} else if (action.equals("done")) {
			System.out.println("hoge");
			HttpSession session = request.getSession();
			User user = (User) session.getAttribute("user");
			RegisterUserLogic logic = new RegisterUserLogic();
			logic.execute(user);

			session.removeAttribute("user");

			forwardPath = "/WEB-INF/jsp/registerDone.jsp";
		}

		RequestDispatcher dispatcher =
				request.getRequestDispatcher
				(forwardPath);
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");

		User user = new User(id, pass, name);

//		RegisterUserLogic registerUserLogic = new RegisterUserLogic();
//		registerUserLogic.execute(user);

		HttpSession session = request.getSession();

		session.setAttribute("user", user);

		RequestDispatcher dispatcher =
				request.getRequestDispatcher
				("/WEB-INF/jsp/registerConfirm.jsp");
		dispatcher.forward(request, response);
	}

}
