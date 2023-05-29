package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Page extends BasePage {

    protected static final String signInBtnXpath = "/html/body/div[1]/div[1]/div/button[1]"; //xpath
    protected static final String inputEmailCss = "#login"; //cssSelector
    protected static final String btnCreateAccountXpath = "/html/body/div[1]/form/div/button[2]"; //xpath
    protected static final String inputFirstNameXpath = "//*[@id=\"firstName\"]"; //xpath
    protected static final String inputLasNameXpath = "//*[@id=\"lastName\"]"; //xpath
    protected static final String inputCpfXpath = "//*[@id=\"dni\"]"; //xpath
    protected static final String inputFormEmailXpath = "//*[@id=\"email\"]"; //xpath
    protected static final String inputPasswordXpath = "//*[@id=\"password\"]" ; //xpath
    protected static final String inputConfirmPasswordXpath = "//*[@id=\"confirmPassword\"]"; //xpath
    protected static final String inputPhoneXpath = "//*[@id=\"phone\"]"; //xpath
    protected static final String btnCreateAccountFormXpath = "/html/body/div[1]/form/div/div[4]/button"; //xpath
    protected static final String btnContinuarXpath = "/html/body/div[1]/form/div/div/input"; //xpath


    public void signIn() {
        WebElement signInBtn = getWebElement(By.xpath(signInBtnXpath));
        signInBtn.click();
    }
    public void register(String email) {
        WebElement emailInput = getWebElement(By.cssSelector(inputEmailCss));
        emailInput.clear();
        emailInput.sendKeys(email);
    }
    public void createAccount() {
        WebElement createBtn = getWebElement(By.xpath(btnCreateAccountXpath));
        createBtn.click();
    }

    public void registerForm(String firstName, String lastName, String cpf, String email, String password, String confirmPassword, String phone) {
        WebElement formFirstName = getWebElement(By.xpath(inputFirstNameXpath));
        formFirstName.clear();
        formFirstName.sendKeys(firstName);

        WebElement formLastName = getWebElement(By.xpath(inputLasNameXpath));
        formLastName.clear();
        formLastName.sendKeys(lastName);

        WebElement formCpf = getWebElement(By.xpath(inputCpfXpath));
        formCpf.clear();
        formCpf.sendKeys(cpf);

        WebElement formEmail = getWebElement(By.xpath(inputFormEmailXpath));
        formEmail.clear();
        formEmail.sendKeys(email);

        WebElement formPassword = getWebElement(By.xpath(inputPasswordXpath));
        formPassword.clear();
        formPassword.sendKeys(password);

        WebElement formConfirmPassword = getWebElement(By.xpath(inputConfirmPasswordXpath));
        formConfirmPassword.clear();
        formConfirmPassword.sendKeys(confirmPassword);

        WebElement formPhone = getWebElement(By.xpath(inputPhoneXpath));
        formPhone.clear();
        formPhone.sendKeys(phone);

        WebElement formBrtCreate = getWebElement(By.xpath(btnCreateAccountFormXpath));
        formBrtCreate.click();
    }



    public void login() {
        WebElement loginInput = getWebElement(By.xpath(btnContinuarXpath));
        loginInput.click();
    }




}


