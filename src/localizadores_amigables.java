import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class localizadores_amigables {

	public static void main(String[] args) {
		//edge
		System.setProperty("webdriver.Edge.driver","C:\\Users\\luisb\\Documents\\java_selenium_scripts\\drivers\\edgedriver\\msedgedriver.exe ");
		WebDriver driver_edge = new EdgeDriver();
		// nos abre la paguna requerida
		driver_edge.get("https://www.google.com");
		//driver_edge.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(By.className("gb_A"))).click();
		driver_edge.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(By.className("gb_A")).toRightOf(By.className("gb_X"))).click();
		
		//chrome
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\luisb\\Documents\\java_selenium_scripts\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver_chrome = new ChromeDriver();
		driver_chrome.get("https://www.google.com");
		driver_chrome.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(By.className("gb_A")).toRightOf(By.className("gb_X"))).click();
		
		// Firefox
		System.setProperty("webdriver.Firefox.driver", "C:\\Users\\luisb\\Documents\\java_selenium_scripts\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver firefox_driver = new FirefoxDriver();
		firefox_driver.get("https://www.google.com");
		firefox_driver.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(By.className("gb_A"))).click();
	}

}
