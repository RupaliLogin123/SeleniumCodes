package com.thetestingacademy.DataDrivenTesting;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UtilExcel {
    static Workbook book;
    static Sheet sheet;

    public static String SheetPath= System.getProperty("user.dir")+"/src/test/java/com/thetestingacademy/Resources/TestData .xlsx";
    public static Object[][] getDataFromExcel(String sheetname) {
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(SheetPath);
            book = WorkbookFactory.create(fileInputStream);
            sheet = book.getSheet(sheetname);

        } catch (IOException e) {
            System.out.println("Either File Not Found! or workbook not created!");
        }

        Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        for (int i = 1; i < sheet.getLastRowNum(); i++)
        {
            for (int j = 1; j < sheet.getRow(0).getLastCellNum();)
            {
                data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
            }
        }
        return data;

    }
}
