package steps;

//import net.thucydides.core.annotations.Step;
import pages.HomePage;

public class HomePageSteps {
	
	
	
	HomePage home;
	
	//@Step("Performing Login")
	public void doLogin() {

		home.enterUsername();
		
	}
	
	
	//@Step("Entering Password")
	public void doEnterPassword() {
		
		
		
		home.clickNextBtn();
		home.enterPassword();
	}
	

}
