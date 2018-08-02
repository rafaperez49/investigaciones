package choucair.investigacion.definitions;

import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import choucair.investigacion.steps.JavaScriptStep;
import choucair.investigacion.steps.TablaStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class JavaScriptDefinition {
	
	@Steps
	JavaScriptStep javaScriptStep;
	@Steps
	TablaStep tablaStep;
	
	
	
	@Given("^que el usuario ingresa a la pagina de herokuapp$")
	public void que_el_usuario_ingresa_a_la_pagina_de_herokuapp(){
	
		javaScriptStep.ingresarALaPagina();
	}


	@When("^cuando selecciona el link javascript_alerts$")
	public void cuando_selecciona_el_link_javascript_alerts() {
		javaScriptStep.seleccionaElLink();
	}

	@When("^interactua con el control aceptar que hay en esta pantalla$")
	public void interactua_con_el_control_aceptar_que_hay_en_esta_pantalla() {
		javaScriptStep.seleccionaLaOpcionYLaConfirma();
	}

	@When("^interactua con el control confirmar que hay en esta pantalla$")
	public void interactua_con_el_control_confirmar_que_hay_en_esta_pantalla() {
		javaScriptStep.seleccionaLaOpcionYLaCancela();
	}

	@When("^interactua el prompt que hay en esta pantalla con el texto \"([^\"]*)\"$")
	public void interactua_el_prompt_que_hay_en_esta_pantalla_con_el_texto(String texto) {
		javaScriptStep.seleccionaLaOpcionEInteractuaConElPromp(texto);
	}
	
	@When("^cuando selecciona el link challenging_dom$")
	public void cuando_selecciona_el_link_challenging_dom() {
		tablaStep.seleccionaElLinkDom();
	}

	@When("^obtiene la data de la tabla y el canvas$")
	public void obtiene_la_data_de_la_tabla_y_el_canvas()  {
		tablaStep.obtieneInfoDeTabla();
	}

}
