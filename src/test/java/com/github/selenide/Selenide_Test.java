package com.github.selenide;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class Selenide_Test {

    @Test
    void ShouldFindJunit5Code () {
        //Открыть github.com
        open("https://github.com");
        //открыть окно поиска
        $("[data-scoped-placeholder=Search]").setValue("Selenide").pressEnter();
        //кликнуть первый репозиторий из списка
        $$("ul.repo-list li").first().$("a").click();
        //проверка заголовка Wiki
        $("#repository-container-header ul li a#wiki-tab").click();
        // Проверка Pages на наличие SoftAssertions
        $$("div #wiki-body ul li").get(7).$("a").click();
        //Проверка на код Junit5
        $("div.markdown-body").shouldHave(text("Using JUnit5 extend test class:"));
    }
}