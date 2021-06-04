package MyPackage;

public class ExcelUtilsDemo {

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		Excel excel = new Excel(projectPath+"src/test/resources/Excel/data.xlsx","Sheet1");
		
		excel.getRowCount();
		excel.getcellDataString(0, 0);
		excel.getcellDataNumber(1, 1);
	}

}
