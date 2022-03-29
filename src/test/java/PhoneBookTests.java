import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.List;

public class PhoneBookTests {

    WebDriver wd;

    @BeforeMethod
    public void openSite(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");



    }

    @Test
    public void phoneBookStart(){
      WebElement element = wd.findElement(By.tagName("a"));
      wd.findElements(By.cssSelector("a"));
      wd.findElement(By.xpath("//a"));
      element.click();
      element.clear();
      element.sendKeys();



         List<WebElement> list = wd.findElements(By.tagName("a"));
         WebElement elId = wd.findElement(By.id("root"));
         wd.findElements(By.cssSelector("#root"));
         wd.findElements(By.xpath("//*[@id='root']"));

         WebElement elClass = wd.findElement(By.className("container"));

         wd.findElements(By.cssSelector(".container"));
         WebElement elName = wd.findElement(By.name("nameEx"));
         wd.findElements(By.cssSelector("[name='nameEx']"));
         wd.findElements(By.xpath("//*[@name = 'nameEx']"));
         wd.findElements(By.xpath("//*[class=çontainer']"));

         WebElement eLink = wd.findElement(By.linkText("HOME"));
         WebElement elPLink = wd.findElement(By.partialLinkText("HOM"));
         wd.findElements(By.cssSelector("[href='/home']"));
         wd.findElements(By.xpath("//*[@href = '/home']"));

         wd.findElements(By.cssSelector("  a[href='/home']"));
         wd.findElements(By.xpath("//a[@href = '/home']"));


    }
    @Test
    public void fillFormLogin (){

        List <WebElement> list = wd.findElements(By.tagName("input"));
        WebElement inputEmail = list.get(0);
        WebElement inputPassword = list.get(1);
        inputEmail.click();
        inputEmail.clear();
        inputEmail.sendKeys("noa@gmail.com");
        inputPassword.click();
        inputPassword.clear();
        inputPassword.sendKeys("Nnoa12345$");

        WebElement buttonLogin = wd.findElement(By.tagName("button"));
        buttonLogin.click();

        //ASSER : Ex (present "sign out"= As ("sign out")


    }
    @Test
    public void tableTest(){
        //find table
        wd.findElement(By.cssSelector("table"));
        wd.findElement(By.xpath("//table"));

        //tr9 - one element
        wd.findElement(By.cssSelector("tr:last-child"));
        wd.findElement(By.xpath("//tr[last()]"));

        //Maria Anders - one element
        wd.findElement(By.cssSelector("tr:nth-child(2) td:nth-child(2)"));
        wd.findElement(By.xpath("//tr[2]//td[2]"));
        wd.findElement(By.xpath("//*[text()='Maria Anders']"));

        //last colum - all elements
        wd.findElements(By.cssSelector("td:last-child"));
        wd.findElement(By.xpath("//td[last()]"));
        //th - elements
        wd.findElements(By.cssSelector("th"));
        wd.findElement(By.xpath("//th"));

        wd.findElement(By.cssSelector("tr:nth-child(4)"));
        wd.findElement(By.xpath("//tr[4]"));

        wd.findElement(By.cssSelector("tr:last-child td:nth-child(2)"));
        wd.findElement(By.xpath("//tr[last()]/td[2]"));

        wd.findElements(By.cssSelector("td:first-child"));
        wd.findElement(By.xpath("//td[1]"));
    }



    @Test
    public void fillRegistrationTest(){
        List<WebElement> list = wd.findElements(By.tagName("input"));
        WebElement inputEmail = list.get(0);
        WebElement inputPassword = list.get(1);


        inputEmail.click();
        inputEmail.clear();
        inputEmail.sendKeys("7upb221@gmai.com");
        inputPassword.click();
        inputPassword.clear();
        inputPassword.sendKeys("Zz12345$");

        List<WebElement> buttons = wd.findElements(By.tagName("button"));
        WebElement buttonRegistretion = buttons.get(1);
        buttonRegistretion.click();



    }

    @Test
    public void loginCss(){
        //wd.findElement(By.cssSelector("a[href='/login']"));
        wd.findElement(By.cssSelector(".login_login__3EHKB input[placeholder$='Email']"));

        wd.findElement(By.cssSelector("[placeholder='Email']"));
        //open login form

        //fiil email
        
        //fill password
        //confirm registration -  click registration login button





    }

    private void click() {
        wd.findElement(By.cssSelector("[href= '/login']")).click();
    }




    public void loginXpath(){

    }
    @AfterMethod
    public void close(){
        //wd.quit();///all tabs
        //wd.close();///focus wd
    }
}

