package Pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

/**
 * Страница Акции
 */
public class StocksPage {
    private final SelenideElement stocksPageUrl = $x("//*[@id=\"top_menu\"]/center/nav/ul/li[6]");

    /**
     * Нажать на вкладку Акции
     */
    public void clickOnStocks(){
        stocksPageUrl.click();
    }
}

