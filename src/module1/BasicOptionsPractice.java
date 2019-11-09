package module1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class BasicOptionsPractice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\Installations\\Drivers\\chromedriver.exe");
				
WebDriver driver = new ChromeDriver();
driver.get("https://seleniumautomationpractice.blogspot.com");
driver.manage().window().maximize();
String s3 = driver.getWindowHandle();
String s1= driver.getTitle();
System.out.println(s1);
/*if (s1 == 'Selenium Automation Practice')
	System.out.println("PASS");*/
driver.navigate().to("https://www.google.co.in/");
//driver.sleep(5000);
driver.navigate().back();

WebDriver driver1 = new ChromeDriver();
driver1.get("https://www.google.co.in/");
String s2= driver1.getTitle();
System.out.println(s2);

driver.switchTo().window("s3");


	}

}
