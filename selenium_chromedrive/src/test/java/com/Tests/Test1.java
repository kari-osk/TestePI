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

        page.register("teste38@hotmail.com");
        page.createAccount();
        Thread.sleep(1000);
        page.registerForm("Teste38", "teste38", "333344444444","teste38@hotmail.com","123456","123456", "12345678901" );
        Thread.sleep(1000);

        page.createRegisterBtn();
        Thread.sleep(6000);

        String checkSuccessMsg = page.checkText();
        assertTrue(checkSuccessMsg.contains("Cadastro realizado"));
        System.out.println("mensagem: " + checkSuccessMsg);
        Thread.sleep(1000);

        page.continueBtn();
        Thread.sleep(1000);

        page.register("teste38@hotmail.com");
        page.continueLoginBtn();
        Thread.sleep(1000);
        page.loginPassword("123456");
        page.loginBtn();
        Thread.sleep(1000);

        /*String checkTextDashboard = page.initialDashboard();
        assertTrue(checkTextDashboard.contains("Atividade"));
        System.out.println("mensagem: " + checkTextDashboard);
        Thread.sleep(1000);*/
    }



    @AfterEach
    public void tearDown() {
        page.quitDriver();
    }

}
