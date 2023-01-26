import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class assignment_6_task3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		// driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[contains(.,'Admin')]")).click();
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']")).click();

		driver.findElement(By.cssSelector(
				"div[class='oxd-input-group oxd-input-field-bottom-space'] div input[class='oxd-input oxd-input--active']"))
				.sendKeys("kritika");
		driver.findElement(By.xpath("//div[@class='oxd-select-text-input'][1]")).click();
		driver.findElement(By.xpath("//div[@role='option'][2]")).click();

		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("A");
		List<WebElement> l = driver.findElements(By.xpath("//div[@role='listbox']//span"));

		System.out.println(l.size());

		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i).getText());
			if (l.get(i).getText().contains("Linda Jane Anderson")) {
				l.get(i).click();
				break;
			}

		}
		driver.findElement(By
				.cssSelector("div[class='oxd-select-text oxd-select-text--active'] div[class='oxd-select-text-input']"))
				.click();
		driver.findElement(By.xpath("//div[@role='option'][2]")).click();

		driver.findElement(By.xpath(
				"//label[@class='oxd-label oxd-input-field-required'][.='Status']//following::div[@class='oxd-select-text-input']"))
				.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@role='option'][2]"))));

		driver.findElement(By.xpath("//div[@role='option'][2]")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@1234t");
		driver.findElement(By.xpath("//label[text()='Confirm Password']//following::input[@type='password']"))
				.sendKeys("Test@1234t");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// search user
		driver.findElement(By.xpath("//h5[text()='System Users']//following::input[1]")).sendKeys("kritika");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(2000);

		// delete the user

		driver.findElement(By.xpath("//div[@role='cell'][1]")).click();

		driver.findElement(By.xpath("//button[normalize-space()='Delete Selected']")).click();

		driver.findElement(By.xpath("//button[normalize-space()='Yes, Delete']")).click();
	}

}
