package Pages;

import com.codeborne.selenide.ElementsCollection;
import static com.codeborne.selenide.Selenide.$$x;

/**
 * Главная страница сайта
 */
public class MainPage {
    private final ElementsCollection countCart = $$x("//*[@id=\"BasketWindow\"]");

    /**
     * Количество товаров на указателе корзины в верхней панели меню
     * @return элемент, содержащий строку с количеством товаров
     */
    public String countOfProductsToTheCart(){
        return String.valueOf(countCart.first());
    }

}
