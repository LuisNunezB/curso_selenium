import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Localizadores_tradicionales {

	public static void main(String[] args) {
		//edge
		System.setProperty("webdriver.Edge.driver","C:\\Users\\luisb\\Documents\\java_selenium_scripts\\drivers\\edgedriver\\msedgedriver.exe ");
		WebDriver driver_edge = new EdgeDriver();
		// nos abre la paguna requerida
		driver_edge.get("https://www.google.com");
		// Encontrado elemento por id
		driver_edge.findElement(By.id("APjFqb"));
		// encontrar elemento por className
		driver_edge.findElement(By.className("gNO89b"));
		//encontrar  elemento por Name
		driver_edge.findElement(By.name("btnI"));
		// encontrar elemento por linkText
		driver_edge.findElement(By.linkText("Sobre Google"));
		// encontrar elemento por linkText parcial
		driver_edge.findElement(By.partialLinkText("Sobre"));
		// encontrar elemento por xpath
		driver_edge.findElement(By.xpath("/html/body/div[1]/div[6]/div[2]/div[2]/a[2]"));
		// cerrar navegador y cerrar sesion
		driver_edge.quit();
		
		//firefox
		System.setProperty("webdriver.Firefox.driver", "C:\\Users\\luisb\\Documents\\java_selenium_scripts\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver firefox_driver = new FirefoxDriver();
		firefox_driver.get("https://www.google.com");
		firefox_driver.findElement(By.id("APjFqb"));
		firefox_driver.findElement(By.className("gNO89b"));
		firefox_driver.findElement(By.name("btnI"));
		firefox_driver.findElement(By.linkText("Sobre Google"));
		firefox_driver.findElement(By.partialLinkText("Sobre"));
		firefox_driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[2]/div[2]/a[2]"));
		firefox_driver.quit();
		
		//Chrome
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\luisb\\Documents\\java_selenium_scripts\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver_chrome = new ChromeDriver();
		driver_chrome.get("https://www.google.com");
		driver_chrome.findElement(By.id("APjFqb"));
		driver_chrome.findElement(By.className("gNO89b"));
		driver_chrome.findElement(By.name("btnI"));
		driver_chrome.findElement(By.linkText("Sobre Google"));
		driver_chrome.findElement(By.partialLinkText("Sobre"));
		driver_chrome.findElement(By.xpath("/html/body/div[1]/div[6]/div[2]/div[2]/a[2]"));
		driver_chrome.quit();
		
		
		
		
		
	

	}

}
