package br.gi.pkg.test;

import br.gi.pkg.core.BasePage;
import br.gi.pkg.pages.loginPage;
import org.junit.Test;

public class loginTest extends BasePage {
	
	loginPage loginPage = new loginPage();
	
	@Test
	public void test(){		

		loginPage.acessarListaProcesso();
		loginPage.setEmail("gialmarques@comgas.com.br");
		loginPage.setSenha("user");
		loginPage.Acessar();
		
	}
}




