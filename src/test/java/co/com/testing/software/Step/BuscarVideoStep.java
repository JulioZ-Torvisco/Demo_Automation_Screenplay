package co.com.testing.software.Step;

import co.com.testing.software.Page.BuscarVideoPage;
import net.thucydides.core.annotations.Step;

public class BuscarVideoStep {

    private BuscarVideoPage buscarVideoPage;

    @Step
    public void seSeleccionaLaOpcion() {
        buscarVideoPage.seSeleccionaLaOpcion();
    }

    @Step
    public void seSeleccionaLaNoticiaDelVideojuegoWildHearthsReview() {
        buscarVideoPage.seSeleccionaLaNoticiaDelVideojuegoWildHearthsReview();
    }

    @Step
    public void seMuestraTodoElContenidoDelVideojuegoWildHearths() {
        buscarVideoPage.seMuestraTodoElContenidoDelVideojuegoWildHearths();
    }

    @Step
    public void seDaScroll() {
        buscarVideoPage.seDaScroll();
    }
}
