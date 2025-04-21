import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_002Page;
import static org.junit.Assert.assertTrue;

public class tc_002Steps {
    WebDriver driver;
    tc_002Page loginPage;

    @Given("el usuario está en la página de inicio de sesión")
    public void el_usuario_está_en_la_página_de_inicio_de_sesión() {
        loginPage = new tc_002Page(driver);
        loginPage.navigateToLoginPage();
    }

    @When("ingresa el nombre de usuario {string} y la contraseña {string}")
    public void ingresa_el_nombre_de_usuario_y_la_contraseña(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.submitLogin();
    }

    @Then("el sistema muestra un mensaje de error de autenticación")
    public void el_sistema_muestra_un_mensaje_de_error_de_autenticación() {
        assertTrue(loginPage.isErrorMessageDisplayed());
    }
}