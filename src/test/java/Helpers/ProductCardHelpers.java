package Helpers;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

/**
 * Вспомогательные методы для карточки продукта
 */
public class ProductCardHelpers {

    private final SelenideElement buyButton = $x("//*[@class=\"catalogue_item_action\"]/div[4]/button[3]");

    /**
     * Нажать на кнопку Купить
     */
    public void clickOnTheBuyButton(){
        buyButton.click();
    }
}
