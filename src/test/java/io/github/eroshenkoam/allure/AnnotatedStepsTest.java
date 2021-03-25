package io.github.eroshenkoam.allure;

import org.junit.jupiter.api.Test;

public class AnnotatedStepsTest {

    private final static String REPOSITORY = "eroshenkoam/allure-example";
    private final static int ISSUE_NUMBER = 68;

    private WebSteps steps = new WebSteps();

    @Test
    public void testSearch() {
        steps.openMainPage();
        steps.searchForRepository(REPOSITORY);
        steps.goToRepository(REPOSITORY);
        steps.clickOnIssueTab();
        steps.shouldSeeIssueWithNumber(ISSUE_NUMBER);
    }

}
