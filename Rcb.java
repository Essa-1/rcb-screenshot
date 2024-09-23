package Screenshot;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Rcb {
	public static void main(String[]args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		driver.get("https://www.royalchallengers.com/");
		WebElement logo=driver.findElement(By.xpath("//div[@class='hdr-logo']"));
		File tempFileLocation=logo.getScreenshotAs(OutputType.FILE);
		File permFileLocation=new File("./screenshot/logoscreenshot.png");
		FileUtils.copyFile(tempFileLocation, permFileLocation);
	}

}
