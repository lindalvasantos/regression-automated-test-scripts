package scripts;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import pages.HomePage;
import utils.DriversPaths;
import utils.ScreenShotsPaths;
import utils.TimeOutForExecution;
import utils.WindowSizeDimensions;


public class HomePageLoadTest {
	
	private WebDriver driver;
	HomePage object_home_page;

	@SuppressWarnings("deprecation")
	@Before
	public void setUp() {
		System.setProperty(DriversPaths.CHROME_DRIVER_SPEC, DriversPaths.DRIVERS_PATH + DriversPaths.CHROME_DRIVER_EXECUTABLE);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(TimeOutForExecution.TIME_OUT, TimeUnit.SECONDS);
		driver.manage().window().setSize(new Dimension(WindowSizeDimensions.WINDOW_WIDTH, WindowSizeDimensions.WINDOW_HEIGHT));
	}
	
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	
	@Test
	public void verifySignInPageLoadedCorrectly() {
		// map pages | create pages' objects
		HomePage object_home_page = new HomePage(driver);
		
		// preconditions (GIVEN)
		object_home_page.openHomePage();		
		
		//test steps | special case
		// validation | special case
		object_home_page.verifyPageLoaded();
		
		// evidence | screenshot
		TakesScreenshot screenshot1 = (TakesScreenshot) driver;
		try {
			FileHandler.copy(screenshot1.getScreenshotAs(OutputType.FILE), new File(
					ScreenShotsPaths.SCREENSHOTS_PATH  + "Scenario_HomePageLoadTest_verifyPageLoadedCorrectly_evidence1.png"));
		} catch (WebDriverException e) {

		} catch (IOException e) {

		}
	}
	

	@Test
	public void verifySignInPageUrlMatches() {
		// map pages | create pages' objects
		HomePage object_home_page = new HomePage(driver);
		
		// preconditions (GIVEN)
		object_home_page.openHomePage();	

		//test steps | special case
		// validation | special case
		object_home_page.verifyPageUrl();
		
		// evidence | screenshot
		TakesScreenshot screenshot1 = (TakesScreenshot) driver;
		try {
			FileHandler.copy(screenshot1.getScreenshotAs(OutputType.FILE), new File(
					ScreenShotsPaths.SCREENSHOTS_PATH + "Scenario_HomePageLoadTest_verifyHomePageUrlMatches_evidence1.png"));
		} catch (WebDriverException e) {

		} catch (IOException e) {

		}			
	}		

}
