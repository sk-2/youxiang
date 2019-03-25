package youxiang;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class login {
		WebDriver driver;
		@BeforeClass
		public void adakai() {
			System.setProperty("webdriver.chrome.driver", "./haha/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://localhost:8080/examsys/login.thtml");
		}
		@AfterClass
		  public void hafterClass() {
			driver.close();
		  }
		@Test//µÇÂ¼
		public void bdenglu() throws InterruptedException {
			driver.findElement(By.name("username")).sendKeys("hujianming");
			driver.findElement(By.name("userpass")).sendKeys("hujianming123");
			Select  a= new Select(driver.findElement(By.name("usertype")));
			a.selectByIndex(2);
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[5]/td/div/button[1]")).click();
		}
}
