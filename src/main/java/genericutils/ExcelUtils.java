package genericutils;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ExcelUtils {
	
	public String readOneCellData(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(IPathConstants.Excel_PATH);
		Workbook wb=WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
	}
	
	public void writeOneCellData(String sheetName,int row,int cell,String data) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(IPathConstants.Excel_PATH);
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(data);
		FileOutputStream fos=new FileOutputStream(IPathConstants.Excel_PATH);
		wb.write(fos);
	}
	
	public HashMap<String,String> readMultipleData(String sheetName) throws EncryptedDocumentException, IOException{
		FileInputStream fis=new FileInputStream(IPathConstants.Excel_PATH);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		int rowCount=sh.getLastRowNum();
		HashMap<String,String> hm=new HashMap<String,String>();
		for(int r=0;r<=rowCount;r++) {
			Row ro=sh.getRow(r);
			hm.put(ro.getCell(0).getStringCellValue(), ro.getCell(1).getStringCellValue());
		}
		return hm;
		
	}

}
