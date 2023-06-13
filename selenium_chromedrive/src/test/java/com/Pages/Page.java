package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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
    protected static final String btnCreateAccountFormXpath= "/html/body/div[1]/form/div/div[4]/button"; //xpath
    /* tela de cadastro realizado --------------------------*/
    protected static final String successMsgXpath = "body > div.css-fsxuga > form > div > h2"; //xpath
    protected static final String btnContinueXpath = "html/body/div[1]/form/div/button"; //xpath
    protected static final String inputPasswordCss = "#password"; //css
    protected static final String btnContinueLoginXpath = "/html/body/div[1]/form/div/button[1]"; //xpath
    protected static final String btnContinuePasswordxpath = "/html/body/div[1]/form/div/button"; //css
    protected static final String initialDashXpath = "/html/body/div[1]/div[1]/div/p"; //xpath
    protected static final String btnContinuarXpath = "/html/body/div[1]/form/div/div/input"; //xpath

    protected static final String btnLoadValueXpath = "/html/body/div[1]/div[2]/div[2]/div/div[2]/button[1]"; //xpath

    protected static final String btnSelectCardXpath = "/html/body/div[1]/div[2]/div[2]/div/button[2]/div"; //xpath
    protected static final String btnCartoesXpath = "/html/body/div[1]/div[2]/div[1]/div/div/a[6]"; //Xpath
    protected static final String btnNewCardXpath = "/html/body/div[1]/div[2]/div[2]/div/div/div[2]/a/div/p"; //xpath
    protected static final String inputCardNumberXpath = "//*[@id=\"number_id\"]"; //xpath
    protected static final String inputCardDateXpath = "//*[@id=\"expiration_date\"]"; //xpath
    protected static final String inputCardNameXpath = "//*[@id=\"first_last_name\"]"; //xpath
    protected static final String inputCVCXpath = "//*[@id=\"cod\"]"; //xpath
    protected static final String btnCardContinuarXpath = "/html/body/div[1]/div[2]/div[2]/div/div/form/button"; //xpath

    public void signIn() {
        WebElement signInBtn = getWebElement(By.xpath(signInBtnXpath));
        new WebDriverWait(getDriver(), Duration.ofSeconds(40)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(signInBtnXpath)));
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

    public void registerForm(String firstName, String lastName, String cpf, String email, String password, String confirmPassword, String phone) throws InterruptedException {
        WebElement formFirstName = getWebElement(By.xpath(inputFirstNameXpath));
        formFirstName.clear();
        formFirstName.sendKeys(firstName);

        WebElement formLastName = getWebElement(By.xpath(inputLasNameXpath));
        formLastName.clear();
        formLastName.sendKeys(lastName);

        Thread.sleep(1000);

        WebElement formCpf = getWebElement(By.xpath(inputCpfXpath));
        formCpf.clear();
        formCpf.click();
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
        formPhone.click();
        formPhone.sendKeys(phone);
    }
    public void createRegisterBtn() {
        WebElement formBtnCreate = getWebElement(By.xpath(btnCreateAccountFormXpath));
        formBtnCreate.click();
    }
    public String checkText() {
        WebElement successMessage = getWebElement(By.cssSelector(successMsgXpath));
        new WebDriverWait(getDriver(), Duration.ofSeconds(40)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(successMsgXpath)));

        System.out.println(successMessage.getText());
        return successMessage.getText();
    }
    public void continueBtn() {
        WebElement btnContinue = getWebElement(By.xpath(btnContinueXpath));
        new WebDriverWait(getDriver(), Duration.ofSeconds(60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(btnContinueXpath)));
        btnContinue.click();
    }
    public void continueLoginBtn() {
        WebElement btnContinueLogin = getWebElement(By.xpath(btnContinueLoginXpath));
        btnContinueLogin.click();
    }
    public void loginPassword(String passwordLogin) {
        WebElement inputPassword = getWebElement(By.cssSelector(inputPasswordCss));
        new WebDriverWait(getDriver(), Duration.ofSeconds(50)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(inputPasswordCss)));
        inputPassword.clear();
        inputPassword.sendKeys(passwordLogin);
    }
    public void loginBtn() {
        WebElement btnContinueLogin = getWebElement(By.xpath(btnContinuePasswordxpath));
        btnContinueLogin.click();
    }


    public void login() {
        WebElement loginInput = getWebElement(By.xpath(btnContinuarXpath));
        loginInput.click();
    }

    public void loadValue() {
        WebElement loadValueBtn = getWebElement(By.xpath(btnLoadValueXpath));
        new WebDriverWait(getDriver(), Duration.ofSeconds(60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(btnLoadValueXpath)));
        loadValueBtn.click();
    }
    public void selectCard() {
        WebElement selectCardBtn = getWebElement(By.xpath(btnSelectCardXpath));
        selectCardBtn.click();
    }

    public void addNewCard() {
        WebElement addCard = getWebElement(By.xpath(btnNewCardXpath));
        addCard.click();
    }

    public void cardForm(String cardNumber, String cardDate, String FullName, String cvc) {
        WebElement cardNumberInput = getWebElement(By.xpath(inputCardNumberXpath));
        cardNumberInput.clear();
        cardNumberInput.click();
        cardNumberInput.sendKeys(cardNumber);

        WebElement cardDateInput = getWebElement(By.xpath(inputCardDateXpath));
        cardDateInput.clear();
        cardDateInput.click();
        cardDateInput.sendKeys(cardDate);

        WebElement cardFullName = getWebElement(By.xpath(inputCardNameXpath));
        cardFullName.clear();
        cardFullName.click();
        cardFullName.sendKeys(FullName);

        WebElement cardCvc = getWebElement(By.xpath(inputCVCXpath));
        cardCvc.clear();
        cardCvc.click();
        cardCvc.sendKeys(cvc);

    }
    public void btnCardForm() {
        WebElement cardBtn = getWebElement(By.xpath(btnCardContinuarXpath));
        new WebDriverWait(getDriver(), Duration.ofSeconds(60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(btnCardContinuarXpath)));
        cardBtn.click();
    }



}


