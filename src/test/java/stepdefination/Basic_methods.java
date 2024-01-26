package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Basic_methods 
{
	public static WebDriver driver;
	@Given("launch app")
	public void launch_app() 
	{
		System.setProperty("webdriver.chrome.driver","E:\\sdet+\\SEED COURSE\\selenium automation testing\\automation program revision\\cucumber_to_login_with_multiple_user\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@When("user enter username {string} and password {string}")
	public void user_enter_username_and_password(String string, String string2) throws InterruptedException 
	{
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys(string);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(string2);
		driver.findElement(By.xpath("//button")).click();
	}

	@Then("login in successfully")
	public void login_in_successfully() 
	{
		System.out.println("logged in with home page visiblity");
		

	}

}
