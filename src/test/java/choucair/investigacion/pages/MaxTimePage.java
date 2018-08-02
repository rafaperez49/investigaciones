package choucair.investigacion.pages;

import java.util.List;

import model.UsuarioMaxTime;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.choucairtesting.com:18000/MaxtimeCHC/")
public class MaxTimePage extends PageObject{
	
	@FindBy(id="Logon_v0_MainLayoutEdit_xaf_l30_xaf_dviUserName_Edit_I")
	public WebElementFacade txtUser;
	
	@FindBy(id="Logon_v0_MainLayoutEdit_xaf_l35_xaf_dviPassword_Edit_I")
	public WebElementFacade txtPassword;

	public void autenticarse(List<UsuarioMaxTime> lista) {
		
		txtUser.sendKeys(lista.get(0).getUsuario());
		txtPassword.sendKeys(lista.get(0).getClave());
	}
	
	

}
