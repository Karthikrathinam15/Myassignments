package testcases;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXL {

	public static void main(String[] args) throws IOException {
		
		//open the workbook
		XSSFWorkbook objbook= new XSSFWorkbook("./Data/CreateLead.xlsx");
		XSSFSheet objsheet = objbook.getSheet("Sheet1");
	int rowcount = objsheet.getLastRowNum();
	System.out.println("rowcount :" + rowcount);
	
	int rowCountwheader = objsheet.getPhysicalNumberOfRows();
	System.out.println("rowcountHead :" + rowCountwheader);
	
	int colcount = objsheet.getRow(1).getLastCellNum();
	System.out.println("ColumnCount :"+ colcount);
	
	//To Retrieve particular value
	  XSSFCell cell = objsheet.getRow(2).getCell(1);
	  String FName = objsheet.getRow(1).getCell(1).getStringCellValue();
	  System.out.println(cell + " " + FName);
	
	
	  for(int i=1;i<=rowcount;i++)
	  {
		  XSSFRow row = objsheet.getRow(i);
		  for (int j=0;j<colcount;j++)
		  {
			  String AllData = row.getCell(j).getStringCellValue();
			  
			  
			  System.out.println(" "+ AllData);
		  }
	  }
		
		
		
		
		
		
		
		

	}

}
