package DataDrivenTesting;

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
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment 

{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.com");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count = links.size();
		XSSFWorkbook book=new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet();
		for(int i=0;i<count;i++)
		{
			WebElement link = links.get(i);
			String text = link.getText();
			XSSFRow row=sheet.createRow(i);
			XSSFCell cel =row.createCell(0);
			cel.setCellValue(text);
		}
		FileOutputStream fos=new FileOutputStream("./Testdata/amazontext.xlsx");
		book.write(fos);
		book.close();
		fos.close();
	}

}
