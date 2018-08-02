package choucair.investigacion.definitions;

import java.awt.AWTException;

import choucair.investigacion.steps.WiniumStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class WiniumDefinition {
	
	@Steps
	WiniumStep elWiniumStep;
	
	@Given("^Ingreso a la pagina web$")
	public void ingreso_a_la_pagina_web()  {
	    
		elWiniumStep.ingresarALaPagina();
	}


	@When("^hago click en la opcion autenticar y me autentico con usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
	public void hago_click_en_la_opcion_autenticar_y_me_autentico_con_usuario_y_clave(String usuario, String clave){
	   
		elWiniumStep.meAutentico(usuario, clave);
	}

}
