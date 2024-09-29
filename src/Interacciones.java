import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Interacciones {

	public static void main(String[] args) {
		System.setProperty("webdriver.Edge.driver","C:\\Users\\luisb\\Documents\\java_selenium_scripts\\drivers\\edgedriver\\msedgedriver.exe ");
		WebDriver driver_edge = new EdgeDriver();
		driver_edge.get("https://www.amazon.com");
		//send kevys
		driver_edge.findElement(By.id("twotabsearchtextbox")).sendKeys("Nintendo switch");
		//crear
		driver_edge.findElement(By.id("twotabsearchtextbox")).clear();
		driver_edge.findElement(By.id("nav-hamburger-menu")).click();
	}

}
