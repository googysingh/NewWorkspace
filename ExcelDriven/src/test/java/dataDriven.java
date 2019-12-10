import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;

public class dataDriven {
	public static void main(String[] args) throws InvalidFormatException, IOException {

		FileInputStream fs = new FileInputStream("D:\\OneDrive\\workspace\\ExcelDriven\\datasheet.xls");
		@SuppressWarnings("resource")
		HSSFWorkbook workbook = new HSSFWorkbook(fs);
		HSSFSheet sheet1 = workbook.getSheetAt(0);
		System.out.println(sheet1.getRow(0).getCell(0));
		// System.out.println(wosrkbook.getNumberOfSheets());

		// identify Testcase column by scanning entire 1st row
		Iterator<Row> rows = sheet1.iterator();// Sheet is collection of rows
		Row firstrow = rows.next();
		Iterator<Cell> ce = firstrow.cellIterator();// Row is collection of cells
		int k = 0, column = 0;
		while (ce.hasNext()) {
			Cell value = ce.next();
			if (value.getStringCellValue().equalsIgnoreCase("Testcase")) {
				column = k;
			}
			k++;
		}
		System.out.println(column);

		// Once column is identified then scan the entire column to identify purchase
		// testcase
		while (rows.hasNext()) {
			Row r = rows.next();
			if (r.getCell(column).getStringCellValue().equalsIgnoreCase("Purchase")) {
				// After grabbing testcase column then pull all the test data into our test.
				Iterator<Cell> cv = r.cellIterator();
				while (cv.hasNext()) {
					Cell c=cv.next();
					if(c.getCellType()==CellType.STRING) {
						System.out.println(c.getStringCellValue());
					}
					else {
						System.out.println(c.getNumericCellValue());
					}
					
				}
			}
		}

	}

}
