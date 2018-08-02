package choucair.investigacion.definitions;

import java.util.List;

import choucair.investigacion.steps.MaxTimeStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.UsuarioMaxTime;
import net.thucydides.core.annotations.Steps;

public class MaxTimeDefinition {
	
	@Steps
	private MaxTimeStep maxTimeStep;
	
	@Given("^Ingreso a la pagina MaxTime$")
	public void ingreso_a_la_pagina_MaxTime() throws Exception {
		maxTimeStep.ingresarALaPagina();
		
	}

	@When("^Me autentico$")
	public void me_autentico(List<UsuarioMaxTime> listaUsuario) throws Exception {
		maxTimeStep.meAutentico(listaUsuario);
	}

	@Then("^Verifico que ingrese$")
	public void verifico_que_ingrese() throws Exception {
	}

}
