package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Page extends BasePage {

    /*----- create account------*/
    protected static final String signInBtnXpath = "/html/body/div[1]/div[1]/div/button[1]";
    protected static final String inputEmailCss = "#login";
    protected static final String btnCreateAccountXpath = "/html/body/div[1]/form/div/button[2]";
    protected static final String inputFirstNameXpath = "//*[@id=\"firstName\"]";
    protected static final String inputLasNameXpath = "//*[@id=\"lastName\"]";
    protected static final String inputCpfXpath = "//*[@id=\"dni\"]";
    protected static final String inputFormEmailXpath = "//*[@id=\"email\"]";
    protected static final String inputPasswordXpath = "//*[@id=\"password\"]" ;
    protected static final String inputConfirmPasswordXpath = "//*[@id=\"confirmPassword\"]";
    protected static final String inputPhoneXpath = "//*[@id=\"phone\"]";
    protected static final String btnCreateAccountFormXpath= "/html/body/div[1]/form/div/div[4]/button";

    /*----- login ------*/
    protected static final String successMsgXpath = "/html/body/div[1]/form/div/h2";
    protected static final String btnContinueXpath = "html/body/div[1]/form/div/button";
    protected static final String inputPasswordCss = "#password";
    protected static final String btnContinueLoginXpath = "/html/body/div[1]/form/div/button[1]";
    protected static final String btnContinuePasswordxpath = "/html/body/div[1]/form/div/button";
    /*----- dashboard ------*/
    protected static final String initialDashXpath = "/html/body/div[1]/div[1]/div/p";
    protected static final String btnContinuarXpath = "/html/body/div[1]/form/div/div/input";
    protected static final String btnLoadValueXpath = "/html/body/div[1]/div[2]/div[2]/div/div[2]/button[1]";
    protected static final String btnSelectCardXpath = "/html/body/div[1]/div[2]/div[2]/div/button[2]/div";
    protected static final String btnNewCardXpath = "/html/body/div[1]/div[2]/div[2]/div/div/div[2]/a/div/p";
    protected static final String inputCardNumberXpath = "//*[@id=\"number_id\"]";
    protected static final String inputCardDateXpath = "//*[@id=\"expiration_date\"]";
    protected static final String inputCardNameXpath = "//*[@id=\"first_last_name\"]";
    protected static final String inputCVCXpath = "//*[@id=\"cod\"]";
    protected static final String btnCardContinuarXpath = "/html/body/div[1]/div[2]/div[2]/div/div/form/button";
    protected static final String btnVerAtividadeXpath = "/html/body/div[1]/div[2]/div[2]/div/div[4]/div/p";

    /*----- menu profile ------*/
    protected static final String btnProfileXpath = "/html/body/div[1]/div[2]/div[1]/div/div/a[3]";
    protected static final String btnEditNameXpath = "/html/body/div[1]/div[2]/div[2]/div/form/div/div[3]/div/div/div[2]";
    protected static final String inputEditNameXpath = "//*[@id=\"name\"]";
    protected static final String btnMenuLoadValueXpath = "/html/body/div[1]/div[2]/div[1]/div/div/a[4]";
    protected static final String radioBtnCardXpath = "/html/body/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div/div/label/span";
    protected static final String btnContinueDepositXpath = "/html/body/div[1]/div[2]/div[2]/div/div/div[2]/button";
    protected static final String inputDepositValueXpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/input";
    protected static final String btnContinueDepositValueXpath = "/html/body/div[1]/div[2]/div[2]/div/div/button";
    protected static final String btnConfirmDepositXpath = "/html/body/div[1]/div[2]/div[2]/div/form/button";
    protected static final String btnBackXpath = "/html/body/div[1]/div[2]/div[2]/div/div/div[3]/button[1]";
    protected static final String btnLogoutXpath = "/html/body/div[1]/div[2]/div[1]/div/div/a[7]";

    /*----- menu activity ------*/
    protected static final String btnMenuActivityXpath = "/html/body/div[1]/div[2]/div[1]/div/div/a[2]";
    protected static final String btnFilterXpath = "/html/body/div[1]/div[2]/div[2]/div/div[1]/button";
    protected static final String radioBtnTodayXpath = "//*[@id=\"accordion-panel-:r22:\"]/div/div/label[1]/span[1]";
    protected static final String btnApplyXpath = "//*[@id=\"chakra-modal--body-:r1v:\"]/div/div/button[2]";
    protected static final String activityDataXpath = "/html/body/div[1]/div[2]/div[2]/div/div[2]/a/div/div[1]/p";
    protected static final String activityDocXpath = "/html/body/div[1]/div[2]/div[2]/div/div/div[2]/button[2]";
    protected static final String btnBackToHomeXpath = "/html/body/div[1]/div[2]/div[2]/div/div/div[2]/button[1]";

    /*----- menu pay ------*/
    protected static final String btnMenuPayXpath = "/html/body/div[1]/div[2]/div[1]/div/div/a[5]";
    protected static final String inputPayXpath = "/html/body/div[1]/div[2]/div[2]/div/div[1]/div/input";
    protected static final String btnTryAgainXpath = "/html/body/div[1]/div[2]/div[2]/div/div/div[2]/button";
    protected static final String selectServiceXpath = "/html/body/div[1]/div[2]/div[2]/div/div[2]/div/div/a";
    protected static final String btnPayContinueXpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/button";
    protected static final String radioBtnPayCardXpath = "/html/body/div[1]/div[2]/div[2]/div/div/div[2]/div[1]/div/div/div/label/span";
    protected static final String btnPayServiceXpath = "/html/body/div[1]/div[2]/div[2]/div/div/button";
    protected static final String btnPayDocXpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[3]/button[2]";
    protected static final String btnPayBackHomeXpath =  "/html/body/div[1]/div[2]/div[2]/div/div/div/div[3]/button[1]";

    /*----- menu card ------*/
    protected static final String menuCardXpath = "/html/body/div[1]/div[2]/div[1]/div/div/a[6]";
    protected static final String btnDeleteCardXpath = "/html/body/div[1]/div[2]/div[2]/div/div[2]/div/p";
    protected static final String btnConfirmDeleteCardXpath = "#chakra-modal--body-\\:rn\\: > footer > button.chakra-button.css-prflx4";



    public void signIn() {
        WebElement signInBtn = getWebElement(By.xpath(signInBtnXpath));
        new WebDriverWait(getDriver(), Duration.ofSeconds(40)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(signInBtnXpath)));
        signInBtn.click();
    }
    public void register(String email) {
        WebElement emailInput = getWebElement(By.cssSelector(inputEmailCss));
        new WebDriverWait(getDriver(), Duration.ofSeconds(40)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(inputEmailCss)));
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
        WebElement successMessage = getWebElement(By.xpath(successMsgXpath));
        new WebDriverWait(getDriver(), Duration.ofSeconds(60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(successMsgXpath)));

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

    public void allActivity() {
        WebElement activityBtn = getWebElement(By.xpath(btnVerAtividadeXpath));
        activityBtn.click();
    }


    public void loadValue() {
        WebElement loadValueBtn = getWebElement(By.xpath(btnLoadValueXpath));
        new WebDriverWait(getDriver(), Duration.ofSeconds(90)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(btnLoadValueXpath)));
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
        new WebDriverWait(getDriver(), Duration.ofSeconds(60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(inputCardNumberXpath)));
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


    public void profile() throws InterruptedException {
        WebElement btnProfile = getWebElement(By.xpath(btnProfileXpath));
        btnProfile.click();
        Thread.sleep(1000);

        WebElement editNameBtn = getWebElement(By.xpath(btnEditNameXpath));
        new WebDriverWait(getDriver(), Duration.ofSeconds(60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(btnEditNameXpath)));
        editNameBtn.click();

        WebElement alterName = getWebElement(By.xpath(inputEditNameXpath));
        alterName.click();
        alterName.sendKeys(Keys.CONTROL + "a");
        alterName.sendKeys(Keys.DELETE);
        Thread.sleep(500);
        alterName.sendKeys("Nome Alterado");
    }

    public void menuLoadValue() throws InterruptedException {
        WebElement menuLoadValue = getWebElement(By.xpath(btnMenuLoadValueXpath));
        menuLoadValue.click();

        Thread.sleep(1000);

        WebElement selectSectionCardBtn = getWebElement(By.xpath(btnSelectCardXpath));
        new WebDriverWait(getDriver(), Duration.ofSeconds(60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(btnSelectCardXpath)));
        selectSectionCardBtn.click();

        WebElement selectCardBtn = getWebElement(By.xpath(radioBtnCardXpath));
        selectCardBtn.click();

        WebElement continueBtn = getWebElement(By.xpath(btnContinueDepositXpath));
        continueBtn.click();

        WebElement depositValue = getWebElement(By.xpath(inputDepositValueXpath));
        depositValue.click();
        depositValue.clear();
        depositValue.sendKeys("850");

        WebElement continueDeposit = getWebElement(By.xpath(btnContinueDepositValueXpath));
        continueDeposit.click();

        WebElement confirmDeposit = getWebElement(By.xpath(btnConfirmDepositXpath));
        confirmDeposit.click();

        Thread.sleep(2000);

        WebElement backInitial = getWebElement(By.xpath(btnBackXpath));
        new WebDriverWait(getDriver(), Duration.ofSeconds(60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(btnBackXpath)));
        backInitial.click();
    }

    public void menuActivity() throws InterruptedException {
        WebElement btnMenuActivity = getWebElement(By.xpath(btnMenuActivityXpath));
        btnMenuActivity.click();

        WebElement btnFilter = getWebElement(By.xpath(btnFilterXpath));
        new WebDriverWait(getDriver(), Duration.ofSeconds(60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(btnFilterXpath)));
        btnFilter.click();

        WebElement btnTodayActivity = getWebElement(By.xpath(radioBtnTodayXpath));
        new WebDriverWait(getDriver(), Duration.ofSeconds(70)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(radioBtnTodayXpath)));
        btnTodayActivity.click();

        WebElement btnApply = getWebElement(By.xpath(btnApplyXpath));
        btnApply.click();

        WebElement activityData = getWebElement(By.xpath(activityDataXpath));
        new WebDriverWait(getDriver(), Duration.ofSeconds(60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(activityDataXpath)));
        activityData.click();

        Thread.sleep(1000);

        WebElement activityDoc = getWebElement(By.xpath(activityDocXpath));
        new WebDriverWait(getDriver(), Duration.ofSeconds(60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(activityDocXpath)));
        activityDoc.click();

        Thread.sleep(1000);

        WebElement backToHome = getWebElement(By.xpath(btnBackToHomeXpath));
        backToHome.click();
    }

    public void menuPay() throws InterruptedException {
        WebElement btnMenuPay = getWebElement(By.xpath(btnMenuPayXpath));
        btnMenuPay.click();

        Thread.sleep(1000);

        WebElement inputPay = getWebElement(By.xpath(inputPayXpath));
        inputPay.click();
        inputPay.sendKeys("hbo");

        WebElement selectService = getWebElement(By.xpath(selectServiceXpath));
        selectService.click();

        Thread.sleep(1000);

        WebElement btnContinue = getWebElement(By.xpath(btnPayContinueXpath));
        new WebDriverWait(getDriver(), Duration.ofSeconds(60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(btnPayContinueXpath)));
        btnContinue.click();

        Thread.sleep(1000);

        WebElement selectCard = getWebElement(By.xpath(radioBtnPayCardXpath));
        new WebDriverWait(getDriver(), Duration.ofSeconds(60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(radioBtnPayCardXpath)));
        selectCard.click();

        WebElement btnPay = getWebElement(By.xpath(btnPayServiceXpath));
        btnPay.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");

        WebElement btnDocPay = getWebElement(By.xpath(btnPayDocXpath));
        btnDocPay.click();

        WebElement btnBackHome = getWebElement(By.xpath(btnPayBackHomeXpath));
        btnBackHome.click();
    }

    public void menuCard() throws InterruptedException {
        WebElement btnMenuCard = getWebElement(By.xpath(menuCardXpath));
        btnMenuCard.click();

        Thread.sleep(1000);

        WebElement selectCard = getWebElement(By.xpath(btnDeleteCardXpath));
        new WebDriverWait(getDriver(), Duration.ofSeconds(60)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(btnDeleteCardXpath)));
        selectCard.click();

        Thread.sleep(1000);

        WebElement confirmDeletion = getWebElement(By.cssSelector(btnConfirmDeleteCardXpath));
        new WebDriverWait(getDriver(), Duration.ofSeconds(100)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(btnConfirmDeleteCardXpath)));
        confirmDeletion.click();

    }

    public void logout() {
        WebElement logoutBtn = getWebElement(By.xpath(btnLogoutXpath));
        logoutBtn.click();
    }

}


