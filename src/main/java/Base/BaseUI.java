package Base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseUI {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public void invokeBrowser(String BrowserName) {
		
		if (BrowserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if (BrowserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		if (prop==null) {
			
			prop = new Properties();
			try {
				FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\ObjectRepository\\congig.properties");
				prop.load(file);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}

		
	}
	
	public void goToURL(String url) {
		driver.get(prop.getProperty(url));
	}
	
	public void leftClick(String xpath) {
		
		
	}
	
	public void rightCLick(String xpath) {
		
	}
	
	public void enterText(String xpath) {
		
	}
	
	public void enterURL(String xpath) {
		
	}
	


}
