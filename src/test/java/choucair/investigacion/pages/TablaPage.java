package choucair.investigacion.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TablaPage extends PageObject{

	@FindBy(css="a[href='/challenging_dom']")
	public WebElementFacade linkDomain;
	
	@FindBy(xpath="//a[@class='button']")
	public WebElementFacade boton;
	
	@FindBy(id="canvas")
	public WebElementFacade canvaElement;
	
	public void abrirLinkDomain() {
	linkDomain.click();	
	
	}

	public void recorrerLaTabla() {
		
		int numeroDeFilas = getDriver().findElements(By.xpath("//tbody/tr")).size();
		int numeroDeColumnas = getDriver().findElements(By.xpath("//tbody/tr[1]/td")).size();
		
		for(int i=1;i<=numeroDeFilas;i++)
		{
			for(int j=1;j<=numeroDeColumnas;j++)
			{
				String informacion = getDriver().findElement(By.xpath("//tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(informacion);
				
			}
			
		}
	}
	
	public void obtenerCanva()
	{
		
		List<WebElement> elJS= getDriver().findElements(By.xpath("//script[text()]"));	
		String elTextoEnCanvas = elJS.get(1).getAttribute("innerHTML");
		elTextoEnCanvas=elTextoEnCanvas.substring(140, 153).replace("'", "");
		System.out.println(elTextoEnCanvas);
			
				
	}
	
}
