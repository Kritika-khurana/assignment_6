import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class assignment_6_q2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/*
		 * https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		 * admin/admin123
		 * 
		 * Write dynamic xpath which should match all below elements
		 */

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		List<WebElement> list = driver.findElements(By.xpath("//nav[@aria-label='Sidepanel']//ul/li"));
		// System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getText().equalsIgnoreCase("Admin")) {

				list.get(i).click();
				break;
			}

		}
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("A");
		List<WebElement> l = driver.findElements(By.xpath("//div[@role='listbox']//span"));

		System.out.println(l.size());

		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i).getText());
		}

	}

}
