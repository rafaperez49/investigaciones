package choucair.investigacion.steps;

import choucair.investigacion.pages.TablaPage;
import net.thucydides.core.annotations.Step;

public class TablaStep {

	TablaPage tablaPage;
	@Step
	public void seleccionaElLinkDom() {
		
		tablaPage.abrirLinkDomain();
	}
	
	@Step
	public void obtieneInfoDeTabla() {
		tablaPage.recorrerLaTabla();
		tablaPage.obtenerCanva();
	}
	
	

}
