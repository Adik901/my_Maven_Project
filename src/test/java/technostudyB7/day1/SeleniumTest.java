package technostudyB7.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {

        //1- browser driver set up -> установлен драйвер браузера
        WebDriverManager.chromedriver().setup();
//2- create object of ChromeDriver to open the browser -> создать объект ChromeDriver, чтобы открыть браузер
        WebDriver driver = new ChromeDriver();

//3- go to google page
        driver.get("https://www.google.com");
        System.out.println("title of google.com =" + driver.getTitle());
        System.out.println("url of google.com = " + driver.getCurrentUrl());
        driver.navigate().to("https://www.techno.study");

        String exspectedTitle = "Join the best coding bootcamp onLine and cet IT training In the US"; // -> Присоединяйтесь к лучшему онлайн-курсу по программированию и пройдите обучение по ИТ в США
        String actualTitle = driver.getTitle();

        if (exspectedTitle.equals(actualTitle)) {
            System.out.println("verification is done: PASS'");  // -> проверка сделана: PASS
            System.out.println("actualTitle = " + actualTitle);
        } else
            System.out.println("verification is FAlTED'");  // -> проверка Не СОВЕРШЕНА
        System.out.println("actualTitle = " + actualTitle);
    }
}
