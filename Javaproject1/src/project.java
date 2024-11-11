import org.openqa.selenium.By;
	import org.openqa.selenium.firefox.FirefoxDriver;
public class project {
	
	{

		public void main(String[] args) {
			FirefoxDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			driver.findElement(By.id("APjFqb")).sendKeys("Hello bhai");
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"));

		}

	}
}
