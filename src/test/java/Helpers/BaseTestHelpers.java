package Helpers;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;

/**
 * Базовые настройки тестов
 */
abstract public class BaseTestHelpers {
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled = true;
    }

    @Before
    public void init(){
        setUp();
        String url = "https://metr-dom.ru/";
        Selenide.open(url);
    }

    @After
    public void tearDown(){
        Selenide.closeWebDriver();
    }


}
