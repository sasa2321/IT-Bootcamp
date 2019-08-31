package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import project.PageURLs;
import project.PeoplePage;

public class Test8 {

	static WebDriver driver;

	@BeforeTest
	public void setup() throws Exception{
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Sasa Markovic\\Desktop\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
		File src =new File("C:\\Users\\Sasa Markovic\\Desktop\\POI\\ZavrsniFajl.xlsx");
		ArrayList<String> peopleList;
	


	@Test
	
	public void test8() throws Exception {
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
        
        driver.navigate().to(PageURLs.PEOPLE_PAGE);
        PeoplePage pp = new PeoplePage(driver);
       
        
      peopleList = new ArrayList<String>();
        
        for (int i = 0; i <= sheet.getLastRowNum(); i++) {
        	peopleList.add(sheet.getRow(i).getCell(0).getStringCellValue());
        }
        Assert.assertFalse(pp.getPeopleListInfo().equals(peopleList));
    } 
}

	/*@Test
	public void writingInExcel() throws Exception {
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		driver.navigate().to(PageURLs.PEOPLE_PAGE);
        
		
		PeoplePage pp = new PeoplePage(driver);
		List <String> peopleList2 = pp.getPeopleListInfo();
		
		int flag = 0;
		int rowCount = sheet.getLastRowNum();
		Row row;
		Cell cell;
		for (int i = 1; i < peopleList2.size(); i++) {
        for (int j = 0; j < peopleList.size(); j++) {
            if (peopleList2.get(i).equals(peopleList.get(j))) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            row = sheet.createRow(++rowCount);
            cell = row.createCell(0);
            cell.setCellValue(peopleList.get(i));
        } else {
            flag = 0;
        }
    }
    FileOutputStream output = new FileOutputStream(src);
    wb.write(output);
    wb.close();
}
} */