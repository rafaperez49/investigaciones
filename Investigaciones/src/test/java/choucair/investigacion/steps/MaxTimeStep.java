package choucair.investigacion.steps;

import java.util.List;

import choucair.investigacion.pages.MaxTimePage;
import model.UsuarioMaxTime;
import net.thucydides.core.annotations.Step;

public class MaxTimeStep {
	
	private MaxTimePage maxTimePage;

	@Step
	public void ingresarALaPagina() {
		maxTimePage.open();
	}

	@Step
	public void meAutentico(List<UsuarioMaxTime> listaUsuario) {
		maxTimePage.autenticarse(listaUsuario);		
	}
	
	
	

}
