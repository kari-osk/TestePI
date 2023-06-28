package com.Tests;

import static org.junit.jupiter.api.Assertions.assertTrue;
import com.Pages.Page;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class Test1 {
    private static Page page;

    @BeforeEach
    public void setUp() {
        page = new Page();
        page.openApp();
    }
    @Test
    @Tag("Regression")
    public void registerTest() throws InterruptedException {
        page.signIn();
        Thread.sleep(1000);

        page.register("teste139@hotmail.com");
        page.createAccount();
        Thread.sleep(1000);
        page.registerForm("Teste", "Sobrenome", "35999999999","teste139@hotmail.com","123456","123456", "12345678901" );
        Thread.sleep(1000);

        page.createRegisterBtn();
        Thread.sleep(6000);

        String checkSuccessMsg = page.checkText();
        assertTrue(checkSuccessMsg.contains("Cadastro realizado"));
        System.out.println("mensagem: " + checkSuccessMsg);
        Thread.sleep(1000);

        page.continueBtn();
        Thread.sleep(1000);

        page.register("teste139@hotmail.com");
        page.continueLoginBtn();
        Thread.sleep(1000);
        page.loginPassword("123456");
        page.loginBtn();
        Thread.sleep(5000);

        page.loadValue();
        Thread.sleep(1000);

        page.selectCard();

        page.addNewCard();
        Thread.sleep(1000);

        page.cardForm("4545345453456674", "012026", "Teste Sobrenome", "125");
        Thread.sleep(2000);

        page.btnCardForm();
        Thread.sleep(3000);

        page.profile();
        Thread.sleep(1000);

        page.menuLoadValue();
        Thread.sleep(1000);

        page.menuActivity();
        Thread.sleep(1000);

        page.menuPay();
        Thread.sleep(1000);

        page.menuCard();
        Thread.sleep(1000);

        page.logout();
    }


    /*@AfterEach
    public void tearDown() {
        page.quitDriver();
    }*/

}
