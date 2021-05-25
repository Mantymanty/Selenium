package Gen;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;




public class excel_gen
{
	public static String getdata(String sheet,int row,int cell)
	{
		String var="";
		try
		{
			FileInputStream fs=new FileInputStream("./excel/sel.xlsx");
			Workbook wb=WorkbookFactory.create(fs);
			Cell c=wb.getSheet(sheet).getRow(row).getCell(cell);
			var=c.toString();
			
		}
		catch(Exception e)
		{
			System.out.println("unread xecel");
		}
		return var;
	}
}
