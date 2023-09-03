package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.navigation.NavigateTo;
import starter.search.LookForInformation;
import starter.search.WikipediaArticle;
import net.serenitybdd.core.Serenity;

public class SearchStepDefinitions {

    @Given("{actor} is researching things on the internet")
    public void researchingThings(Actor actor) {
        Serenity.recordReportData().withTitle("Put Request Custom Data- Name").andContents("{\"name\": \"Jo Bloggs\"}");
        actor.wasAbleTo(NavigateTo.theWikipediaHomePage());
        Serenity.takeScreenshot();
    }

    @When("{actor} looks up {string}")
    public void searchesFor(Actor actor, String term) {
        Serenity.recordReportData().withTitle("Put Request Custom Data- Name").andContents("{\"name\": \"Jo Bloggs\"}");
        actor.attemptsTo(
                LookForInformation.about(term)
        );
        Serenity.takeScreenshot();
    }

    @Then("{actor} should see information about {string}")
    public void should_see_information_about(Actor actor, String term) {
        Serenity.recordReportData().withTitle("Put Request Custom Data- Name").andContents("{\"name\": \"Jo Bloggs\"}");
        actor.attemptsTo(
                Ensure.that(WikipediaArticle.HEADING).hasText(term)
        );
        Serenity.takeScreenshot();
    }

}
