package utils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestExcelData {

	@Test(dataProvider="test1")
	public void test(String username,String password) {
		System.out.println(username+" | "+password);
	}
	
	@DataProvider(name="test1")
	public Object[][] getData() {
		String projectpath = System.getProperty("user.dir");
		String path=projectpath+"/excel/data.xlsx";
		Object data[][] = testData(path,"Sheet1");
		return data;
	}
	
	public Object[][] testData(String path,String sheet){
		ExcelUtil excel = new ExcelUtil(path,sheet);
		int rows = excel.RowCount();
		int cols = excel.ColCount();
		Object obj[][] = new Object[rows-1][cols];
		
		for(int i=1;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				String cell = excel.GetDataString(i, j);
//				System.out.println(cell);
				obj[i-1][j] = cell;
			}
		}
		return obj;
	}

}
