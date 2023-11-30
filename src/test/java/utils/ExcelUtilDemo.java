package utils;

public class ExcelUtilDemo {

	public static void main(String[] args) {

		String projectpath = System.getProperty("user.dir");
		String path=projectpath+"/excel/data.xlsx";
		ExcelUtil excel = new ExcelUtil(path,"Sheet1");
		System.out.println(excel.RowCount());
		System.out.println(excel.GetDataNumeric(1, 1));
	}

}
