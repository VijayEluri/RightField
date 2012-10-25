package uk.ac.manchester.cs.owl.semspreadsheets.model.xssf.impl;

import org.junit.Ignore;

import uk.ac.manchester.cs.owl.semspreadsheets.DocumentsCatalogue;
import uk.ac.manchester.cs.owl.semspreadsheets.SpreadsheetTestHelper;
import uk.ac.manchester.cs.owl.semspreadsheets.model.Cell;
import uk.ac.manchester.cs.owl.semspreadsheets.model.Workbook;
import uk.ac.manchester.cs.owl.semspreadsheets.model.impl.GeneralCellTests;

@Ignore("Ignoring XLSX tests until XLSX support is renabled (see xlsx2 branch)")
public class CellXSSFImplTest extends GeneralCellTests {
	
	protected Workbook getTestWorkbook() throws Exception {
		Workbook workbook = SpreadsheetTestHelper.getBlankXSSFWorkbook();
		workbook.addSheet();
		return workbook;
	}
			
	protected Cell getTestCell() throws Exception {
		return SpreadsheetTestHelper.openWorkbookXSSF(DocumentsCatalogue.workbookWithColoursXLSXURI()).getSheet(0).getCellAt(0, 0);
	}

}
