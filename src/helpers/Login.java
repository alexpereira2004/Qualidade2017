package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageobjects.Home;
import pageobjects.Principal;

public class Login {

	private Home PaginaHome;
	private pageobjects.Login PaginaLogin;
	private pageobjects.Principal PaginaPrincipal;
	private DriverSelenium DriverConfig;
	
	
	public boolean RealizarLoginUsuario(WebDriver driver) {

		if (!VerificarSeJaEstaLogado()) {
			PaginaHome = new Home(driver);

			Comandos.click(PaginaHome.getLinkEntrar());
			
			pageobjects.Login PaginaLogin = new pageobjects.Login(driver);	    
		    Comandos.clearAndSendKeys(PaginaLogin.getUsername(), "alexpereira2004");
		    Comandos.clearAndSendKeys(PaginaLogin.getPassword(), "colorado");
		    Comandos.click(PaginaLogin.getCheckManterLogado());			
		    Comandos.click(PaginaLogin.getBotaoEntrar());
		    
		    PaginaPrincipal = new Principal(driver);
//		    Comandos.click(PaginaPrincipal.getSelectProjetos());
		}
		
		return true;
	}


	private boolean VerificarSeJaEstaLogado() {
		
		return false;
	}
}
