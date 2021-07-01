import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class StepImplementation extends BaseTest {



    @Step("<key> css li elemente tıkla")
    public void clickToElementForCss(String key){
        driver.findElement(By.cssSelector(key)).click();
    }

    @Step("2 sn kadar bekle")
    public void waitForSecond() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Step("<key> Css li elemente <text> değerini yaz")
    public void SendKeysToUsername(String key,String text){
        driver.findElement(By.cssSelector(key)).sendKeys(text);
    }

    @Step("<keyword> Cssli elemente <text> değerini yaz")
    public void SendkeysToPassword(String keyword,String text){
        driver.findElement(By.cssSelector(keyword)).sendKeys(text);
    }

    @Step("<key> css li element butonuna tıkla")
    public void clickToLoginButton(String key){
        driver.findElement(By.cssSelector(key)).click();
    }

    @Step("<key> id li elemente <text> değerini gir")
    public void searchBox(String key, String text){
        driver.findElement(By.id(key)).sendKeys(text);
    }

    @Step("<key> css li elementi aramak için tıkla")
    public void searchBoxToClick(String key){
        driver.findElement(By.cssSelector(key)).click();
    }
    @Step("<key> css li element ürününe tıkla")
    public void phones(String key){
        driver.findElement(By.cssSelector(key)).click();
    }
    @Step("<key> css li ürün sayfasını kontrol et")
    public void productListControl(String key){
        Assert.assertNotNull(By.cssSelector(key));
    }
    @Step("<key> css li telefona tıkla")
    public void phone(String key){
        driver.findElement(By.cssSelector(key)).click();
    }
    @Step("<key> css li elementi sepete ekle")
    public void basketToProduct(String key){
        pageScrollDown(200);
        driver.findElement(By.cssSelector(key)).click();
    }
    @Step("<key> css li elemente tıkla oturumu kapat")
    public void singOut(String key){
        driver.findElement(By.cssSelector(key)).click();;
    }
}
