package com.example.magento.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    private By cartItem = By.cssSelector(".cart.item");
    private By removeItemButton = By.cssSelector(".action-delete");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean isProductInCart() {
        return !driver.findElements(cartItem).isEmpty();
    }

    public void removeProductFromCart() {
        driver.findElement(removeItemButton).click();
    }
}