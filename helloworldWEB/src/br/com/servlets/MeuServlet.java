package br.com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ejb.EJB;

import br.com.beans.MeuPrimeiroBeanLocal;

public class MeuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MeuPrimeiroBeanLocal meuBean;

	public MeuServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		meuBean.HelloWorld();
	}
}
