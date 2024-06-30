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
		
		
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		int n = workbook.getNumberOfSheets();
		
		int column=0,k=0;
		
		
		for(int i=0;i<n;i++) {
			
			String s = workbook.getSheetName(i);
			
			
			if(s.equals("Sheet2")) {
				
				XSSFSheet sheet = workbook.getSheetAt(i);
				
				Iterator<Row> allRows = sheet.iterator();
				
				Row firstRow = allRows.next();
				
				Iterator<Cell> cv = firstRow.cellIterator();
				
				while(cv.hasNext()) {
					
					Cell c = cv.next();
					
					if(c.getStringCellValue().toString().equals("Name")){
						
						column=k;
						
					}
					
					k++;
					
					
				}
				
				System.out.println(column);
				
				//
				
				while(allRows.hasNext()) {
					
					Row r = allRows.next();
					
					if(r.getCell(column).getStringCellValue().equals("Krishna")) {
						
						Iterator<Cell> cs = r.cellIterator();
						
						while(cs.hasNext()) {
							
							
							System.out.println(cs.next());
						}
						
						
					}
					
					
					
					
					
					
					
					
				}
				
				
				
			}
			
		}
		
	
		}

}
