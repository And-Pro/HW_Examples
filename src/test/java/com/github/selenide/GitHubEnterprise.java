package com.github.selenide;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class GitHubEnterprise {

    @Test
        void GitHubEnterpriseTest(){
            open("https://github.com");
            $(byText("Solutions")).hover();
            $(byText("Enterprise")).click();
            $(".col-9-max").shouldHave(text("Build like the best"));
    }
}
