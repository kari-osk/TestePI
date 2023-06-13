package com.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasePage {

        public static WebDriver driver;
        //protected static final String URL = "http://localhost:3000";
        protected static final String URL = "https://dh-money.vercel.app/";

    public BasePage() {

            System.setProperty("webdriver.chrome.driver", "C:/Users/karin/OneDrive/Documentos/GIT/TestePI/selenium_chromedrive/src/test/resources/chromedriver/chromedriver.exe");
            System.setProperty("webdriver.chrome.whitelistedIps", "");

            final ChromeOptions chromeOptions = new ChromeOptions();
//          chromeOptions.addArguments("--headless");
            chromeOptions.addArguments("--remote-allow-origins=*");
            this.driver = new ChromeDriver(chromeOptions);
            driver.get("https://dh-money.vercel.app/");
            //driver.get("http://localhost:3000/");

        }

        public void openApp () {
            getDriver().get(URL);
            getDriver().manage().window().maximize();
        }

        public WebDriver getDriver () {
            return driver;
        }

        public WebElement getWebElement (By locator){
            WebElement element = null;
            try {
                element = driver.findElement(locator);
            } catch (Exception e) {
                System.out.println("Elemento não encontrado");
                System.out.println("Mensagem de erro: " + e);
            }
            return element;
        }
        public void quitDriver () {
            getDriver().quit();
        }
    }
