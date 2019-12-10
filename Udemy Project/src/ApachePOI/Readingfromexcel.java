package ApachePOI;

import java.io.*;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class Readingfromexcel {
	public static void main(String[] args) throws Exception  {
		File fi=new File("D:\\Automation\\Testdata.xls");
		FileInputStream fs=new FileInputStream(fi);
		HSSFWorkbook wb=new HSSFWorkbook(fs);
		HSSFSheet sheet=wb.getSheet("Sheet1");
		String name=sheet.getRow(0).getCell(0).getStringCellValue();
		//String mobile=sheet.getRow(0).getCell(1).getStringCellValue();
		int i=0;
		while(name!=null) {
			System.out.print(sheet.getRow(i).getCell(0).getStringCellValue()+" ");
			System.out.println(sheet.getRow(i).getCell(1).getNumericCellValue());
			i++;
			name=sheet.getRow(i).getCell(0).getStringCellValue();
		}
		wb.close();	
				
	}

}
