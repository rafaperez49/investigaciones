package choucair.investigacion.steps;

import java.awt.AWTException;

import choucair.investigacion.pages.WiniumPage;
import net.thucydides.core.annotations.Step;

public class WiniumStep {

	WiniumPage elWiniumPage;

	@Step
	public void ingresarALaPagina() {
		elWiniumPage.open();
		
		
	}
	
	@Step
	public void meAutentico(String usuario, String clave)
	{
		elWiniumPage.ingresarAAutenticacion(usuario, clave);	
	}
	

	
	

}
