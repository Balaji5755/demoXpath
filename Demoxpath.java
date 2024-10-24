package demoXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome113\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		
		d.get("https://www.facebook.com/");
		
		d.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("balajiyadhev@gmail.com");
		d.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Sunny");
		d.findElement(By.xpath("//*[@id=\"u_0_5_E/\"]")).click();
		
		
		d.findElement(By.xpath("//a[@data-testid='royal_login_button]")).click();
		d.close();
		
		
		

	}

}
