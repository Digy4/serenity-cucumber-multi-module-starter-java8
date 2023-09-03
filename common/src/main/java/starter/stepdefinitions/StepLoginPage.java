package starter.stepdefinitions;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.serenitybdd.core.Serenity;
public class StepLoginPage extends PageObject {
    
    @Step("Enter Username")
    public void inputUserName(String userName) {
        Serenity.recordReportData().withTitle("Put Request Custom Data- Name").andContents("{\"name\": \"Jo Bloggs\"}");
        $(By.name("username")).sendKeys((userName));
        Serenity.takeScreenshot();
    }
 
    @Step("Enter Password")
    public void inputPassword(String passWord) {
        Serenity.recordReportData().withTitle("Put Request Custom Data- Name").andContents("{\"name\": \"Jo Bloggs\"}");
        $(By.name("password")).sendKeys((passWord));
        Serenity.takeScreenshot();
    }
 
    @Step("Click Submit Button")
    public void clickLogin() {
        Serenity.recordReportData().withTitle("Put Request Custom Data- Name").andContents("{\"name\": \"Jo Bloggs\"}");
        $(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        Serenity.takeScreenshot();
    }
 
    @Step("Error Message on unsuccessful login")
    public String errorMessage() {
        Serenity.recordReportData().withTitle("Put Request Custom Data- Name").andContents("{\"name\": \"Jo Bloggs\"}");
        String actualErrorMessage = $(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")).getText();
        return actualErrorMessage;
    }
 
}