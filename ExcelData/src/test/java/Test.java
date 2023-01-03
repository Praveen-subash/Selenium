import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Test {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
	
		FileInputStream fis = new  FileInputStream("D:\\Selenium\\ExcelData\\data.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		int size = workbook.getNumberOfSheets();
		
		int k,column = 0;
		
		for(int i=0;i<size;i++) {
			
			
			String sheetName = workbook.getSheetName(i);
			
			if(sheetName.equals("Sheet2")) {
				
				XSSFSheet sheet = workbook.getSheetAt(i);
				
				Iterator<Row> allRows = sheet.iterator();
				
				Row firstRow = allRows.next();
				
				Iterator<Cell> cell =  firstRow.cellIterator();
				
				
				
				while(cell.hasNext()) {
					
					
					Cell cv = cell.next();
					
					System.out.println(cv);
					
					if(cv.getStringCellValue().equals("Name")) {
						
						System.out.println("======");
						break;
						
					}
					
					else {
						
						column++;
					}
					
					
				}
				
				while(allRows.hasNext()) {
					
					Row r = allRows.next();
					System.out.println(column);
					if(r.getCell(column).getStringCellValue().equals("Pyara")) {
						
						
						Iterator<Cell> v = r.cellIterator();
						
						while(v.hasNext()) {
							
							System.out.println(v.next());
							
						}
					}
					
					
				}
				
					
				
			}
			
			
		}
		
		

	}

}
