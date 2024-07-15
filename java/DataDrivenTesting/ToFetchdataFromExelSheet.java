package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFetchdataFromExelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./testdata/ExelData.xlsx");
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet wb = workbook.getSheet("sheet1");
		Row row = wb.getRow(0);
		Row row1 = wb.getRow(1);
		Row row2 = wb.getRow(2);
		Cell cell = row1.getCell(0);
		System.out.println(cell.getStringCellValue());
		System.out.println(row1.getCell(2).toString());
		System.out.println(row2.getCell(3).toString());
		System.out.println(row.getCell(1).toString());
		
		
		
		

	}

}
