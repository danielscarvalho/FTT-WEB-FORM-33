package ftt.ec.api;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;

import ftt.ec.model.User;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

//TODO: Persistir dados no Banco de Dados MySQL
//TODO: Resolver issue UTF-8
//TODO: Criar novos forms...

/**
 * Servlet implementation class UserApi
 */
@WebServlet("/user")
public class UserApi extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap<Integer, User> userData;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserApi() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
		userData = new HashMap<Integer, User>();
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json"); //Mime type
		
		/*
		 *    String json = new Gson().toJson(someObject);
              https://github.com/google/gson
		 */
		Gson gson = new Gson();
		
		int userId = Integer.valueOf(request.getParameter("userId"));
		
		response.getWriter()
		       // .append("OBJ User: ").append(userData.get(Integer.valueOf(request.getParameter("userId"))).toString())
		          .append(gson.toJson(userData.get(userId)));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, 
			              HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json"); //Mime type

		User u = new User();
		
		u.setUserId(request.getParameter("userId"));
		u.setUserName(request.getParameter("userName"));
		u.setUserCar(request.getParameter("userCar"));
		//u.setUserDob(request.getParameter("userDob"));
		u.setUserColor(request.getParameter("userColor"));
		u.setUserEmail(request.getParameter("userEmail"));
		
		userData.put(u.getUserId(), u);
		
		System.out.println(u);
		
		response.getWriter()
        	.append("{\"status\":\"ok\",\"timestemp\":\"" + new Date() + "\"}");

}
//TODO: Refactor it is scarry!! :-o
	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
