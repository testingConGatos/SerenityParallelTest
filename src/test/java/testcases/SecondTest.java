package testcases;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.targets.Target;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;

import steps.HomePageSteps;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

@RunWith(SerenityRunner.class)
public class SecondTest{

	@Managed(driver ="chrome")
	WebDriver driver;
	@Test

	public void chromeloginTest() {
		OnStage.setTheStage(new OnlineCast());
		theActorCalled("jeisson");

		HomePageSteps home = new HomePageSteps();

		theActorInTheSpotlight().attemptsTo(Open.url("https://gmail.com"));
		Target boton = Target.the("test").locatedBy("//*[@name='identifier']");
		theActorInTheSpotlight().attemptsTo(Click.on(boton));


	}

	@Test
	public void firefoxloginTest4() {
		OnStage.setTheStage(new OnlineCast());
		theActorCalled("jeisson");

		HomePageSteps home = new HomePageSteps();

		theActorInTheSpotlight().attemptsTo(Open.url("https://gmail.com"));
		Target boton = Target.the("test").locatedBy("//*[@name='identifier']");
		theActorInTheSpotlight().attemptsTo(Click.on(boton));


	}
	
	
}
