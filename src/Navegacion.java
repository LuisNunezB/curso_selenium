import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navegacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Edge.driver","C:\\Users\\luisb\\Documents\\java_selenium_scripts\\drivers\\edgedriver\\msedgedriver.exe ");
	   	WebDriver driver_edge = new EdgeDriver();
		driver_edge.get("https://www.amazon.com");
		// Ir a
		driver_edge.navigate().to("https://www.google.com");
		//Regresa a
		driver_edge.navigate().back();
		// adelante a
		driver_edge.navigate().forward();
		// actualizar
		driver_edge.navigate().refresh();
		
	}

}
