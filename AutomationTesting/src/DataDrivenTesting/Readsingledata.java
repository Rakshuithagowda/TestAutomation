package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readsingledata
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		FileInputStream fis=new FileInputStream("./Testdata/facebookcredential.xlsx");
		XSSFWorkbook workbook =new XSSFWorkbook(fis);
		XSSFSheet sheet =workbook.getSheet("sheet1");
		XSSFRow row=sheet.getRow(1);
		XSSFCell cel=row.getCell(0);
		XSSFRow row1=sheet.getRow(2);
		XSSFCell cel1=row.getCell(1);
		String val =cel.getStringCellValue();
		System.out.println(val);
		
		String val1 =cel1.getStringCellValue();
		System.out.println(val1);
		workbook.close();
		fis.close();
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement usn = driver.findElement(By.name("email"));
		usn.sendKeys(val);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(val1);
		WebElement btn = driver.findElement(By.name("login"));
		btn.click();
		Thread.sleep(5000);
		driver.close();
		
	}

}
