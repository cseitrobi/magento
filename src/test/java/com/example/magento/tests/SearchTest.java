package com.example.magento.tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {
    @Test
    public void testSearchFunctionality() {
        driver.get("https://magento.softwaretestingboard.com");
        WebElement searchBox = driver.findElement(By.id("search"));
        searchBox.sendKeys("Fusion");
        searchBox.submit();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


            List<WebElement> productLinks = driver.findElements(By.cssSelector("a.product-item-link"));

            boolean productFound = false;
            for (WebElement product : productLinks) {
                if (product.getText().contains("Fusion")) {
                    productFound = true;
                    System.out.println("Fusion product found");
                    break;
                }
            }
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".products-grid .product-item")));

        Assert.assertFalse(driver.findElements(By.cssSelector(".products-grid .product-item")).isEmpty(), "No search results found!");
    }
}