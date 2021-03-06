package br.gi.pkg.pages;

import static br.gi.pkg.core.DriverFactory.getDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.gi.pkg.core.BasePage;


public class listaProcessoPage extends BasePage {
	
	//Filtros	
	
	public void selecionaDataDe(String data){
		
		//clica para abrir o datapicker
		clicarBotao(By.className("mat-datepicker-toggle"));		
	}
	
	public void setDataAte(String data){
		escrever("mat-input-11", data);		
	}
	
	public void setNumeroProtocolo(String numeroProtocolo){
		escrever("mat-input-12", numeroProtocolo);
	}		
	
	public void selecionarTipoProcesso(String tipoProcesso){
		selecionarCombo("mat-select-6", tipoProcesso);
	}	

	public void selecionarStatus(String status){
		selecionarCombo("mat-select-7", status);
	}
	
	public void setSubprefeitura(String subprefeitura){
		escrever("mat-select-9", subprefeitura);
	}	

	public void setTPU(String tpu){
		escrever("mat-input-13", tpu);
	}
	
	public void setTPOV(String tpov){
		escrever("mat-input-14", tpov);
	}
	
	public void setAlvara(String alvara){
		escrever("mat-input-15", alvara);
	}
	
	public void setVia(String via){
		escrever("mat-input-16", via);
	}
	
	public void setNumeroCS(String numeroCS){
		escrever("mat-input-17", numeroCS);
	}
	
	public void Filtrar(){
		clicarBotao(By.xpath("//button[.='Filtrar']"));
	}
	
	public void Limpar(){
		clicarBotao(By.xpath("//button[.='Limpar']"));
	}	
		
}
