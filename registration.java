import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/Facebook-Project/");
		driver.findElement(By.id("firstname")).sendKeys("Adarsh");
		driver.findElement(By.id("surname")).sendKeys("Kunwar");
		driver.findElement(By.id("phone_email")).sendKeys("adarsh.infinite@gmail.com");
		driver.findElement(By.id("newpassword")).sendKeys("adarsh1234");
		driver.findElement(By.id("birthday")).sendKeys("19");
		driver.findElement(By.id("birthmonth")).sendKeys("SEP");
		driver.findElement(By.id("birthyear")).sendKeys("1999");
		driver.findElement(By.id("gender_male")).click();
		driver.findElement(By.id("signup")).click();
	}

}
