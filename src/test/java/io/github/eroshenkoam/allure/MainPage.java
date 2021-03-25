package io.github.eroshenkoam.allure;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    public SelenideElement searchString() {
        return $(".header-search-input");
    }

    public void makeSearch() {
        this.searchString().click();
        this.searchString().sendKeys("");
        this.searchString().submit();
    }

    public SelenideElement issueTab() {
        return $(withText("Issues12"));
    }

}
