package br.gi.pkg.utilities;

import java.io.File; 
import java.io.FileInputStream; 
import java.io.IOException; 
import org.apache.poi.hssf.usermodel.HSSFWorkbook; 
import org.apache.poi.ss.usermodel.Row; 
import org.apache.poi.ss.usermodel.Sheet; 
import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class excelUtils {
	
	//private static HSSFWorkbook Workbook;
    //private static HSSFSheet Sheet;
    //private static HSSFRow Row;
    //private static HSSFCell Cell;
    
        
    public void setExcelFile(String excelFilePath,String excelFileName, String sheetName) throws IOException {
    	
    	// Cria um objeto da classe File para abrir o arquivo xlsx    	
        File file = new File("Path_TestData" + "\\" + "PLNTEST_Consultar Processo.xlsx");
        
        // Cria um objeto da classe FileInputStream para ler o arquivo excel
        FileInputStream inputStream = new FileInputStream(file);        

    
        Workbook meuWorkbook = null;

        //Encontre a extensão do arquivo dividindo o nome do arquivo na substring e obtendo apenas o nome da extensão
        String fileExtensionName = excelFileName.substring(excelFileName.indexOf("."));

        //Verifique a condição se o arquivo for um arquivo xlsx
        	if(fileExtensionName.equals(".xlsx")){

        	//Se for um arquivo xlsx, crie o objeto da classe
        		XSSFWorkbook workbook = new XSSFWorkbook (inputStream);

        }

        //Verifique a condição se o arquivo for um arquivo xls
        	else if(fileExtensionName.equals(".xls")){

        	//Se for um arquivo xls, crie o objeto da classe HSSFWorkbook
        		workbook = new HSSFWorkbook(inputStream);

        		}

        	//Lê a planilha dentro da pasta de trabalho pelo nome
        	Sheet sheet = workbook.getSheet("Consulta");

        	//Encontre o número de linhas no arquivo excel
        	int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();

        	//Cria um loop em todas as linhas do arquivo Excel para lê-lo
        	for (int i = 0; i < rowCount+1; i++) {

        		Row row = sheet.getRow(i);

        		//Cria um loop para imprimir os valores das células em uma linha
        		for (int j = 0; j < row.getLastCellNum(); j++) {

        			//Imprime dados do Excel no console
        			System.out.print(row.getCell(j).getStringCellValue()+"|| ");

        		}

        		System.out.println();
        	} 

    	}  

    	//A função principal está chamando a função setExcelFile para ler dados do arquivo excel
    	public static void main(String...strings) throws IOException{

    		//Cria um objeto da classe excelUtils
    		excelUtils objExcelFile = new excelUtils();

    		//Prepare o caminho do arquivo excel
    		String filePath = System.getProperty("user.dir")+"\\src\\br.gi.pkg.testData";

    		//Chama o método de leitura de arquivo da classe para ler os dados
    		objExcelFile.setExcelFile(filePath,"PLNTEST_Consultar Processo.xlsx","Consulta");

    	}     

}


