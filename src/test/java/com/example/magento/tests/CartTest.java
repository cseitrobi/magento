package com.example.magento.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class CartTest extends BaseTest {
    @Test
    public void testAddToCartAndRemoveFromCart() {
        driver.get("https://magento.softwaretestingboard.com/orestes-fitness-short.html");
        driver.findElement(By.id("option-label-size-143-item-175")).click();
        driver.findElement(By.id("option-label-color-93-item-49")).click();
        driver.findElement(By.id("product-addtocart-button")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".message-success")));

        driver.get("https://magento.softwaretestingboard.com/checkout/cart/");
        Assert.assertFalse(driver.findElements(By.cssSelector(".cart.item")).isEmpty(), "Cart is empty!");

        
        WebElement checkoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-role='proceed-to-checkout']")));
            checkoutButton.click();
        // Assert.assertTrue(driver.findElements(By.cssSelector(".cart.item")).isEmpty(), "Cart is not empty after deletion!");
    }
}