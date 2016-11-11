package excelFileReader;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void main(String[] args) throws Exception {


		File src = new File("C:\\Education\\ReadExcelforJava\\Madu.xlsx");		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		String data1 = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data1);
		String data2 = sheet1.getRow(2).getCell(0).getStringCellValue();
		System.out.println(data2);
		wb.close();
		
		
	}

}
