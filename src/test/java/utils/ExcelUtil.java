package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {


	static XSSFWorkbook workbook;
	static XSSFSheet worksheet;

	//	public static void main(String[] args) {
	//		// TODO Auto-generated method stub
	//		RowCount();
	//		GetData();
	//	}

	public ExcelUtil(String path,String sheet) {
		try {
			workbook=new XSSFWorkbook(path);
			worksheet = workbook.getSheet(sheet);
		}catch(Exception e) {
			e.getStackTrace();
		}

	}

	public static int RowCount() {
		int rows=0;
		try {
			//			workbook = new XSSFWorkbook(projectpath+"/excel/data.xls.xlsx");
			//			worksheet = workbook.getSheet("Sheet1"); // Sheet1 is default name of data sheet when we open it in excel
			rows = worksheet.getPhysicalNumberOfRows();
			//			System.out.println("No of rows: "+rows);
		} catch (Exception exp) {

			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
		return rows;

	}
	public static int ColCount() {

		int cols =0;
		try {
			//			workbook = new XSSFWorkbook(projectpath+"/excel/data.xls.xlsx");
			//			worksheet = workbook.getSheet("Sheet1"); // Sheet1 is default name of data sheet when we open it in excel
			cols = worksheet.getRow(0).getLastCellNum();
			//			System.out.println("No of cols: "+cols);
		} catch (Exception exp) {

			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
		return cols;

	}
	public static String GetDataString(int rowNum, int colNum) {
		String cellData = null;
		try {
			cellData = worksheet.getRow(rowNum).getCell(colNum).getStringCellValue();
//			System.out.println(cellData);
		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
		return cellData;

	}
	public static double GetDataNumeric(int rowNum, int colNum) {
		double cellData = 0.0;
		try {
			cellData = worksheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
//			System.out.println(cellData);
		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
		return cellData;

	}

}
