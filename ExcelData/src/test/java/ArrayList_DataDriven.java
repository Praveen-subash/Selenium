import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ArrayList_DataDriven {
	
	public static void main(String[] args) throws IOException {
		
		ArrayList_DataDriven obj = new ArrayList_DataDriven();
		ArrayList<String> str = obj.getData("Pyara");
		System.out.println(str);
		

	}
	
	public ArrayList<String> getData(String studentName) throws IOException  {
		
		ArrayList<String> strList = new ArrayList<String>();
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\data.xlsx");
		
		//Step 1 : Create object for XSSFWOrkbook class and Load the sheet to the workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		int sheets = workbook.getNumberOfSheets();
		
		for(int i=0;i<sheets;i++) {
			
			//Get the sheet name
			String sheetName = workbook.getSheetName(i).toString();	
			
			if(sheetName.equalsIgnoreCase("Sheet2")) {
				
				//Step 2 : Get access to the sheet
				XSSFSheet sheet = workbook.getSheetAt(i);
				
				//Step 3 : Access to all the rows(Starts from 1st Row) SHEET IS A COLLECTION OF ROWS
				Iterator<Row> allRows = sheet.iterator();
				
				//This starts at the first row. Dont get confused seeing next
				//Step 4 : Get access to specific row from all rows
				Row firstRow = allRows.next();  
				
				//Step 5 : Get access to all cells of the row (From left to right) ROW IS A COLLECTION OF CELLS
				Iterator<Cell> ce = firstRow.cellIterator();
				
				int k=0;
				int column=0;
				while(ce.hasNext()) {
					
					//Printing the cell names of the desired row
					Cell value = ce.next();
					System.out.println(value.getStringCellValue());
					
					if(value.getStringCellValue().equalsIgnoreCase("Name")) {
						
						 //Desired column value
						column = k; //Index of the cell is returned in k. If desired cell is not there it gets incremented
						System.out.println("The column index is "+column);
						break;
					}
					
					k++;
					
				}
				
				
				//We are now going to each and every row in the specified column
				//What we did previously was traversing through the first row to get desired cell
				//No we are traversing to that column and getting the list of valuez
				while(allRows.hasNext()) {
					
					Row r = allRows.next();
					System.out.println(r.getCell(column).getStringCellValue());
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase(studentName)) {
						 
						System.out.println("----------");
						Iterator<Cell> cv = r.cellIterator();
						
						
						//NOTE THIS TO CHECK WHETHER ITS STRING OR NUMERIC
						while(cv.hasNext()) {
							
							//If there's numeric values in excel use this
							Cell c = cv.next();
							
							if(c.getCellType()== CellType.STRING) {
								
								strList.add(c.getStringCellValue());
							}
							else if(c.getCellType()== CellType.NUMERIC) {
								
								
								strList.add(NumberToTextConverter.toText(c.getNumericCellValue()));
								
							}
							
						}
					}
					
				}
				
			}

			
		}
		return strList;
		
	}
	
}

		
	