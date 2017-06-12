package org.selenide.examples;

import com.codeborne.selenide.Configuration;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

/**
 * Created by root on 30.05.17.
 */
public class Test {
    @Test
    public void Test() {
        Configuration.timeout=6000;
        open("http://tender.pro");
        $(By.id("form_tenders")).click();

        $(By.name("tendertype")).should(exist);
        $(By.name("tendertype")).selectOption("(любой)");

        $(By.name("country")).should(exist);
        $(By.name("country")).selectOption("Россия");

        $(By.name("region")).should(exist);
        $(By.name("region")).selectOption("Вологодская область");

        $(By.name("company_name")).should(exist);
        $(By.name("company_name")).setValue("Мебельторг(Череповец)");
        $(By.name("send_form")).click();
        sleep(4000);
    }
}