import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.List;

public class finaltest {
    WebDriver driver;
    @BeforeMethod
    public void Start(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void testOne() {
        //registration code
        driver.get("http://tutorialsninja.com/demo/");
        WebElement acc = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a"));
        acc.click();

        WebDriverWait waiting = new WebDriverWait(driver, 10);
        waiting.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul")));

        WebElement regButton = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a"));
        regButton.click();

        WebElement saxeli = driver.findElement(By.id("input-firstname"));
        saxeli.sendKeys("tato");

        WebElement gvari = driver.findElement(By.id("input-lastname"));
        gvari.sendKeys("jixvashvili");

        WebElement mail = driver.findElement(By.id("input-email"));
        mail.sendKeys("tatsnnn@gmail.com");

        WebElement nomeri = driver.findElement(By.id("input-telephone"));
        nomeri.sendKeys("579134049");

        WebElement paroli = driver.findElement(By.id("input-password"));
        paroli.sendKeys("paroli");

        WebElement confirm = driver.findElement(By.id("input-confirm"));
        confirm.sendKeys("paroli");
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        JavascriptExecutor js = (JavascriptExecutor)driver;

        WebElement clickSubscribe = driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input"));
        js.executeScript("arguments[0].click();", clickSubscribe);

        WebElement privacyPolicy = driver.findElement(By.xpath("//a[@href=\"http://tutorialsninja.com/demo/index.php?route=information/information/agree&information_id=3\"]//following::input[@type=\"checkbox\"]"));
        js.executeScript("arguments[0].click();", privacyPolicy);

        WebElement contButton = driver.findElement(By.xpath("//*[@class=\"btn btn-primary\"]"));
        js.executeScript("arguments[0].click();", contButton);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[6]")).click();
        WebElement hovertext = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[3]/div/div[1]/a/img"));
        Actions build = new Actions(driver);
        build.moveToElement(hovertext);
        if(hovertext.getAttribute("title").equals("Palm Treo Pro")){
            System.out.println("is visible");
        }
        else{
            System.out.println("not visible");
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[3]/div/div[2]/div[1]/h4/a")).click();
        WebElement raodenoba = driver.findElement(By.xpath("//input[@id=\"input-quantity\"]"));
        int numberofphone = Integer.parseInt(raodenoba.getAttribute("value"));

        WebElement checkPhoto = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/ul[1]"));
        List<WebElement> number = checkPhoto.findElements(By.tagName("li"));
        System.out.println(number.size());

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/ul[1]/li[1]/a/img")).click();
        WebDriverWait waiting1 = new WebDriverWait(driver,10);

        waiting1.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("/html/body/div[2]/div/button[2]"))));
        for(int i = 1; i < number.size(); i++){
            driver.findElement(By.xpath("/html/body/div[2]/div/button[2]")).click();
        }

        WebElement photosNum = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/figure/figcaption/div/div[2]"));
        waiting1.until(ExpectedConditions.visibilityOf(photosNum));
        System.out.println(photosNum.getText());
        driver.findElement(By.className("mfp-close")).click();

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div[3]/p/a[2]")).click();

        WebElement reviewname = driver.findElement(By.xpath("//*[@id=\"input-name\"]");
        reviewname.sendKeys("tato");

        WebElement myreview = driver.findElement(By.xpath("//*[@id=\"input-review\"]"));
        myreview.sendKeys("chemi azrit momewona kai iyo");

        driver.findElement(By.xpath("//*[@id=\"form-review\"]/div[4]/div/input[5]")).click();

        driver.findElement(By.xpath("//*[@id=\"button-review\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[2]/div/a")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div[3]/div/div[2]/div[1]/h4/a")).click();
        driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
        





    }
}
