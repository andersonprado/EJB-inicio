package br.com.beans;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class MeuPrimeiroBean
 */
@Stateless
public class MeuPrimeiroBean implements MeuPrimeiroBeanLocal {

	public MeuPrimeiroBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void HelloWorld() {
		System.out.println("&quot;Hello World&quot;");

	}

}
