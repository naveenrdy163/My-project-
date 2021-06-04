
  package MyPackage;
  
  import java.util.concurrent.TimeUnit;
  
  import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
  org.openqa.selenium.chrome.ChromeDriver;
  
  import io.cucumber.java.en.*;
  
  public class Plogin{
  
  WebDriver driver = null;
  
  @Given("browser is open") public void browser_is_open() throws
  InterruptedException {
  
  System.out.println("Inside step-browser is open");
  System.setProperty("webdriver.chrome.driver",
  "src\\test\\resources\\Browsers\\chromedriver.exe"); driver = new
  ChromeDriver();
  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
  driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
  driver.manage().window().maximize(); Thread.sleep(2000); }
  
  @And("user is on login page") public void user_is_on_login_page() {
  
  driver.navigate().to("https://dev.staidlogic.com:852/prweb/app/default/");
  
  }
  
  @When("user enters username and password") public void
  user_enters_username_and_password() throws InterruptedException {
  
  driver.findElement(By.id("txtUserID")).sendKeys("anil.kannapu@staidlogic.com"
  ); driver.findElement(By.id("txtPassword")).sendKeys("User@123");
  Thread.sleep(2000);
  
  }
  
  @And("user clicks on login") public void user_clicks_on_login() throws
  InterruptedException {
  
  driver.findElement(By.id("sub")).click(); Thread.sleep(2000);
  
  }
  
  
  @Then("user is navigated to the home page") public void
  user_is_navigated_to_the_home_page() {
  
  driver.findElement(By.id("logout")).isDisplayed();
  
  }
  
  
  
  }
 