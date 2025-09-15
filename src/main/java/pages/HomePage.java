package pages;



import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class HomePage extends PageObject {

	
	
	public void navigate() {

	}
	
	public void enterUsername() {
		
		$("//*[@id=\"identifierId\"]").sendKeys("trainer@way2automation.com");
		
	}
	
	
	public void clickNextBtn() {
		
		

		$("//*[@id=\"identifierNext\"]/span/span").click();
		Serenity.takeScreenshot();
	}
	
	
	public void enterPassword() {
		
		$("//*[@id=\"password\"]/div[1]/div/div[1]/input").sendKeys("23sdfsfds");
		
		
	}
	
}
