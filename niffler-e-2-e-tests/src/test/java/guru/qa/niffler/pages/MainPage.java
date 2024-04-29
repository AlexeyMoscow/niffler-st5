package guru.qa.niffler.pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {
    private static ElementsCollection spends = $$(By.xpath("//table[@class='table spendings-table']//td"));
    private static SelenideElement deleteButton = $(By.xpath("//button[text() = 'Delete selected']"));
    private static ElementsCollection spendRow = $(".spendings-table tbody").$$("tr");
    private final By cellSelector = By.cssSelector("td");

    public MainPage clickDeleteSelectedButton() {
        deleteButton.shouldNotHave(attribute("disabled")).shouldBe(visible, enabled).click();
        return this;
    }

    public MainPage clickCheckBoxByDescription(String description) {
        getCheckBox(description).scrollIntoView(true).click();
        return this;
    }


    public void verifyEmptySpendTable() {
        spends.should(CollectionCondition.empty);
    }

    private SelenideElement getRowByDescription(String description) {
        return spendRow.find(text(description));
    }

    private SelenideElement getCheckBox(String description) {
        return getRowByDescription(description).$$(cellSelector).first();
    }

}
