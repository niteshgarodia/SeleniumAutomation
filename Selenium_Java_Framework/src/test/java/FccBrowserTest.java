import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FccBrowserTest {
	public static void main(String[] args) {
		//Make the Path relative We need to use user.dir property
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		System.setProperty("webdriver.gecko.driver",projectPath+ "\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
//		WebDriver driver = new ChromeDriver();
		driver.get("http://blrcswfbcc0027:9084/MP55/portal/screen/");
		
	}

}
