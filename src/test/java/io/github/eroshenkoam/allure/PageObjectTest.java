package io.github.eroshenkoam.allure;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;

public class PageObjectTest {

    @Test
    public void testSearch() {
        MainPage page = new MainPage();
        page.makeSearch();

        page.issueTab().click();
    }

}
