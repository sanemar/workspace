package br.gi.pkg.suites;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.gi.pkg.core.DriverFactory;
import br.gi.pkg.test.loginTest;
import br.gi.pkg.test.listaProcessoTest;

@RunWith(Suite.class)
@SuiteClasses({
	//loginTest.class,
	//listaProcessoTest.class
})
public class SuiteTeste {
	
	@AfterClass
	public static void finalizaTudo(){
		DriverFactory.killDriver();
	}

}

