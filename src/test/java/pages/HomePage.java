package pages;

import lombok.Data;
import testUI.Utils.By;
import testUI.elements.UIElement;

import static testUI.elements.TestUI.E;

@Data
public class HomePage {
    public UIElement cookiesAccept = E(By.byXpath("//button/div[contains(text(), \"Accept all\")]"));
}
