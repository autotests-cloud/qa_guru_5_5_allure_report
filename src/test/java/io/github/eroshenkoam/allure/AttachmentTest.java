package io.github.eroshenkoam.allure;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class AttachmentTest {

    private Map<String, String> attachments = new HashMap<>();

    @Test
    public void testAttachments() {
        testSomething();
        testSomething2();
        attachments.forEach((name, content) -> {
            Allure.attachment(name, content);
        });
    }

    @Step("Step with attachment")
    public void testSomething() {
        final String content = "Hello, world!";
        attachments.put("hello.txt", content);
    }

    @Step("Step with one more attachment")
    public void testSomething2() {
        final String content = "Hello, my friend!";
        attachments.put("answer.txt", content);
    }
}
