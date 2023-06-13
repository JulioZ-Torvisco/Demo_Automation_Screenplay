package co.com.testing.software.Page;

import groovyjarjarantlr4.v4.parse.ANTLRParser;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.core.time.SystemClock;
import net.serenitybdd.screenplay.waits.Wait;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

public class BuscarVideoPage extends PageObject {

    @FindBy(xpath = "//*[@id='logomenu']/li[4]/a/span")
    public WebElementFacade botonPS;

    @FindBy(xpath = "//img[@alt='Wild Hearts - Review']")
    public WebElementFacade botonWH;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[4]/img")
    public WebElementFacade elemento;


    public void Scroll(){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0, 5300)");
    }

    public void seSeleccionaLaOpcion() {
        botonPS.click();
    }

    public void seSeleccionaLaNoticiaDelVideojuegoWildHearthsReview() {
        botonWH.click();
    }

    public void seMuestraTodoElContenidoDelVideojuegoWildHearths() {
        Assert.assertTrue("No se muestra la review del juego",elemento.isDisplayed());
    }

    public void seDaScroll() {
        Scroll();
    }
}
