package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class NegitiveTestLogin extends CommonAPI {
        @Test
        public void testUserShouldBeAbleToSignInSuccessfully() throws InterruptedException {
            driver.findElement(By.cssSelector("#nav-link-accountList > span.nav-line-1")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("#ap_email")).sendKeys("abc123");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@class=\"a-button-input\"]")).click();
            Thread.sleep(1000);
            System.out.println(driver.findElement(By.cssSelector("#auth-error-message-box > div")).getText());
        }
    }

