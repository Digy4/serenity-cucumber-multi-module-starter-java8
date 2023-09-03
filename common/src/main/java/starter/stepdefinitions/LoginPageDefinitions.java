package starter.stepdefinitions;
 
import org.junit.Assert;
import starter.stepdefinitions.StepDashboardPage;
import starter.stepdefinitions.StepLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import net.serenitybdd.core.Serenity;

public class LoginPageDefinitions {

    @Steps
    StepLoginPage loginPage;
 
    @Steps
    StepDashboardPage dashPage;
 
    @Given("User is on Home page")
    public void openApplication() {
        Serenity.recordReportData().withTitle("Put Request Custom Data- Name").andContents("{\"name\": \"Jo Bloggs\"}");
        loginPage.open();
        System.out.println("Page is opened");
        Serenity.takeScreenshot();
    }
 
    @When("User enters username as {string}")
    public void enterUsername(String userName) {
        Serenity.recordReportData().withTitle("Put Request Custom Data- Name").andContents("{\"name\": \"Jo Bloggs\"}");
        System.out.println("Enter Username");
        loginPage.inputUserName(userName);
        Serenity.takeScreenshot();
    }
 
    @When("User enters password as {string}")
    public void enterPassword(String passWord) 
    {
        Serenity.recordReportData().withTitle("Put Request Custom Data- Name").andContents("{\"name\": \"Jo Bloggs\"}");
        loginPage.inputPassword(passWord);
 
        loginPage.clickLogin();
        Serenity.takeScreenshot();
    }
 
    @Then("User should be able to login successfully")
    public void clickOnLoginButton() {
        Serenity.recordReportData().withTitle("Put Request Custom Data- Name").andContents("{\"name\": \"Jo Bloggs\"}");
        dashPage.loginVerify();
    }
 
    @Then("User should be able to see error message {string}")
    public void unsucessfulLogin(String expectedErrorMessage) throws InterruptedException {
        Serenity.recordReportData().withTitle("Put Request Custom Data- Name").andContents("{\"name\": \"Jo Bloggs\"}"); 
        String actualErrorMessage = loginPage.errorMessage();
        Serenity.takeScreenshot();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
 
}