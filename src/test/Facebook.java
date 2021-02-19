package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/home/sanjanacstecnot/Downloads/chromedriver");
		
		System.setProperty("webdriver.gecko.driver","/home/sanjanacstecnot/Downloads/geckodriver");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		
//		WebElement email = driver.findElement(By.xpath("//input[@id='email'] "));
//		
//		email.sendKeys("abc@xyz.com");
//		
//		WebElement Pwd = driver.findElement(By.xpath("//input[@name='pass'] "));
//		Pwd.sendKeys("124");
//		
//		WebElement btn= driver.findElement(By.xpath("//button[@name='login']"));
//		
//		btn.click();
		
		
		
		
		WebElement signup= driver.findElement(By.xpath("//*[contains(text(),'Create New Account')]"));
		signup.click();
	
		WebElement fn = driver.findElement(By.xpath("//*[@name='firstname']"));
		
		fn.sendKeys("sanjana");
		
		WebElement ln = driver.findElement(By.xpath("//*[@name='lastname']"));
		
		ln.sendKeys(" C S");
		
		WebElement phno = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		phno.sendKeys("7019932954");
		
		WebElement newpwd = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		newpwd.sendKeys("12345");
		
		
		WebElement month = driver.findElement(By.xpath("//*[@name='birthday_month']"));
        
        Select ddmonth = new Select(month);
        
        ddmonth.selectByIndex(9);
        
//        ddmonth.selectByValue("2");
//        
//        ddmonth.selectByVisibleText("Feb");
        
        WebElement day = driver.findElement(By.xpath("//*[@name='birthday_day']"));
        
        Select curday = new Select(day);
        
        curday.selectByValue("2");
		
        WebElement year = driver.findElement(By.xpath("//*[@name='birthday_year']"));
        
        Select curyear = new Select(year);
        
        curyear.selectByValue("1998");
        
        WebElement gender = driver.findElement(By.xpath("//*[text()= 'Male']"));
        gender.click();
        
        WebElement submit= driver.findElement(By.xpath("//button[@name='websubmit']"));

        submit.click();		
		
		
		
		
		
		
		
		
	}

}
