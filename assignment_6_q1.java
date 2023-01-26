import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_6_q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		 * 
		 * 
		 * Try to use contains , xpath axes, text functions
		 * 
		 * Write a minimum 3 XPath and 3 CSS Selector for the username
		 * 
		 * Write a minimum 3 XPath and 3 CSS Selector for the password
		 * 
		 * Write a minimum 3 XPath and 3 CSS Selector for the login button
		 */

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		/*
		 * //Xpath for UserName ::
		 * 
		 * 1. //input[@placeholder ='Username'] 2. //input[@name ='username'] 3.
		 * //div/input[@name='username']
		 */

		// CSS for username
		/*
		 * 1. input[placeholder ='Username'] 2. input[name ='username'] 3. div
		 * input[name='username']
		 */

		// XPath for password
		/*
		 * 1///input[@name='password'] 2.//input[@type='password']
		 * 3.//input[@placeholder='Password']
		 */

		// CSS for Password

		/*
		 * 1 input[name='password'] 2 input[type='password'] 3
		 * input[placeholder='Password']
		 */

		// xpath for button
		/*
		 * 1. //button[@type='submit'] 2.//button[contains(@class,'login')]
		 * 3.//div/button
		 */

		// css for button

		/*
		 * 1. button[type='submit'] 2.button[class*='login'] 3. div button
		 */

	}

}
