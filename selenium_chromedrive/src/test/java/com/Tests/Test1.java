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

        page.register("teste01@hotmail.com");
        page.createAccount();
        Thread.sleep(1000);
        page.registerForm("Nometeste", "Sobrenometeste", "11111111111","email@teste.com","123456","123456", "1234567890" );
        Thread.sleep(1000);
        page.createRegisterBtn();
        Thread.sleep(2000);

        String checkSuccessMsg = page.checkText();
        assertTrue(checkSuccessMsg.contains("Cadastro realizado"));
        System.out.println("mensagem: " + checkSuccessMsg);
        page.continueBtn();
        Thread.sleep(2000);

        page.register("teste01@hotmail.com");
        page.loginPassword("123456");
    }


    @AfterEach
    public void tearDown() {
        page.quitDriver();
    }

}
