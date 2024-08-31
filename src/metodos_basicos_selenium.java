import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class metodos_basicos_selenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\luisb\\Documents\\java_selenium_scripts\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver_chrome = new ChromeDriver();
		//método basico 1, get = nos abre la pagina requerida  
		driver_chrome.get("https://www.google.com");
		// método básico 2, getTitle() = nos trae el titulo de la página actual
		System.out.println(driver_chrome.getTitle());
		//meetodo basico 3,getCurrentUrl() = muestra la dirección actual de la página
		System.out.println(driver_chrome.getCurrentUrl());
		//método básico 4, close() = cierra el navegador.
		driver_chrome.close();
		// método básico 5, quit() = termina la sesión del navegador
		 driver_chrome.quit();
		
		System.setProperty("webdriver.Edge.driver","C:\\Users\\luisb\\Documents\\java_selenium_scripts\\drivers\\edgedriver\\msedgedriver.exe ");
	   	WebDriver driver_edge = new EdgeDriver();
		driver_edge.get("https://www.google.com");
		System.out.println(driver_edge.getTitle());
		System.out.println(driver_edge.getCurrentUrl());
		driver_edge.close();
		driver_edge.quit();
		
		System.setProperty("webdriver.Firefox.driver", "C:\\Users\\luisb\\Documents\\java_selenium_scripts\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver firefox_driver = new FirefoxDriver();
		firefox_driver.get("https://www.google.com");
		System.out.println(firefox_driver.getTitle());
		System.out.println(firefox_driver.getCurrentUrl());
		firefox_driver.close();
		firefox_driver.quit();
		
	}

}
