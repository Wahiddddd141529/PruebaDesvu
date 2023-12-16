package com.opencart.pageobject;

import org.openqa.selenium.By;

public class PurchaseProcessPageObjects {

    By product1 = By.xpath("//button[@onclick=\"cart.add('43');\"]");
    By Product2 = By.xpath("//button[@onclick=\"cart.add('40');\"]");
    By card = By.xpath("//button[@data-toggle='dropdown' ]/span[@id='cart-total']");
    By checkOut = By.xpath("//a/i[@class='fa fa-share']");
    By guest = By.xpath("//input[@value='guest']");
    By Continue = By.xpath("//input[@value='Continue']");
    By firstName = By.xpath("//input[@placeholder='First Name']");
    By lastName = By.xpath("//input[@placeholder='Last Name']");
    By email = By.xpath("//input[@placeholder='E-Mail' and @id='input-payment-email']");
    By phone = By.xpath("//input[@placeholder='Telephone']");
    By address = By.xpath("//input[@placeholder='Address 1']");
    By city = By.xpath("//input[@placeholder='City']");
    By postCode = By.xpath("//input[@placeholder='Post Code']");
    By country = By.xpath("//select[@name='country_id']");
    By region = By.xpath("//select[@name='zone_id']");
    By terms_Conditions = By.xpath("//input[@type='checkbox']");
    By confirmOrder = By.xpath("//input[@value='Confirm Order']");

    public By getProduct1() {
        return product1;
    }

    public By getProduct2() {
        return Product2;
    }

    public By getCard() {
        return card;
    }

    public By getCheckOut() {
        return checkOut;
    }

    public By getGuest() {
        return guest;
    }

    public By getContinue() {
        return Continue;
    }

    public By getFirstName() {
        return firstName;
    }

    public By getLastName() {
        return lastName;
    }

    public By getEmail() {
        return email;
    }

    public By getPhone() {
        return phone;
    }

    public By getAddress() {
        return address;
    }

    public By getCity() {
        return city;
    }

    public By getPostCode() {
        return postCode;
    }

    public By getCountry() {
        return country;
    }

    public By getRegion() {
        return region;
    }

    public By getTerms_Conditions() {
        return terms_Conditions;
    }

    public By getConfirmOrder() {
        return confirmOrder;
    }
}
