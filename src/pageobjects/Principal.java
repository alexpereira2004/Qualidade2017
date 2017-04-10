package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Principal {
	
	private WebElement selectProjetos;

	public Principal(WebDriver driver) {
	    new Select(driver.findElement(By.id("project_quick_jump_box"))).selectByVisibleText("Qualidade de Software 2017");
//		this.setSelectProjetos(driver.findElement(By.linkText("7")));
		
	}

	public WebElement getSelectProjetos() {
		return selectProjetos;
	}

	public void setSelectProjetos(WebElement selectProjetos) {
		this.selectProjetos = selectProjetos;
	}
	
	
	

}
