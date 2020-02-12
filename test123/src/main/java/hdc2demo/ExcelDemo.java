package hdc2demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelDemo {
  @Test
  public void f() throws Exception
  {
	  File myfile=new File("C:\\Users\\Training1\\Desktop\\DemoSelenium.xlsx");
	  FileInputStream fis=new FileInputStream(myfile);
	  XSSFWorkbook wb = new XSSFWorkbook(fis);
	  XSSFSheet sh = wb.getSheetAt(0);
	  int rws=sh.getLastRowNum();
	  for(int i=1;i<=rws;i++)
	  {
		  String uname=sh.getRow(i).getCell(0).getStringCellValue();
		  String passw=sh.getRow(i).getCell(1).getStringCellValue();
		  System.out.println("user name is "+uname);
		  System.out.println("password is "+passw);
		  sh.getRow(i).createCell(2).setCellValue("Login success");
		  FileOutputStream fout=new FileOutputStream("C:\\Users\\Training1\\Desktop\\DemoSelenium.xlsx");
		  wb.write(fout);
	  }
	  
	  wb.close();
  }
}
