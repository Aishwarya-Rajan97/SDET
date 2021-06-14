package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import Xpaths.Commonpaths;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinition01 {

	public WebDriver driver;
	
	Commonpaths objcom= new Commonpaths();
	
	@Given("User is on the main page")
	public void user_is_on_the_main_page() throws Throwable{
		System.setProperty("webdriver.gecko.driver",
                "C:\\Users\\AishwaryaR\\Downloads\\selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(objcom.URL);
		}
	
	
	@When("^User gives all mandatory fields \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_gives_all_mandatory_fields(String FirstName, String LastName, String Email, String UserName, String Password) {
		driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div[2]/div/div/div/ul/li[1]/a")).click();
		driver.findElement(By.xpath(objcom.FirstName)).sendKeys(FirstName);
		driver.findElement(By.xpath(objcom.LastName)).sendKeys(LastName);
		driver.findElement(By.xpath(objcom.Email)).sendKeys(Email);
		driver.findElement(By.xpath(objcom.UserName)).sendKeys(UserName);
		driver.findElement(By.xpath(objcom.Password)).sendKeys(Password);
		driver.findElement(By.xpath(objcom.ConfirmPassword)).sendKeys(Password);
		
	}

	@And("^click the next button$")
	public void click_the_next_button()  {
		driver.findElement(By.xpath(objcom.SubmitButton)).click();
	   
	}

	@Then("^The next page with the message has to be dispalyed$")
	public void the_next_page_with_the_message_has_to_be_dispalyed()  {
//		String Expectedheader = "Dear Aishwarya Rajan,Your personal settings have been registered.";
//		WebElement Header=(WebElement) driver.findElements(By.xpath(objcom.Message_on_screen));
//		String Headerstr=Header.getText();
//		if(Expectedheader.equalsIgnoreCase(Headerstr))
//          	System.out.println("The expected heading is same as actual heading --- "+Headerstr);
//    	else
//          	System.out.println("The expected heading doesn't match the actual heading --- "+Headerstr);
//	    
	}
	
	@When("^User clicks on the dropdown menu and verify email$")
	public void user_clicks_on_the_dropdown_menu_and_verify_email() throws InterruptedException  {
		Thread.sleep(500);
		driver.findElement(By.xpath(objcom.Dropdown)).click();
		String mail_id=driver.findElement(By.xpath(objcom.Email_verification)).getText();
		if(mail_id.equalsIgnoreCase("rajanaishwarya97@gmail.com"))
			System.out.println("The mail id has matched");
		else
			System.out.println("The mail id has not matched");
		
	}


	@When("^User clicks on maincourse and compose mail$")
	public void user_clicks_on_maincourse_and_compose_mail() throws InterruptedException {
		driver.findElement(By.xpath(objcom.Mycourses)).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(objcom.Compose_button)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(objcom.Sent_to)).sendKeys("Virat kohli");
		Thread.sleep(500);
		driver.findElement(By.xpath(objcom.body)).sendKeys("Hi This is Aishwarya");
		
	}

	@Then("^The success message is captured$")
	public void the_success_message_is_captured() {
   
	}

	@Then("^Click on logout$")
	public void click_on_logout() {
		driver.findElement(By.xpath(objcom.Dropdown)).click();
		driver.findElement(By.xpath(objcom.Logout)).click();
   
	}
	
	
}
	

