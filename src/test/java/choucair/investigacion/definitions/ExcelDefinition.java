package choucair.investigacion.definitions;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDefinition {
	

	 public static void main(String[] args) throws InvalidFormatException, IOException
	{
		 Workbook libro = new XSSFWorkbook();     
	     Sheet hoja = libro.createSheet("LaHoja");
	     
	     
		
		
	}
	
	
	
	
	
	
}

