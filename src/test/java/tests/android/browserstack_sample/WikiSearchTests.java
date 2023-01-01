package tests.android.browserstack_sample;

import com.codeborne.selenide.CollectionCondition;
import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Test;
import tests.TestBase;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class WikiSearchTests extends TestBase {

    @Test
    void successSearchTest() {
        $(AppiumBy.accessibilityId("Search Wikipedia")).click();
        $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Tesla");
        $$(AppiumBy.className("android.widget.TextView"))
                .shouldHave(CollectionCondition.sizeGreaterThan(0));

        $(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title")).click();
        $(AppiumBy.className("android.view.View")).click();
        $(AppiumBy.className("android.widget.TextView")).shouldHave(text("Tesla"));
    }
}
