package guru.qa.niffler.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private static SelenideElement loginInput = $(By.xpath("//input[@name='username']"));
    private static SelenideElement passwordInput = $(By.xpath("//input[@name='password']"));
    private static SelenideElement sighInButton = $(By.xpath("//button[@type='submit']"));

    private LoginPage setUserName(String username) {
        loginInput.setValue(username);
        return this;
    }

    private LoginPage setPassword(String password) {
        passwordInput.setValue(password);
        return this;
    }

    private void clickSignInButton() {
        sighInButton.shouldBe(visible, enabled).click();
    }

    public void signInUser(String login, String password) {
        this.setUserName(login)
                .setPassword(password)
                .clickSignInButton();
    }
}
