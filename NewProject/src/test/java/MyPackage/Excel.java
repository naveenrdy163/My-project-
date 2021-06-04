package MyPackage;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public Excel(String excelPath,String sheetName) {
		try {
			projectPath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		//getRowCount();
		getcellDataString(0,0);
		getcellDataNumber(1,1);
	}


	public static void getRowCount() {
		try {
			
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows:"+rowCount);

		}catch (Exception exp) {
			System.out.println(exp.getMessage());
			exp.getCause();
			exp.printStackTrace();
		}

	}
	public static void getcellDataString(int rowNum,int colNum)  {
		try {
			projectPath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook("src\\test\\resources\\Excel\\data.xlsx");
			sheet = workbook.getSheet("Sheet1");

			String cellData =  sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(cellData);

		}
		catch (Exception exp) {
			System.out.println(exp.getMessage());
			exp.getCause();
			exp.printStackTrace();
		}
		}
		public static void getcellDataNumber(int rowNum,int colNum)  {
			try {
				projectPath = System.getProperty("user.dir");
				workbook = new XSSFWorkbook("src\\test\\resources\\Excel\\data.xlsx");
				sheet = workbook.getSheet("Sheet1");

				double cellData =  sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
				System.out.println(cellData);

			}
			catch (Exception exp) {
				System.out.println(exp.getMessage());
				exp.getCause();
				exp.printStackTrace();
			}
	}
}