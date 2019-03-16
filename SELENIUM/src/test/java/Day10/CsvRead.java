package Day10;

import java.io.FileReader;
import java.util.List;
import org.testng.annotations.Test;
import com.opencsv.CSVReader;

public class CsvRead 
{
	@SuppressWarnings("resource")
	@Test
	public void f() throws Exception
	{
		CSVReader CR=new CSVReader(new FileReader(".\\data.csv"));
		List<String[]> allArray=CR.readAll();
		for(String rowData[]:allArray)
		{
			for(String colData: rowData)
			{
				System.out.println(colData);
			}
		}
	}
}
