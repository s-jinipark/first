import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

public class PoiExcelTest {
	static private int rows = 50000;
	static private String fileName = "c:\\temp\\PoiExcelTest.xlsx";

	public static void main(String[] args) {
		testExcel("SXSSF"); // Buffered streaming
		testExcel("XSSF");  // In memory tree
	}
	
	public static void testExcel(String type) {

		FileOutputStream fos = null;
    	Workbook workbook = null;

    	long startTime = System.currentTimeMillis();
    	try {

	        if("XSSF".equals(type)){ // In memory tree
	        	workbook = new XSSFWorkbook();
	        }else if("SXSSF".equals(type)){ // Buffered streaming
	            workbook = new SXSSFWorkbook();
	        }else{
	        	workbook = new XSSFWorkbook();
	        }
	
	        Sheet sheet = workbook.createSheet();
	        CellStyle title = createCommonStyle(workbook);
	        title.setAlignment(CellStyle.ALIGN_CENTER);
	        title.setFillForegroundColor(HSSFColor.GREY_25_PERCENT.index);
	        title.setFillPattern(CellStyle.SOLID_FOREGROUND);

	        CellStyle value = createCommonStyle(workbook);
	        
	        Row row = sheet.createRow(0);
	        createCell(row, 0, "Name", title);
	        createCell(row, 1, "Age", title);
	        createCell(row, 2, "Address", title);
	        createCell(row, 3, "Telepone", title);
	        createCell(row, 4, "Etc", title);

            for(int i=1; i <= rows; i++){
	            row = sheet.createRow(i);
	            
	            createCell(row, 0, "KMS " + i, value);
	            createCell(row, 1, (i%100), value);
	            createCell(row, 2, "Korea, Seoul addr " + i, value);
	            createCell(row, 3, "010-123-" + i, value);
	            createCell(row, 4, "Value" + i, value);
	        };
	    	
	        fos = new FileOutputStream(fileName);
	        workbook.write(fos);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        	if(fos != null){
        		try { fos.close(); }catch(Exception ex){}
        	}
        	if(workbook != null){
        		try { workbook.close(); }catch(Exception ex){}
        	}
        }
    	System.out.println(type + ": " +  (System.currentTimeMillis() - startTime) + "ms");
    }
	
	private static CellStyle createCommonStyle(Workbook workbook){
        CellStyle style = workbook.createCellStyle();
        style.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
        style.setBorderTop(CellStyle.BORDER_THIN);
        style.setBorderLeft(CellStyle.BORDER_THIN);
        style.setBorderRight(CellStyle.BORDER_THIN);
        style.setBorderBottom(CellStyle.BORDER_THIN);
        return style;
	}
	
	private static void createCell(Row row, int inx, String value, CellStyle style){
        Cell cell = row.createCell(inx);
        cell.setCellValue(value);
        cell.setCellStyle(style);		
	}

	private static void createCell(Row row, int inx, int value, CellStyle style){
        Cell cell = row.createCell(inx);
        cell.setCellValue(value);
        cell.setCellStyle(style);		
	}
}
