package com.opencart.steps;

import com.opencart.pageobject.PurchaseProcessPageObjects;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PurchaseProcessSteps extends PageObject {
    PurchaseProcessPageObjects objPurchaseProcessPageObjects = new PurchaseProcessPageObjects();
    List<WebElement> collection;

    public void irURL(){
        try {
            getDriver().get("https://opencart.abstracta.us/index.php?route=common/home");
            Thread.sleep(2000);
        }
        catch (Exception e){
            e.getCause();
        }
    }

    public void agregarArticulos(){
        try {
            getDriver().findElement(objPurchaseProcessPageObjects.getProduct1()).click();
            Thread.sleep(2000);
            getDriver().findElement(objPurchaseProcessPageObjects.getProduct2()).click();
            Serenity.takeScreenshot();
            Thread.sleep(3000);
        }
        catch (Exception e){
         e.getCause();
        }
    }

    public void irAlCarrito(){
        try {
            getDriver().findElement(objPurchaseProcessPageObjects.getCard()).click();
            Thread.sleep(1500);
            getDriver().findElement(objPurchaseProcessPageObjects.getCheckOut()).click();
            Serenity.takeScreenshot();
            Thread.sleep(3000);
        }
        catch (Exception e){
            e.getCause();
        }
    }

    public void compraComoInvitado(){
        try {
            getDriver().findElement(objPurchaseProcessPageObjects.getGuest()).click();
            Thread.sleep(1500);
            collection = getDriver().findElements(objPurchaseProcessPageObjects.getContinue());
            for(int i = 0; i<=10; i++){
                if(collection.get(i).isDisplayed()){
                    collection.get(i).click();
                    break;
                }
                Serenity.takeScreenshot();
                Thread.sleep(1500);
            }
        }
        catch (Exception e){
            e.getCause();
        }
    }

    public void diligenciarFormulario(){
        try {
            getDriver().findElement(objPurchaseProcessPageObjects.getFirstName()).sendKeys("Julián");
            getDriver().findElement(objPurchaseProcessPageObjects.getLastName()).sendKeys("Ayala");
            getDriver().findElement(objPurchaseProcessPageObjects.getEmail()).sendKeys("ja@gmail.com");
            getDriver().findElement(objPurchaseProcessPageObjects.getPhone()).sendKeys("3201012020");
            getDriver().findElement(objPurchaseProcessPageObjects.getAddress()).sendKeys("Calle 196 B 21 - 21");
            getDriver().findElement(objPurchaseProcessPageObjects.getCity()).sendKeys("Bogotá");
            getDriver().findElement(objPurchaseProcessPageObjects.getPostCode()).sendKeys("110141");
            Select country = new Select(getDriver().findElement(objPurchaseProcessPageObjects.getCountry()));
            Select region = new Select(getDriver().findElement(objPurchaseProcessPageObjects.getRegion()));
            country.selectByVisibleText("Colombia");
            region.selectByVisibleText("Bogota D.C.");
            collection = getDriver().findElements(objPurchaseProcessPageObjects.getContinue());
            for(int i = 0; i<=10; i++) {
                if (collection.get(i).isDisplayed()) {
                    collection.get(i).click();
                    break;
                }
            }
            Serenity.takeScreenshot();
            Thread.sleep(5000);
        }
        catch (Exception e){
            e.getCause();
        }
    }

    public void confirmarOrden(){
        try {
            collection = getDriver().findElements(objPurchaseProcessPageObjects.getContinue());
            for(int i = 0; i<=15; i++) {
                if (collection.get(i).isDisplayed()) {
                    collection.get(i).click();
                    break;
                }
            }
            Thread.sleep(2000);
            collection = getDriver().findElements(objPurchaseProcessPageObjects.getTerms_Conditions());
            for(int j = 0; j<=10; j++) {
                if (collection.get(j).isDisplayed()) {
                    collection.get(j).click();
                    break;
                }
            }
            Thread.sleep(2000);
            collection = getDriver().findElements(objPurchaseProcessPageObjects.getContinue());
            for(int k = 0; k<=10; k++) {
                if (collection.get(k).isDisplayed()) {
                    collection.get(k).click();
                    break;
                }
            }
            Thread.sleep(2000);
            Serenity.takeScreenshot();
            Thread.sleep(2500);
            Serenity.takeScreenshot();
            getDriver().findElement(objPurchaseProcessPageObjects.getConfirmOrder()).click();
            Serenity.takeScreenshot();
            Thread.sleep(1500);
        }
        catch (Exception e){
            e.getCause();
        }
    }

}
