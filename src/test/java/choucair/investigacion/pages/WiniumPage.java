package choucair.investigacion.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://the-internet.herokuapp.com")
public class WiniumPage extends PageObject{
	
	//Identificamos el objeto que nos lleva a un Http Authentication.
	@FindBy(css="a[href='/basic_auth']")
	public WebElementFacade linkAutenticacion;

	public void ingresarAAutenticacion(String usuario, String clave) {
		
		//Tomamos la Url y la metemos en una variable de tipo String
		String urlAutentica=linkAutenticacion.getAttribute("href");
		
		//Introducimos en la Url, nuestro usuario y clave con el siguiente formato http://usuario:clave@elRestoDeLaUrl
		String urlAutenticacion=urlAutentica.substring(0, 7)+usuario+":"+clave+"@"+urlAutentica.substring(7);
		
		//Con esta instrucción accedemos a la nueva url
		getDriver().get(urlAutenticacion);
		
		
		
	}

}
