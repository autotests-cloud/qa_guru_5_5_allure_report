package io.github.eroshenkoam.allure;

import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Набор тест с аннотациями")
public class AnnotatedTest {

    @Test
    @Owner("eroshenkoam")
    @Feature("Работа с разметкой")
    @Story("Разметка аннотаций")
    @Severity(SeverityLevel.BLOCKER)
    @Link(name = "BaseURL", url = "https://github.com")
    @DisplayName("Пример теста с аннотациями")
    public void testSomething() {

    }

}
