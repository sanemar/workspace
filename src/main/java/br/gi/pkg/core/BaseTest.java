package br.gi.pkg.core;

import static br.gi.pkg.core.DriverFactory.getDriver;
import static br.gi.pkg.core.DriverFactory.killDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
//import org.junit.Before;
import org.junit.After;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

//import br.gi.pkg.utilities.constants;


public class BaseTest{
	
	
	@Rule
	public TestName testName = new TestName();
	
	//@Before
	//public void inicializa(){

	//}
	
	@After
	public void finaliza() throws IOException{
		TakesScreenshot ss = (TakesScreenshot) getDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo, new File("target" + File.separator + "screenshot" +
				File.separator + testName.getMethodName() + ".jpg"));
		
		if(Propriedades.FECHAR_BROWSER) {
			killDriver();
		}
	}

}


