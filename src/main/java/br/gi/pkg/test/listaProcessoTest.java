package br.gi.pkg.test;

//import br.gi.pkg.core.BaseTest;
import br.gi.pkg.pages.listaProcessoPage;
import br.gi.pkg.test.loginTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static br.gi.pkg.core.DriverFactory.getDriver;

import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

//import utilities.constants;
//import utilities.ExcelUtils;
//import java.io.IOException;


public class listaProcessoTest extends BaseTest{
	
	listaProcessoPage listaProcesso = new listaProcessoPage();
	
	//private String today;
	private String dia;
	
	@Test
	public void selecionarDataDe(){
		
		//Pega a data atual como um número selecionado
        //today = getCurrentDay();
        //System.out.println("Today's number: " + today + "\n");
        
        //listaProcesso.selecionaDataDe();
        
        
        WebElement dateWidget = getDriver().findElement(By.className("mat-datepicker-toggle mat-datepicker-toggle-active"));
        List<WebElement> columns=dateWidget.findElements(By.tagName("td"));

        for (WebElement cell: columns){
           //Select 13th Date 
           if (cell.getText().equals("dia")){
              cell.findElement(By.linkText("dia")).click();
        }
        
/*        //localiza o formulário do calendário
      		WebElement dateWidget = getDriver().findElement(By.className("mat-datepicker-toggle mat-datepicker-toggle-active"));
      		//(By.xpath(".//*[@id='cdk-overlay-13']/div[2]/table/tbody"));
      				
      		//armazena as linhas da tabela do controle
      		//List<WebElement> rows = dateWidgetFrom.findElements(By.tagName("tr"));
      		 
      		//armazena as colunas da tabela do controle
      		List<WebElement> columns = dateWidget.findElements(By.tagName("td"));
        
      //DatePicker é uma tabela. Percorrer as células da tabela e se uma célula corresponder à data atual, seleciona ela.
        for (WebElement cell: columns) {
            
            //If you want to click 18th Date
            if (cell.getText().equals("18")) {
            
            //Select Today's Date
            if (cell.getText().equals(today)) {
                cell.click();
                break;
            }
        }*/
        
       //Pega a data atual
/*           private String getCurrentDay(){
            	
              //Cria um objeto do tipo Calender
              Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
         
              //Pega a data atual selecionada como um número
              int todayInt = calendar.get(Calendar.DAY_OF_MONTH);
              System.out.println("Today Int: " + todayInt +"\n");
         
              //Converte inteiro para String
              String todayStr = Integer.toString(todayInt);
              System.out.println("Today Str: " + todayStr + "\n");
         
                return todayStr;
            }*/
   //}         

	@Test
	public void filtrarNumeroProtocolo(){		
		listaProcesso.setNumeroProtocolo("03210653");		
		listaProcesso.Filtrar();		
	}
	
	@Test
	public void filtrarTipoProcesso(){		
		listaProcesso.selecionarTipoProcesso("Manutenção Preventiva");
		listaProcesso.Filtrar();		
	}
	
	@Test
	public void filtrarStatus(){		
		listaProcesso.selecionarStatus("Cancelado");
		listaProcesso.Filtrar();		
	}

}
	
	
		


	
	
	
	
	//creating object of ExcelUtils class
    //static ExcelUtils excelUtils = new ExcelUtils();
    
    //using the Constants class values for excel file path 
    //static String excelFilePath = constants.Path_TestData+constants.File_TestData;
 
    //@Test
    //public void testar(){
    	//excelUtils.getCellData(10, 2);
    
    //}
    //public static  void main(String args[]) throws IOException {
	
	//@Test
	//public void informarDataDe(){
		//listaProcesso.setDataDe("22/02/2021");
		//Assert.
		
	//}

//}
