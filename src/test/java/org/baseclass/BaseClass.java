package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static TakesScreenshot t;
	public static File dest;
	public static Select s;

	public static void loadUrl() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void launchUrl(String url) {
		driver.get(url);

	}

	public static void currentUrl() {
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
	}

	public static void toType(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void toClick(WebElement element) {
		element.click();
	}

	public static void toQuit() {
		driver.quit();
	}

	public static void toScreenShot(String value) throws IOException {
		TakesScreenshot t = (TakesScreenshot) driver;
		File dest = new File("C:\\Users\\shankar\\eclipse-workspace\\AdactinCucumber\\Screenshot\\" + value + ".png");
		File sour = t.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sour, dest);
	}

	public static void displayed(WebElement element) {
		System.out.println(element.isDisplayed());
	}

	public static void toSelDrpDwn(WebElement element, int num) {
		s = new Select(element);
		s.selectByIndex(num);
	}

	public static void toClearCache() {
		driver.manage().deleteAllCookies();
	}

	public static void toWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static void toSelDrpDwnbytxt(WebElement element, String value) {
		s = new Select(element);
		s.selectByVisibleText(value);
	}

	public static Map<String, String> excelRead(String filename, String name,String testcase) throws IOException {
		Map<String, String> mp = new LinkedHashMap<String, String>();
		File file = new File("C:\\Users\\shankar\\eclipse-workspace\\AdactinCucumber\\excel" + filename + ".xlsx");
		FileInputStream f = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(f);
		Sheet sheet = w.getSheet(name);
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(0);
			String testcaseno = cell.getStringCellValue();
			if (testcaseno.equals(testcase)) {
				Row headerrow = sheet.getRow(0);
				Row requiredrow = sheet.getRow(i);
				for (int j = 0; j < headerrow.getPhysicalNumberOfCells(); j++) {
					Cell heading = headerrow.getCell(j);
					Cell data = requiredrow.getCell(j);
					String txtheading = heading.getStringCellValue();
					String txtdata = data.getStringCellValue();
					mp.put(txtheading, txtdata);
					
				}
				
				
			}
		}	return mp;

	}

}
