package br.gi.pkg.pages;

import br.gi.pkg.core.BasePage;

public class menuPage extends BasePage {
	
	public void acessarNovoProcesso(){
		
		clicarBotao("Clique para expandir o menu");
		clicarLink("Processos");
		clicarLink("Novo");
		
		//mat-input-2 --id Per�odo De
		//mat-input-3 --id Per�odo At�
				
	} 

}
