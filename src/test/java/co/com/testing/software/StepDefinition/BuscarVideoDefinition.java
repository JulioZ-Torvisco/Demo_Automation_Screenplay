package co.com.testing.software.StepDefinition;

import co.com.testing.software.Step.BuscarVideoStep;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class BuscarVideoDefinition {
    @Steps
    private BuscarVideoStep buscarVideoStep;

    @Managed
    private WebDriver navegador;

    private Actor actor = Actor.named("Usuario");

    private static final String URL_IGN_LATAM = "https://latam.ign.com";

    public static Task deIGNLATAM() {
        return Task.where("{0} abre la página de IGN LATAM",
                Open.url(URL_IGN_LATAM)
        );
    }

    @Dado("que el usuario ingresa a la pagina principal del portal de IGN Latinoamerica")
    public void queElUsuarioIngresaALaPaginaPrincipalDelPortalDeIGNLatinoamerica(){
        actor.can(BrowseTheWeb.with(navegador));
        actor.attemptsTo(Open.url("https://latam.ign.com/"));
    }

    @Cuando("se selecciona la opcion PS")
    public void seSeleccionaLaOpcion() {
        buscarVideoStep.seSeleccionaLaOpcion();
    }

    @Y("se selecciona la noticia del videojuego Wild Hearths-Review")
    public void seSeleccionaLaNoticiaDelVideojuegoWildHearthsReview() {
        buscarVideoStep.seSeleccionaLaNoticiaDelVideojuegoWildHearthsReview();
    }

    @Entonces("se valida la pagina del review Wild Hearths")
    public void seMuestraTodoElContenidoDelVideojuegoWildHearths() {
        buscarVideoStep.seMuestraTodoElContenidoDelVideojuegoWildHearths();
    }

    @Y("se da scroll hasta la galeria de imagenes")
    public void seDaScroll() {
        buscarVideoStep.seDaScroll();
    }
}
