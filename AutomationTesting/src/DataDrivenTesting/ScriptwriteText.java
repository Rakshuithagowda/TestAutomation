package DataDrivenTesting;

import java.awt.AWTException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScriptwriteText
{
	public static void main(String[] args) throws InterruptedException, AWTException, IOException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int nooflinks = links.size();
		//System.out.println(nooflinks);
		XSSFWorkbook book=new XSSFWorkbook();
		XSSFSheet sheet= book.createSheet("flipkartext");
		for(int i=0;i<nooflinks;i++)
		{
			WebElement link = links.get(i);
			String text = link.getText();
			System.out.println(text);
			XSSFRow row=sheet.createRow(i);
			XSSFCell cel = row.createCell(0);
			cel.setCellValue(text);
		}
		FileOutputStream fos=new FileOutputStream("./Testdata/flipkarttext.xlsx");
		book.write(fos);
		book.close();
		fos.close();
	}


}
