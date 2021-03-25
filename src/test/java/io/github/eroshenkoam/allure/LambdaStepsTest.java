package io.github.eroshenkoam.allure;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Allure;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class LambdaStepsTest {

    private final String BASE_URL = "https://github.com";

    private final static String REPOSITORY = "eroshenkoam/allure-example";
    private final static String USER = "eroshenkoam";
    private final static int ISSUE_NUMBER = 12;

    @Test
    //TODO: пример ссылки на динамические логи
    public void searchForIssue() {
        step("Открываем главную страницу", (step) -> {
            step.parameter("url", BASE_URL);
            open(BASE_URL);
        });
        step("Ищем репозиторий", (step) -> {
            step.parameter("repository", REPOSITORY);

            $(".header-search-input").click();
            $(".header-search-input").sendKeys(REPOSITORY);
            $(".header-search-input").submit();
        });
        step("Переходим в репозиторий", () -> {
            $(By.linkText("eroshenkoam/allure-example")).click();
        });
        step("Переходим в таб Issues", () -> {
            $(withText("Issues")).click();
        });
        step("Проверяем что Issue с номером 68 существует", () -> {
            $(withText("#" + ISSUE_NUMBER)).should(Condition.exist);
        });
    }
}
