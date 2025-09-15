package testcases;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.targets.Target;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.HomePageSteps;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

@RunWith(SerenityRunner.class)
public class FirstTest {
	
	@Managed(driver ="firefox")
	WebDriver driver;

	@Test
	public void firefoxloginTest() {
		OnStage.setTheStage(new OnlineCast());
		theActorCalled("jeisson");

		HomePageSteps home = new HomePageSteps();

		theActorInTheSpotlight().attemptsTo(Open.url("https://gmail.com"));
		Target boton = Target.the("test").locatedBy("//*[@name='identifier']");
		theActorInTheSpotlight().attemptsTo(Click.on(boton));

		
	}

}
