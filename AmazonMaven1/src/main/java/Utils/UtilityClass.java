package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass {
   public static String getDataFromExcelSheet (String filepath , String sheetName ,int row ,int cell) throws IOException {
	   String celldata="";
	   InputStream file = new FileInputStream(filepath);
	   Workbook workbook = WorkbookFactory.create(file);
	   Sheet sheet = workbook .getSheet(sheetName);
	   //String data =sheet.getRow(row).getCell(cell).getStringCellValue();
	
	   try
	   {
		    celldata =sheet.getRow(row).getCell(cell).getStringCellValue();
		  // data = celldata1;
	   }
	   catch(IllegalStateException refe)
	   {
		   double data  =sheet.getRow(row).getCell(cell).getNumericCellValue(); 
		   long data1 = Math.round(data);
		  // System.out.println("Cell value is " + data3);
		    celldata = Long.toString(data1);
		  // System.out.println("Cell value is " + convdata);
		 //  data = convdata;
		   
	   }
	   catch (NullPointerException refe)
	   {
		   System.out.println("Cell is empty");
	   }
	   System.out.println(celldata);
	   return celldata;
   }
   public static void main (String [] args)throws IOException {
	   getDataFromExcelSheet("C:\\Users\\Admin\\eclipse-workspace\\AmazonMaven1\\src\\test\\resources\\DataResources\\xlcode.xlsx","Sheet1",1,1);
   }
   
   


public static void captureScrenshot(String testID) {
	
}
}
