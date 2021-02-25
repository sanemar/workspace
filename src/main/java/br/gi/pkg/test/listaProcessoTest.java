package br.gi.pkg.test;

import br.gi.pkg.core.BasePage;
import br.gi.pkg.pages.listaProcessoPage;
import utilities.constants;
import utilities.ExcelUtils;
//import java.io.IOException;

import org.junit.Test;
//import org.openqa.selenium.By;

public class listaProcessoTest extends BasePage {
	
	listaProcessoPage listaProcesso = new listaProcessoPage();
	
	//creating object of ExcelUtils class
    static ExcelUtils excelUtils = new ExcelUtils();
    
    //using the Constants class values for excel file path 
    static String excelFilePath = constants.Path_TestData+constants.File_TestData;
 
    @Test
    public void testar(){
    	excelUtils.getCellData(10, 2);
    
    }
    //public static  void main(String args[]) throws IOException {
	
	//@Test
	//public void informarDataDe(){
		//listaProcesso.setDataDe("22/02/2021");
		//Assert.
		
	//}

}
