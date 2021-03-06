package br.gi.pkg.util;

import java.io.File; 
import java.io.FileInputStream; 
import java.io.IOException; 
import org.apache.poi.hssf.usermodel.HSSFWorkbook; 
import org.apache.poi.ss.usermodel.Row; 
import org.apache.poi.ss.usermodel.Sheet; 
import org.apache.poi.ss.usermodel.Workbook;

//import br.gi.pkg.util.constants;



public class exemploClasse {
        
    public void setExcelFile(String excelFilePath, String excelFileName, String sheetName) throws IOException {
    	
    	// Cria um objeto da classe File para abrir o arquivo xlsx    	
        File file = new File("excelFilePath" + "\\" + "testeBasico.xls");
        
        // Cria um objeto da classe FileInputStream para ler o arquivo excel
        	FileInputStream inputStream = new FileInputStream(file);        

    
       Workbook workbook = null;

        //Encontre a extens�o do arquivo dividindo o nome do arquivo na substring e obtendo apenas o nome da extens�o
        String fileExtensionName = excelFileName.substring(excelFileName.indexOf("."));

        //Verifique a condi��o se o arquivo for um arquivo xlsx
        	//if(fileExtensionName.equals(".xlsx")){

        	//Se for um arquivo xlsx, crie o objeto da classe
        		//XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        //}

        //Verifique a condi��o se o arquivo for um arquivo xls
        	if(fileExtensionName.equals(".xls")){

        	//Se for um arquivo xls, crie o objeto da classe HSSFWorkbook
        		workbook = new HSSFWorkbook(inputStream);

        	}

        	//L� a planilha dentro da pasta de trabalho pelo nome
        	Sheet sheet = workbook.getSheet("aba");

        	//Encontre o n�mero de linhas no arquivo excel
        	int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();

        	//Cria um loop em todas as linhas do arquivo Excel para l�-lo
        	for (int i = 0; i < rowCount+1; i++) {

        		Row row = sheet.getRow(i);

        		//Cria um loop para imprimir os valores das c�lulas em uma linha
        		for (int j = 0; j < row.getLastCellNum(); j++) {

        		//Imprime dados do Excel no console
        			System.out.print(row.getCell(j).getStringCellValue()+"|| ");

        		}

        		System.out.println();
        	} 

    	}  

    	//A fun��o principal est� chamando a fun��o setExcelFile para ler dados do arquivo excel
    	public static void main(String...strings) throws IOException{

    		//Cria um objeto da classe excelUtils
    		exemploClasse objExcelFile = new exemploClasse();

    		//Prepare o caminho do arquivo excel
    		String excelFilePath = System.getProperty("user.dir")+ "\\git\\workspace\\src\\main\\java\\br\\gi\\pkg\\util";    		
    	   		    																
    		//Chama o m�todo de leitura de arquivo da classe para ler os dados
    		objExcelFile.setExcelFile(excelFilePath, "testeBasico.xls", "aba");

    	}   

}



