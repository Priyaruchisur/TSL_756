package util;

public class Execute {

	public static void main(String[] args) {
		Excel excel=new Excel("\\\\Infva06621\\Share Folder\\AutomationTesting\\abc.xlsx");
		System.out.println(excel.rowCount("Sheet1"));
		System.out.println(excel.Read("Sheet1", 1, 2));
		System.out.println(excel.cellCount("Sheet1", 2));
	}

}
