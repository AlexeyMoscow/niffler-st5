package guru.qa.niffler.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class WelcomePage {
    private final SelenideElement buttonsBlock = $(".main__links");
    private final SelenideElement loginButton = buttonsBlock.$(byText("Login"));
    private final SelenideElement newUserRegisterButton = buttonsBlock.$(byText("Register"));

    public void clickLoginButton() {
        loginButton.click();
    }

    public void clickNewUserRegisterButton() {
        newUserRegisterButton.click();
    }

}
