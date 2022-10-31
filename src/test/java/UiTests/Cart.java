package UiTests;

import Helpers.BaseTestHelpers;
import Helpers.ProductCardHelpers;
import Pages.MainPage;
import Pages.StocksPage;
import org.junit.Assert;
import org.junit.Test;

public class Cart extends BaseTestHelpers {
    StocksPage stocksPage = new StocksPage();
    ProductCardHelpers productCard = new ProductCardHelpers();
    MainPage mainPage = new MainPage();

    /**
     * Проверка корректного отображения количества товаров, добаленных в корзину
     */
    @Test
    public void cart_AddingAnItemToTheCart(){
        stocksPage.clickOnStocks();
        productCard.clickOnTheBuyButton();
        mainPage.countOfProductsToTheCart();
        Assert.assertTrue(mainPage.countOfProductsToTheCart().contains("Товаров: 1"));
    }
}
