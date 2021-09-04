package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sample {
    @Test
	public void f()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://ksrtc.in/oprs-web/login/show.do");
		w.findElement(By.id("userName")).sendKeys("harshithgowda2301@gmail.com");
		w.findElement(By.id("password")).sendKeys("Harsha@2301");
		w.findElement(By.id("submitBtn")).click();
		w.close();
	}
}
