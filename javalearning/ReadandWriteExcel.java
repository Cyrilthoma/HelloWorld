package javalearning;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.testng.annotations.Test;
 
public class ReadandWriteExcel {
	
	
	
 static class angel
 {
	 
 }
	
	
	
 public static void main(String args[]) 
 {
	 Thomas s = new Thomas();
	 s.Chris();
	 s.cyril();
 
  try {
 
  // Specify the file path which you want to create or write
   File src=new File("C:\\Users\\Cyril.s\\Desktop\\Test.xlsx");
 
  // Load the file
   FileInputStream fis=new FileInputStream(src);
 
   // load the workbook
    XSSFWorkbook wb=new XSSFWorkbook(fis);
 
  // get the sheet which you want to modify or create
    XSSFSheet sh1= wb.getSheetAt(0);
 
 // getRow specify which row we want to read and getCell which column
 System.out.println(sh1.getRow(0).getCell(0).getStringCellValue()); 
 System.out.println(sh1.getRow(0).getCell(1).getStringCellValue()); 
 System.out.println(sh1.getRow(1).getCell(0).getStringCellValue()); 
 System.out.println(sh1.getRow(1).getCell(1).getStringCellValue()); 
 System.out.println(sh1.getRow(2).getCell(0).getStringCellValue()); 
 System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());
 
// here createCell will create column
 // and setCellvalue will set the value
 
 sh1.getRow(0).createCell(2).setCellValue("3.41.0"); 
 sh1.getRow(1).createCell(2).setCellValue("3.5"); 
 sh1.getRow(2).createCell(2).setCellValue("3.39");
 
// here we need to specify where you want to save file
 FileOutputStream fout=new FileOutputStream(new File("C:\\Users\\Cyril.s\\Desktop\\Test.xlsx"));
 
 
// finally write content 
 wb.write(fout);
 
// close the file
 fout.close();
 
  } catch (Exception e) {
 
   System.out.println(e.getMessage());
 
  }
 
 }
 
}

class Thomas
{
	final void cyril()
	{
		
	}
	public void Chris()
	{
		
	}
}

 class joe extends Thomas
{
	
}
