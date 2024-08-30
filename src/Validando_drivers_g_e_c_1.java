import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Validando_drivers_g_e_c_1 {

	public static void main(String[] args) {
		// Validando chrome driver
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\luisb\\Documents\\java_selenium_scripts\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver_chrome = new ChromeDriver();
		driver_chrome.get("https://www.google.com");

		//Validando edge_driver
		System.setProperty("webdriver.Edge.driver","C:\\Users\\luisb\\Documents\\java_selenium_scripts\\drivers\\edgedriver\\msedgedriver.exe ");
		WebDriver driver_edge = new EdgeDriver();
		driver_edge.get("https://www.google.com");
		
		//Validando driver FF
		System.setProperty("webdriver.Firefox.driver", "C:\\Users\\luisb\\Documents\\java_selenium_scripts\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver firefox_driver = new FirefoxDriver();
		firefox_driver.get("https://www.google.com");
	}
}


