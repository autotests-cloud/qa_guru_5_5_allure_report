package io.github.eroshenkoam.allure;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static com.codeborne.selenide.Selenide.open;

public class DynamicTest {

    private final String uuid = UUID.randomUUID().toString();

    @Test
    public void testDynamic() {
        open("https://github.com?session=" + uuid);
        Allure.getLifecycle().updateTestCase(tc -> {
            tc.setName("Динамичкский тест");
        });
        Allure.label("owner", "eroshenkoam");
        Allure.feature("Работа с разметкой");
        Allure.story("Динамическая разметрка");
        Allure.link("Logger", "https://logdatabase.com?session=" + uuid);
    }

}
