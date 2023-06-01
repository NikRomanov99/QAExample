package ru.SeleniumTest.UI;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationFormUITest {
    private ChromeDriver driver;
    @Before
    public void prepareDriver(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\QA_Example\\SeleniumTest\\chromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testCaseRegistrationForm() throws InterruptedException {
        driver.get("https://twitter.com/explore");

        WebElement regButton = driver.findElement(By.cssSelector("#react-root > div > div > div.r-1d2f490.r-u8s1d.r-zchlnj.r-ipm5af.r-184en5c > div > div.css-1dbjc4n.r-1awozwy.r-14lw9ot.r-1gkumvb.r-1efd50x.r-5kkj8d.r-18u37iz.r-16y2uox.r-1szxp23.r-1swwhx3.r-1j3t67a.r-1qxgc49 > div > div > div.css-1dbjc4n.r-16y2uox.r-1n0xq6e > a > div"));
        regButton.click();

        Thread.sleep(1500);//пауза для прогурзки странички

        WebElement nameBox = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div/div[2]/div[2]/div/div[2]/label/div/div[2]/div/input"));
        nameBox.sendKeys("PepperoniDog69420");

        WebElement phoneBox = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div/div[2]/div[2]/div/div[3]/label/div/div[2]/div/input"));
        phoneBox.sendKeys("79154172587");

        Thread.sleep(1500);

        WebElement nextButton1 = driver.findElement(By.cssSelector("#react-root > div > div > div.css-1dbjc4n.r-13qz1uu.r-417010 > main > div > div > div > div.css-1dbjc4n.r-6koalj.r-16y2uox > div.css-1dbjc4n.r-1h3ijdo.r-136ojw6 > div > div > div > div.css-1dbjc4n.r-obd0qt.r-1pz39u2.r-1t2qqvi.r-16y2uox.r-1wbh5a2.r-1777fci.r-1joea0r.r-1vsu8ta.r-18qmn74 > div"));
        nextButton1.click();

        WebElement nextButton2 = driver.findElement(By.cssSelector("#react-root > div > div > div.css-1dbjc4n.r-13qz1uu.r-417010 > main > div > div > div > div.css-1dbjc4n.r-6koalj.r-16y2uox > div.css-1dbjc4n.r-1h3ijdo.r-136ojw6 > div > div > div > div.css-1dbjc4n.r-obd0qt.r-1pz39u2.r-1t2qqvi.r-16y2uox.r-1wbh5a2.r-1777fci.r-1joea0r.r-1vsu8ta.r-18qmn74 > div"));
        nextButton2.click();

        WebElement finaleButton = driver.findElement(By.cssSelector("#react-root > div > div > div.css-1dbjc4n.r-13qz1uu.r-417010 > main > div > div > div > div.css-1dbjc4n.r-6koalj.r-16y2uox > div.css-1dbjc4n.r-16y2uox.r-1jgb5lz.r-13qz1uu > div > div > div.css-18t94o4.css-1dbjc4n.r-urgr8i.r-42olwf.r-sdzlij.r-1phboty.r-rs99b7.r-1w2pmg.r-19h5ruw.r-1jayybb.r-17bavie.r-1ny4l3l.r-15bsvpr.r-o7ynqc.r-6416eg.r-lrvibr > div"));
        finaleButton.click();

        WebElement okButton = driver.findElement(By.cssSelector("#react-root > div > div > div.r-1d2f490.r-u8s1d.r-zchlnj.r-ipm5af.r-184en5c > div:nth-child(2) > div > div > div > div.css-1dbjc4n.r-1awozwy.r-1kihuf0.r-18u37iz.r-1pi2tsx.r-1777fci.r-1pjcn9w.r-fxte16.r-1xcajam.r-ipm5af.r-9dcw1g > div.css-1dbjc4n.r-1awozwy.r-14lw9ot.r-t23y2h.r-1jgb5lz.r-pm9dpa.r-1rnoaur.r-d9fdf6.r-1sxzll1.r-13qz1uu > div.css-1dbjc4n.r-18u37iz.r-13qz1uu > div.css-18t94o4.css-1dbjc4n.r-urgr8i.r-42olwf.r-sdzlij.r-1phboty.r-rs99b7.r-16y2uox.r-1w2pmg.r-1vuscfd.r-1dhvaqw.r-1ny4l3l.r-1fneopy.r-o7ynqc.r-6416eg.r-lrvibr > div"));
        okButton.click();

        //Дальше форму тестировать нет смысла, так как надо подтверждать номер телеофна
    }

    @After
    public void closeTest(){
        //driver.quit(); //раскоментить для закрытия Chrome после теста
    }
}
