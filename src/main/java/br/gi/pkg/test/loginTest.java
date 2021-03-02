package br.gi.pkg.test;

import br.gi.pkg.core.BaseTest;
import br.gi.pkg.pages.loginPage;
import org.junit.Test;

public class loginTest extends BaseTest {
	
	loginPage page = new loginPage();
	
	@Test
	public void test(){		

		page.acessarListaProcesso();
		page.setEmail("gialmarques@comgas.com.br");
		page.setSenha("user");
		page.acessar();
		
	}
}




