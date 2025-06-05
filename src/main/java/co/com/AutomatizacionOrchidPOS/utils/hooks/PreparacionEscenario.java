package co.com.AutomatizacionOrchidPOS.utils.hooks;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class PreparacionEscenario {
    @Before
    public  void sepUp(){
        setTheStage(new OnlineCast());
        theActorCalled("usuario").can(BrowseTheWeb.with(ThucydidesWebDriverSupport.getDriver()));
    }
}
