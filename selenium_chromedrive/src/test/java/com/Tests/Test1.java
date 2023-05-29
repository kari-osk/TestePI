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
        page.register("teste01@hotmail.com");
        page.createAccount();
        Thread.sleep(1000);
        page.registerForm("Nometeste", "Sobrenometeste", "11111111111","email@teste.com","123456","123456", "123456789" );

    }

    @AfterEach
    public void tearDown() {
        page.quitDriver();
    }

}
