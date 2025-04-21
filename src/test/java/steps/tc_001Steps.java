package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_001Page;
import static org.junit.Assert.assertTrue;

public class tc_001Steps {
    WebDriver driver;
    WebDriverWait wait;
    tc_001Page loginPage;

    @Given("el usuario está en la página de login")
    public void el_usuario_está_en_la_página_de_login() {
        // Código para inicializar WebDriver y navegar a la página de login
        // driver.get("url_de_la_pagina_de_login");
        loginPage = new tc_001Page(driver);
    }

    @When("el usuario ingresa el usuario {string} y contraseña {string}")
    public void el_usuario_ingresa_el_usuario_y_contraseña(String username, String password) {
        loginPage.ingresarUsername(username);
        loginPage.ingresarPassword(password);
    }

    @When("hace clic en el botón de login")
    public void hace_clic_en_el_botón_de_login() {
        loginPage.clickLoginButton();
    }

    @Then("el usuario ingresa al sistema exitosamente")
    public void el_usuario_ingresa_al_sistema_exitosamente() {
        // Verificación de que el usuario ha ingresado al sistema
        assertTrue(loginPage.verificarPaginaInicio());
    }
}