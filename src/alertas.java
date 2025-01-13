
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class alertas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//driver_edge.get("file:///C:/Users/luisb/Documents/java_selenium_scripts/alert.html");
		System.setProperty("webdriver.Edge.driver","C:\\Users\\luisb\\Documents\\java_selenium_scripts\\drivers\\edgedriver\\msedgedriver.exe ");
		WebDriver driver_edge = new EdgeDriver();
		driver_edge.get("file:///C:/Users/luisb/Documents/java_selenium_scripts/alert.html");
		
		//alerta1
		driver_edge.findElement(By.xpath("/html/body/button[1]")).click();
		Wait<WebDriver> wait = new WebDriverWait(driver_edge,Duration.ofSeconds(5));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		String text = alert.getText();
		alert.accept();
		System.out.println(text);
		
		//alerta tipo confirmar
		driver_edge.findElement(By.xpath("/html/body/button[2]")).click();
		Wait<WebDriver> wait2 = new WebDriverWait(driver_edge,Duration.ofSeconds(5));
		wait2.until(ExpectedConditions.alertIsPresent());
		Alert alert2 = driver_edge.switchTo().alert();
		String text2 = alert2.getText();
		alert2.dismiss();
		System.out.println(text2);
		
		//prompt aceptar
		driver_edge.findElement(By.xpath("/html/body/button[3]")).click();
		Wait<WebDriver> wait3 = new WebDriverWait(driver_edge,Duration.ofSeconds(5));
		Alert alert3 = wait.until(ExpectedConditions.alertIsPresent());
		alert3.sendKeys("Curso de programación selenium");
		alert3.accept();
		
		//prompt cancelar
		driver_edge.findElement(By.xpath("/html/body/button[3]")).click();
		Wait<WebDriver> wait4 = new WebDriverWait(driver_edge,Duration.ofSeconds(5));
		Alert alert4 = wait.until(ExpectedConditions.alertIsPresent());
		alert4.sendKeys("Curso de programación selenium");
		alert4.dismiss();
		
		System.out.println("Hola kevin");
		
	}

}
