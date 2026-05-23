package lab8;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class excel {
    public static final String file = "laborator8_input.xlsx";

    public void readExcel() {
        try (FileInputStream fis = new FileInputStream(new File(file));
             Workbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheetAt(0);
            for (Row r : sheet) {
                for (Cell c : r) {
                    switch (c.getCellType()) {
                        case STRING:
                            System.out.println(c.getStringCellValue() + "\t");
                            break;
                        case NUMERIC:
                            System.out.print(c.getNumericCellValue() + "\t");
                            break;

                        case BOOLEAN:
                            System.out.print(c.getBooleanCellValue() + "\t");
                            break;

                        default:
                            System.out.print("NULL\t");
                    }
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //8.5.2
    public void generateOutput2() {
        String outputFile = "laborator8_output2.xlsx";

        try (FileInputStream fis = new FileInputStream(file);
             Workbook inputWorkbook = new XSSFWorkbook(fis);
             Workbook outputWorkbook = new XSSFWorkbook()) {

            Sheet inputSheet = inputWorkbook.getSheetAt(0);
            Sheet outputSheet = outputWorkbook.createSheet("laborator8_output2.xlsx");
            int rNum = 0;
            for (Row r : inputSheet) {
                Row newRow = outputSheet.createRow(rNum++);
                int cNum = 0;
                double sum = 0;
                int numericCount = 0;
                for (Cell c : r) {
                    Cell newCell = newRow.createCell(cNum++);
                    switch (c.getCellType()) {
                        case STRING:
                            newCell.setCellValue(c.getStringCellValue());
                            break;
                        case NUMERIC:
                            double numericValue = c.getNumericCellValue();
                            newCell.setCellValue(numericValue);
                            sum = sum + numericValue;
                            numericCount++;
                            break;
                        case BOOLEAN:
                            newCell.setCellValue(c.getBooleanCellValue());
                            break;
                    }
                    cNum++;
                }
                double average = (numericCount > 0) ? sum / numericCount : 0;
                newRow.createCell(cNum).setCellValue(average);
            }
            try (FileOutputStream fos = new FileOutputStream(outputFile)) {
                outputWorkbook.write(fos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //8.5.3
    public void generateOutput3() {
        String outputFile = "laborator8_output3.xlsx";
        try(FileInputStream fis=new FileInputStream(file);
            Workbook inputWorkbook = new XSSFWorkbook(fis);
            XSSFWorkbook outputWorkbook = new XSSFWorkbook()) {

            Sheet inputSheet = inputWorkbook.getSheetAt(0);
            Sheet outputSheet = outputWorkbook.createSheet("output3");

            int rNum = 0;

            for (Row r : inputSheet) {

                Row newRow = outputSheet.createRow(rNum++);
                int cNum = 0;

                for (Cell c : r) {

                    Cell newCell = newRow.createCell(cNum);

                    switch (c.getCellType()) {
                        case STRING:
                            newCell.setCellValue(c.getStringCellValue());
                            break;
                        case NUMERIC:
                            newCell.setCellValue(c.getNumericCellValue());
                            break;
                        case BOOLEAN:
                            newCell.setCellValue(c.getBooleanCellValue());
                            break;
                    }

                    cNum++;
                }
                int lastRow = rNum;
                String formula = "AVERAGE(D" + lastRow + ":F" + lastRow + ")";

                newRow.createCell(cNum).setCellFormula(formula);
            }

            try (FileOutputStream fos = new FileOutputStream(outputFile)) {
                outputWorkbook.write(fos);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
