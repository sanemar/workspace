package br.gi.pkg.suites;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.gi.pkg.core.DriverFactory;
//import br.gi.pkg.test.TesteCadastro;
//import br.gi.pkg.test.TesteRegrasCadastro;

@RunWith(Suite.class)
@SuiteClasses({
	//TesteCadastro.class,
	//TesteRegrasCadastro.class
})
public class SuiteTeste {
	
	@AfterClass
	public static void finalizaTudo(){
		DriverFactory.killDriver();
	}

}

