package choucair.investigacion.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://the-internet.herokuapp.com")
public class JavaScriptPage extends PageObject{
	
	@FindBy(xpath = "//button[@onclick='jsAlert()']")
	public WebElementFacade botonDeAlerta;
	
	@FindBy(xpath = "//button[@onclick='jsConfirm()']")
	public WebElementFacade botonDeConfirmacion;
	
	@FindBy(xpath = "//button[@onclick='jsPrompt()']")
	public WebElementFacade botonDePrompt;
	
	@FindBy(css="a[href='/javascript_alerts']")
	public WebElementFacade linkJavaScript;
	
	@FindBy(id="result")
	public WebElementFacade labelConfirmacion;
	
	
	
	public void irAlLinkDeJavasCript() {
		linkJavaScript.click();		
	}
	
	

	public void irAlBotonYAceptarAlerta() {
		botonDeAlerta.click();
		getDriver().switchTo().alert().accept();
	}

	public void irAlBotonYConfirmarAlerta() {
		botonDeConfirmacion.click();
		getDriver().switchTo().alert().dismiss();
	}

	public void DiligenciarInformacionEnPromp(String texto) {
		botonDePrompt.click();
		getDriver().switchTo().alert().sendKeys(texto);
		getDriver().switchTo().alert().accept();
		
	}
	
	
	
	

}
