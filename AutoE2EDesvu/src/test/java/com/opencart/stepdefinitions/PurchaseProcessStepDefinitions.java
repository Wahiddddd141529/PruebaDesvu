package com.opencart.stepdefinitions;

import com.opencart.steps.PurchaseProcessSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class PurchaseProcessStepDefinitions {

    @Steps
    PurchaseProcessSteps objPurchaseProcessSteps;

    @Given("Un usuario ingresa a la web opencart")
    public void unUsuarioIngresaALaWebOpencart() {
        objPurchaseProcessSteps.irURL();
    }

    @When("al momento agrega dos articulos al carrito")
    public void alMomentoAgregaDosArticulosAlCarrito() {
        objPurchaseProcessSteps.agregarArticulos();
        objPurchaseProcessSteps.irAlCarrito();
        objPurchaseProcessSteps.compraComoInvitado();
    }

    @Then("diligencia sus datos y finaliza la orden")
    public void diligenciaSusDatosYFinalizaLaOrden() {
        objPurchaseProcessSteps.diligenciarFormulario();
        objPurchaseProcessSteps.confirmarOrden();
    }
}

