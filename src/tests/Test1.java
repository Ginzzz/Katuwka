package tests;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.DishwashersPage;
import pageObjects.RozetkaHome;

public class Test1 {

	WebDriver driver;
	@Before
	public void setup()
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown()
	{
		//driver.close();
	}
	
	@Test
	public void test() 
	{
		RozetkaHome onRozetkaHome = new RozetkaHome(driver);
		DishwashersPage onDishwashersPage;
		onRozetkaHome.gotoRozetkaHome();
		onDishwashersPage = onRozetkaHome.gotoDishwashers();
		assertTrue(driver.getCurrentUrl().equals("http://bt.rozetka.com.ua/dishwashers/c80123/"));
	}

}
