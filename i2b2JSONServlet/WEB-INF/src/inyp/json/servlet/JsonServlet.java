package inyp.json.servlet;
import java.io.IOException;


import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.columbia.cumc.main.QMQueryNameUserID;

@WebServlet("/JsonServlet")
public class JsonServlet extends HttpServlet {
	

	

	/**
	 * @author elv7007 elena villalon (email=elv7007@nyp.org) 
	 * Servlet implementation class TokenServlet

	 *   * */
	
	
		private static final long serialVersionUID = 1L;
	       
	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public JsonServlet() {
	        super();
	      
	        // TODO Auto-generated constructor stub
	    }

		/**
		 * @see Servlet#init(ServletConfig)
		 */
		public void init(ServletConfig config) throws ServletException {
			// TODO Auto-generated method stub
			
		}

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			 processRequest(request, response);
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			 processRequest(request, response);
		}
		
		protected void processRequest(HttpServletRequest request, HttpServletResponse response) 
				throws ServletException, IOException {
			
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/html");
			response.setHeader("Cache-Control", "no-cache");
			request.setCharacterEncoding("UTF-8");
			
			 
			String str="Bad QueryName";
			
			 String input=null;
				 
			 try {
				  input=new String(request.getParameter("QMid")); 
			
			 }catch(NullPointerException nil){
				 nil.printStackTrace();
				 
				
				 //str;
						
			 }
			  	 try{
			  	
					 str =   	 new QMQueryNameUserID().getJson(input);		
				 }catch(Exception e){
					 e.printStackTrace();
				 }
			 
			 
			 response.getWriter().println(str  );
			}
	}

