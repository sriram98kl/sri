package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class getExcel {
	
	@Test
	
public static String[][] excel (String filename) throws IOException {
	
	XSSFWorkbook wb =new XSSFWorkbook("./data/"+filename +".xlsx");
	
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
	
//	get the data from excel by rows and column
	
	for (int i = 1; i < rows; i++) {
		for (int j = 0; j < columncount; j++) {
			
//  retrieve the data from the cell
			
			String cellValue = ws.getRow(i).getCell(j).getStringCellValue();
			System.out.println(cellValue);
			
			data[i-1][j]=cellValue;	
			
			
			
		}
	}
			
	
			wb.close();
			
			return data;
			
}
}
