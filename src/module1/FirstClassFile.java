package module1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClassFile {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
 
			System.setProperty("webdriver.chrome.driver", "G:\\Installations\\Drivers\\chromedriver.exe");
			
			System.out.println("Hello WORLD");
			System.out.println("Hello WORLD2");
			System.out.println("Hello WORLD3");
			System.out.println("Hello WORLD4");
			System.out.println("Hello WORLD5");
			
 WebDriver driver = new ChromeDriver();
 driver.get("https://www.google.co.in/");
 driver.manage().window().maximize();
 String s1= driver.getTitle();
 System.out.println(s1);
 //Sleep(5000);
 
 	}

}
