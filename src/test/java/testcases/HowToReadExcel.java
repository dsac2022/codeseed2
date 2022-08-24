package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class HowToReadExcel {

	@Test
	public void readExcel() throws IOException {
		File file = new File("./src/test/resources/Book1.xlsx");
		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheet("Sheet1");

		int lastRow = sheet.getLastRowNum();

		for (int i = 0; i < lastRow; i++) {
			XSSFRow row = sheet.getRow(i);
			int lastCell = row.getLastCellNum();
			for (int j = 0; j < lastCell; j++) {
				System.out.println(row.getCell(j).getStringCellValue());
			}

		}

	}
}
