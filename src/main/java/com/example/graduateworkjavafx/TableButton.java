package com.example.graduateworkjavafx;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import static com.example.graduateworkjavafx.Solution.*;
import static java.lang.Integer.parseInt;

public class TableButton {
    public static void tableButton() {
        try {

            XSSFWorkbook wb = new XSSFWorkbook();                       //создаем новый Excel документ - "книгу"
            XSSFSheet list1 = wb.createSheet("Лист 1");       //создали новый лист

            list1.setColumnWidth(0, 6500);            //задаем ширину колонкам
            list1.setColumnWidth(1, 3800);
            list1.setColumnWidth(2, 3800);
            list1.setColumnWidth(3, 3800);
            list1.setColumnWidth(4, 3800);

            list1.addMergedRegion(new CellRangeAddress(1, 1, 1, 4));            //объединяеем ячейки
            list1.addMergedRegion(new CellRangeAddress(2, 2, 1, 4));
            list1.addMergedRegion(new CellRangeAddress(3, 4, 0, 0));
            list1.addMergedRegion(new CellRangeAddress(3, 3, 1, 2));
            list1.addMergedRegion(new CellRangeAddress(4, 4, 1, 2));

            //--------------------------------------------------------------------------------------------

            XSSFCellStyle style1 = wb.createCellStyle();                //создаем стиль
            style1.setAlignment(HorizontalAlignment.CENTER);           //выравнивание горизонтально
            style1.setVerticalAlignment(VerticalAlignment.CENTER);    //выравнивание вертикально
            style1.setBorderTop(BorderStyle.THIN);                   //границы ячейки
            style1.setBorderBottom(BorderStyle.THIN);
            style1.setBorderLeft(BorderStyle.THIN);
            style1.setBorderRight(BorderStyle.THIN);
            style1.setWrapText(true);

            Font font1 = wb.createFont();
            font1.setFontHeightInPoints((short) 12);         //размер 12
            font1.setBold(true);                            //жирным

            style1.setFont(font1);

            //--------------------------------------------------------------------------------------------

            XSSFCellStyle style2 = wb.createCellStyle();                //создаем стиль
            style2.setAlignment(HorizontalAlignment.CENTER);           //выравнивание горизонтально
            style2.setVerticalAlignment(VerticalAlignment.CENTER);    //выравнивание вертикально
            style2.setBorderTop(BorderStyle.THIN);                   //границы ячейки
            style2.setBorderBottom(BorderStyle.THIN);
            style2.setBorderLeft(BorderStyle.THIN);
            style2.setBorderRight(BorderStyle.THIN);
            style2.setWrapText(true);

            Font font2 = wb.createFont();
            font2.setFontHeightInPoints((short) 14);          //размер 14

            style2.setFont(font2);

            //--------------------------------------------------------------------------------------------

            XSSFRow row2 = list1.createRow(1);                //аргумент = номер строки
            XSSFCell cell2A = row2.createCell(0);         //аргумент = номер столбца
            cell2A.setCellValue("ФИО");                             //пишем значение
            cell2A.setCellStyle(style2);

            XSSFCell cell2B = row2.createCell(1);
            cell2B.setCellValue(nameStr);                           //Ставим ФИО в нужную ячейку
            cell2B.setCellStyle(style2);

            XSSFCell cell2C = row2.createCell(2);
            cell2C.setCellStyle(style2);

            XSSFCell cell2D = row2.createCell(3);
            cell2D.setCellStyle(style2);

            XSSFCell cell2E = row2.createCell(4);
            cell2E.setCellStyle(style2);

            Row row3 = list1.createRow(2);           //строка 3
            Cell cell3A = row3.createCell(0);
            cell3A.setCellValue("Дата рождения");
            cell3A.setCellStyle(style2);

            Cell cell3B = row3.createCell(1);
            cell3B.setCellValue(birthdayStr);
            cell3B.setCellStyle(style2);

            Cell cell3C = row3.createCell(2);
            cell3C.setCellStyle(style2);

            Cell cell3D = row3.createCell(3);
            cell3D.setCellStyle(style2);

            Cell cell3E = row3.createCell(4);
            cell3E.setCellStyle(style2);

            Row row4 = list1.createRow(3);           //строка 4
            Cell cell4A = row4.createCell(0);
            cell4A.setCellValue("Явка");
            cell4A.setCellStyle(style2);

            Cell cell4B = row4.createCell(1);
            cell4B.setCellValue("Дата");
            cell4B.setCellStyle(style2);

            Cell cell4C = row4.createCell(2);
            cell4C.setCellStyle(style2);

            Cell cell4D = row4.createCell(3);
            cell4D.setCellValue("Время");
            cell4D.setCellStyle(style2);

            Cell cell4E = row4.createCell(4);
            cell4E.setCellValue("Кабинет");
            cell4E.setCellStyle(style2);


            Row row5 = list1.createRow(4);         //строка 5
            Cell cell5A = row5.createCell(0);
            cell5A.setCellStyle(style2);

            Cell cell5B = row5.createCell(1);
            cell5B.setCellValue(dataStr);                 //Ставим дату в нужную ячейку
            cell5B.setCellStyle(style2);

            Cell cell5C = row5.createCell(2);
            cell5C.setCellStyle(style2);

            Cell cell5D = row5.createCell(3);
            cell5D.setCellValue(timeStr);                //Ставим время в нужную ячейку
            cell5D.setCellStyle(style2);

            Cell cell5E = row5.createCell(4);
            cell5E.setCellValue(cabinetStr);             //Ставим кабинет в нужную ячейку
            cell5E.setCellStyle(style2);


            Row row6 = list1.createRow(5);          //строка 6
            Cell cell6A = row6.createCell(0);
            cell6A.setCellValue("Осмотр, исследование, мероприятие");
            cell6A.setCellStyle(style1);

            Cell cell6B = row6.createCell(1);
            cell6B.setCellValue("Кабинет");
            cell6B.setCellStyle(style1);

            Cell cell6C = row6.createCell(2);
            cell6C.setCellValue("Дата проведения");
            cell6C.setCellStyle(style1);

            Cell cell6E = row6.createCell(3);
            cell6E.setCellValue("Время работы");
            cell6E.setCellStyle(style1);

            Cell cell6F = row6.createCell(4);
            cell6F.setCellValue("Исполнение");
            cell6F.setCellStyle(style1);

            //--------------------------------------------------------------------------------------------
            //--------------------------------------------------------------------------------------------
            //--------------------------------------------------------------------------------------------

            int fullYears;

            String[] birthdayStrSplit = birthdayStr.split("\\.");
            birthdayStr = birthdayStrSplit[birthdayStrSplit.length - 1];
            birthdayYearNow = parseInt(birthdayStr);
            fullYears = yearNow - birthdayYearNow;           //нашли кол-во полных лет на текущий год

            //--------------------------------------------------------------------------------------------

            String orderTablesStr = "";
            int orderTablesInt = -1;

            if (genderMan && fullYears > 17 && fullYears < 65) {
                orderTablesInt = 0;
                orderTablesStr = "MAN18-64";
            } else if (genderMan && fullYears > 64 && fullYears < 100) {
                orderTablesInt = 1;
                orderTablesStr = "MAN65-99";
            } else if (genderWoman && fullYears > 17 && fullYears < 65) {
                orderTablesInt = 2;
                orderTablesStr = "WOMAN18-64";
            } else if (genderWoman && fullYears > 64 && fullYears < 100) {
                orderTablesInt = 3;                                             //orderTablesInt - номер нужной таблицы
                orderTablesStr = "WOMAN65-99";                                //orderTablesStr - название нужной таблицы
            }

            //--------------------------------------------------------------------------------------------

            FileInputStream fis = new FileInputStream("D:\\GraduateWorkJavaFX\\src\\main\\java\\OrderTables404H.xlsx");       //путь файла, ИЗ которого берем информацию
            XSSFWorkbook wb1 = new XSSFWorkbook(fis);
            XSSFSheet sheet1 = wb1.getSheetAt(orderTablesInt);

            Row rowForAge = sheet1.getRow(1);
            int minCol = rowForAge.getFirstCellNum();
            int maxCol = rowForAge.getLastCellNum();

            int cellForAge = -1;                                        //поиск колонки с нужным возрастом

            for (int i = minCol; i < maxCol; i++) {
                Cell cell = rowForAge.getCell(i);

                if (cell == null || cell.toString().equals("")) {
                    continue;
                } else {
                    int textInt = (int) cell.getNumericCellValue();
                    if (textInt == fullYears) {
                        cellForAge = i;
                        break;
                    }
                }
            }

            //--------------------------------------------------------------------------------------------

            list1.addMergedRegion(new CellRangeAddress(0, 0, 0, 4));

            Row row1 = list1.createRow(0);          //строка 1
            Cell cell1A = row1.createCell(0);
            if (profOsm) {
                cell1A.setCellValue("Профосмотр ");
            } else {
                cell1A.setCellValue("Диспансеризация");
            }
            cell1A.setCellStyle(style2);
            Cell cell1B = row1.createCell(1);
            Cell cell1C = row1.createCell(2);
            Cell cell1D = row1.createCell(3);
            Cell cell1E = row1.createCell(4);
            cell1B.setCellStyle(style2);
            cell1C.setCellStyle(style2);
            cell1D.setCellStyle(style2);
            cell1E.setCellStyle(style2);

            label:
            switch (orderTablesStr) {
                case "MAN18-64":                  //MAN18-64
                    int rowResults = 6;           //строка для начала таблицы исследований
                    int start = 2;                //строка ОТ которой смотрим исследования
                    int end = -1;                      //строка ДО которой смотрим исследования

                    if (profOsm) {
                        end = 13;
                    } else if (disp) {
                        end = 19;
                    }

                    boolean isFullYears = switch (fullYears) {
                        case 18, 21, 24, 27, 30, 33, 36 -> true;
                        default -> false;
                    };

                    for (int i = start; i < end; i++) {
                        if (disp && isFullYears && i == 12) {continue;}

                        String plus = wb1.getSheet("MAN18-64").getRow(i).getCell(cellForAge).getStringCellValue();
                        if (plus.equals("+")) {
                            String dataRES = wb1.getSheet("MAN18-64").getRow(i).getCell(3).getStringCellValue();
                            Row rowRES = list1.createRow(rowResults);
                            Cell cellRES = rowRES.createCell(0);
                            cellRES.setCellValue(dataRES);
                            cellRES.setCellStyle(style2);

                            Cell cellRES1 = rowRES.createCell(1);
                            Cell cellRES2 = rowRES.createCell(2);
                            Cell cellRES3 = rowRES.createCell(3);
                            Cell cellRES4 = rowRES.createCell(4);
                            cellRES1.setCellStyle(style2);
                            cellRES2.setCellStyle(style2);
                            cellRES3.setCellStyle(style2);
                            cellRES4.setCellStyle(style2);

                            rowResults++;
                        }
                    }


                    break;

                case "MAN65-99":                  //MAN65-99

                    break;

                case "WOMAN18-64":                //WOMAN18-64

                    break;

                case "WOMAN65-99":                //WOMAN65-99

                    break;
            }


            //String dataInResults = wb1.getSheet(orderTablesStr).getRow(rowForAge).getCell(cellForAge).getStringCellValue();       //номер таблицы, колонки, строки, берем информацию из нужной ячейки

            fis.close();

//            XSSFRow row123 = list1.createRow(7);             //аргумент = номер строки
//            XSSFCell cell123 = row123.createCell(7);        //аргумент = номер столбца
//            cell123.setCellValue(dataInResults);           //пишем значение
//
            FileOutputStream fos = new FileOutputStream("D:\\GraduateWorkJavaFX\\src\\main\\java\\results.xlsx");      //путь к нашему файлу
            wb.write(fos);                                                             //записываем книгу в наш файл, fos - поток файла
            fos.close();                                                              //закрываем поток

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
