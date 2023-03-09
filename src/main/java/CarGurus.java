import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CarGurus {

    @Test
    public void locateAnElement() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.cargurus.com/");

        driver.findElement(By.xpath("/html/body/main/div[2]/div[2]/div[1]/section/div/div/label[2]")).click();
        Assert.assertEquals("All Makes", "All Makes");

        Select dropdown = new Select(driver.findElement(By.id("carPickerUsed_makerSelect")));
        dropdown.selectByVisibleText("Lamborghini");

        Thread.sleep(5000);
        Select dropdown2 = new Select(driver.findElement(By.id("carPickerUsed_modelSelect")));
        dropdown2.selectByVisibleText("Gallardo");

        Thread.sleep(5000);

        driver.findElement(By.id("dealFinderZipUsedId_dealFinderForm")).sendKeys("22031");
        driver.findElement(By.id("dealFinderForm_0")).click();

        Thread.sleep(5000);

        driver.findElement(By.xpath("//a[@data-cg-ft='car-blade-link'][not(contains(@href, 'FEATURED'))]"));



        Thread.sleep(5000);
        Select dropdown3 = new Select(driver.findElement(By.id("sort-listing")));
        dropdown3.selectByIndex(2);


        Thread.sleep(5000);
        Select dropdown4 = new Select(driver.findElement(By.id("sort-listing")));
        dropdown4.selectByIndex(5);

        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/fieldset[5]/ul/li[1]/label/p")).click();

        Thread.sleep(5000);
        driver.findElement(By.className("vO42pn")).click();

        Thread.sleep(3000);
        driver.navigate().back();


    }

}
