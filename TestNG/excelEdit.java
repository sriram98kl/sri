package week5.day1.excercise;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class excelEdit {
	
	@Test
	public static String[][] excel() throws IOException {

		XSSFWorkbook wb =new XSSFWorkbook("./data/EditLead.xlsx");
		
		XSSFSheet ws =wb.getSheetAt(0);

		
		//row count
	int rowCount =	ws.getLastRowNum();

	System.out.println( rowCount);

	int rows = ws.getPhysicalNumberOfRows();

	System.out.println( rows );

	//column count

	XSSFRow header = ws.getRow(0);

	int columncount= header.getLastCellNum();

		System.out.println(columncount);
		
		
		String [][] data= new String[rowCount][columncount];
		//String [][] data= new String[2][3];
		
//		get the data from excel by rows and column
		
		for (int i = 1; i < rows; i++) {
			for (int j = 0; j < columncount; j++) {
				
	//  retrieve the data from the cell
				
				String cellValue = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(cellValue);
				
				data[i-1][j]=cellValue;	
				
				
				
			}
		}
		return data;
				
		
			
				
			
				
	}

}
