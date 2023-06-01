package ru.SeleniumTest.UI;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckTitleUITest {
    private ChromeDriver driver;
    @Before
    public void prepareDriver(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\QA_Example\\SeleniumTest\\chromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("driver is ready!");
    }

    @Test
    public void checkTitle(){
        driver.get("https://eda.yandex");
        String pageTitle = driver.getTitle();
        Assert.assertTrue(pageTitle.equals("Быстрая доставка еды из ресторанов в Москве — Яндекс.Еда"));
    }

    @After
    public void closeTest(){
        //driver.quit(); //раскоментить для закрытия Chrome после теста
        // System.out.println("Chrome is close!");
    }
}
