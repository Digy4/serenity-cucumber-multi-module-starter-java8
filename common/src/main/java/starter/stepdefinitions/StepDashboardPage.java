package starter.stepdefinitions;

import org.openqa.selenium.By;
import org.junit.Assert;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.Serenity;
public class StepDashboardPage extends PageObject{
    
    public void loginVerify() {           
        String dashboardTitle = $(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();                   
        Serenity.takeScreenshot();
        Assert.assertTrue(dashboardTitle.contains("Dashboard"));
    }    
}