package br.com.util;

import br.com.util.objects.LoginObjects;
import br.com.util.setup.DriverManager;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class Base extends DriverManager {

    public Base(WebDriver driver) {
        DriverManager.driver = driver;
    }

    public String geradorCpf() {
        cpfgenerator geradorCpf;

        geradorCpf = new cpfgenerator();
        return geradorCpf.cpf();
    }

    public void waitElement(By locator, Integer time) {
        try {
            new WebDriverWait(driver, time).until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (Exception ignored) {

        }
    }

    public void validadeBtnDisabled(By locator) {
        String buttonContinue = this.findElement(locator).getAttribute("tabindex");
        if (buttonContinue.contains("-1")) {
            System.out.println("Button Disabled");
        } else {
            Assert.fail("Button is activated");
        }
    }

    public WebElement findElement(By locator) {
        this.waitElement(locator, 15);
        try {
            return driver.findElement(locator);
        } catch (Exception e) {
            return null;
        }
    }

    public void MessageError(String text) {
        Assert.fail(text);

    }

    public List<WebElement> findElements(By locator) {
        this.waitElement(locator, 15);
        try {
            return driver.findElements(locator);
        } catch (Exception e) {
            return null;
        }
    }

    public void findOptionDropDown(String option, By locator) throws InterruptedException {
        List<WebElement> DropDown = this.findElements(locator);
        for (WebElement element : DropDown) {
            if (element.getText().trim().equals(option)) {
                element.click();
                break;
            }
        }
        Thread.sleep(2000);
    }

    public void professionalSituation(String profession, String salary) throws InterruptedException {
        Thread.sleep(2000);

        if (profession != null) {
            List<WebElement> opcoes = this.findElements(By.xpath("//span[@class=\"42-MuiTypography-root 42-MuiFormControlLabel-label 42-MuiTypography-body1\"]"));
            for (WebElement element : opcoes) {
                String SectionProfissao = element.getText();
                if (SectionProfissao.contains(profession)) {
                    element.click();
                    break;

                }
            }
        }

        if (salary != null) {
            List<WebElement> opcoes = this.findElements(By.xpath("//span[@class=\"42-MuiTypography-root 42-MuiFormControlLabel-label 42-MuiTypography-body1\"]"));
            for (WebElement element : opcoes) {
                String SectionProfissao = element.getText();
                if (SectionProfissao.contains(salary)) {
                    element.click();
                    break;

                }
            }

        }


        Thread.sleep(2000);
        this.clickElement(By.xpath("//button[@class=\"42-MuiButtonBase-root 42-MuiButton-root de8968a0__SuperButton_root__1cq1g    42-MuiButton-text\"]"));


        this.clickElement(By.xpath("//*[@id=\"switch-button-second-0\"]"));
        this.clickElement(By.xpath("//*[@id=\"switch-button-second-1\"]"));
        Thread.sleep(2000);
        this.clickElement(By.xpath("//button[@class='42-MuiButtonBase-root 42-MuiButton-root de8968a0__SuperButton_root__1cq1g    42-MuiButton-text']"));

    }

    public void clickElement(By locator) {
        this.waitElement(locator, 15);
        if (locator != null) {
            if (driver.findElement(locator).isDisplayed()) {
                try {
                    driver.findElement(locator).click();
                } catch (Exception e) {

                    if (driver.findElement(locator).isDisplayed()) {
                        WebElement element = driver.findElement(locator);
                        JavascriptExecutor executor = (JavascriptExecutor) driver;
                        executor.executeScript("arguments[0].click();", element);

                    } else {
                        Assert.fail("Error click");
                    }

                }

            } else {
                Assert.fail("Error click");
            }
        }
    }

    public void fillText(By elemento, String texto) {
        this.waitElement(elemento, 15);
        if (texto == null || texto.equals("")) {
            return;
        }
        this.waitElement(elemento, 15);
        this.findElement(elemento).sendKeys(texto);

    }

    public void selectAllDelete(By locator) {
        driver.findElement(locator).sendKeys(Keys.CONTROL + "a");
        driver.findElement(locator).sendKeys(Keys.chord(Keys.BACK_SPACE));
    }


    public void insertDocument(String doc, String remember) {
        clickElement(LoginObjects.btn_ready_have_account);

        fillText(LoginObjects.Input_login, doc);
        if (remember.contains("yes")) {
            this.clickElement(LoginObjects.btn_remember_data);
        }
        this.clickElement(LoginObjects.loggin_button);
        this.waitElement(LoginObjects.combo_password, 1000);
    }

    public void insertPassword(String password) throws InterruptedException {
        Thread.sleep(3000);
        for (int i = 0; i < password.length(); i++) {
            System.out.print(password.charAt(i));
            driver.findElement(By.xpath("//button[@datatest='key_" + password.charAt(i) + "']")).click();
        }
        Thread.sleep(4500);
    }

    public void verifyUrl(String url) throws InterruptedException {
        Thread.sleep(4000);
        String url_verify = driver.getCurrentUrl();
        if (url_verify.contains(url)) {
            System.out.println("Direcionamento OK");
        } else {
            Assert.fail("text does not exist in the url");
        }
    }


    public void validateIfElementExists(By locator) {
        if (this.findElement(locator).isEnabled() && this.findElement(locator).isDisplayed()) {
            System.out.println("Successfully found.");
        } else {
            Assert.fail("Element not found on screen");
        }
    }

    public void validateIfElementNotExists(By locator) {
        if (this.findElement(locator) == null) {
            System.out.println("Element not found.");
        } else {
            Assert.fail("Element found");
        }
    }

    public void scrollUseBar() throws InterruptedException {
        Actions act = new Actions(driver);
        act.sendKeys(Keys.PAGE_DOWN).build().perform();
        System.out.println("Scroll down perfomed");
        Thread.sleep(3000);
    }

    public void waitForPageLoaded() {
        ExpectedCondition<Boolean> expectation = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
                    }
                };
        try {
            Thread.sleep(1000);
            WebDriverWait wait = new WebDriverWait(driver, 100);
            wait.until(expectation);
        } catch (Throwable error) {
            Assert.fail("Timeout waiting for Page Load Request to complete.");
        }
    }

    public void insertPin(String password) throws InterruptedException {
        for (int i = 0; i < password.length(); i++) {
            System.out.print(password.charAt(i));

            driver.findElement(By.xpath("//button[@datatest='key_" + password.charAt(i) + "']")).click();

        }
        Thread.sleep(2000);
    }
}


