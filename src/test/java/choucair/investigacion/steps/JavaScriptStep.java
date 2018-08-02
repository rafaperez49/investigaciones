package choucair.investigacion.steps;

import static org.junit.Assert.assertThat;

import org.apache.tools.ant.filters.TokenFilter.ContainsString;

import choucair.investigacion.pages.JavaScriptPage;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.Matchers.containsString;

public class JavaScriptStep {
	
	JavaScriptPage javaScriptPage;

	@Step
	public void ingresarALaPagina() {
		
		javaScriptPage.open();
		
	}

	@Step
	public void seleccionaElLink() {
		
		javaScriptPage.irAlLinkDeJavasCript();
		
	}

	@Step
	public void seleccionaLaOpcionYLaConfirma() {
		
		javaScriptPage.irAlBotonYAceptarAlerta();
		assertThat("You successfuly clicked an alert", containsString(javaScriptPage.labelConfirmacion.getText().trim()));
		
	}

	@Step
	public void seleccionaLaOpcionYLaCancela() {
		javaScriptPage.irAlBotonYConfirmarAlerta();
		assertThat("You clicked: Cancel", containsString(javaScriptPage.labelConfirmacion.getText().trim()));
	}

	@Step
	public void seleccionaLaOpcionEInteractuaConElPromp(String texto) {
		javaScriptPage.DiligenciarInformacionEnPromp(texto);
		assertThat(javaScriptPage.labelConfirmacion.getText().trim(), containsString(texto));
	}
	
	
	
	

}
