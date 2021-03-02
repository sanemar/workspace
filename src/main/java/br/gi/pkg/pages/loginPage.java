package br.gi.pkg.pages;

import org.openqa.selenium.By;

import br.gi.pkg.core.BasePage;
import br.gi.pkg.core.DriverFactory;


public class loginPage extends BasePage {
	
	public void acessarListaProcesso(){
		DriverFactory.getDriver().get("http://sr2104a.happ.prodam/login");
		
	}
	
	public void setEmail(String email) {
		escrever("txtEmail", email);
	}
	
	public void setSenha(String senha) {
		escrever("txtSenha", senha);
	}
	
	public void acessar(){
		clicarBotao(By.xpath("//button[.='Acessar']"));
	}
	
	public void logar(String email, String senha) {
		setEmail(email);
		setSenha(senha);
		acessar();
	}
		
}

