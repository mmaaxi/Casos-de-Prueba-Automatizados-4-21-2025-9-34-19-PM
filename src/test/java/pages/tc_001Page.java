package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_001Page {
    WebDriver driver;

    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.id("loginButton");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void ingresarUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void ingresarPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public boolean verificarPaginaInicio() {
        // Lógica para verificar que el usuario ha ingresado correctamente
        return driver.getCurrentUrl().equals("url_de_la_pagina_de_inicio");
    }
}