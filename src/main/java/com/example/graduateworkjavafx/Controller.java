package com.example.graduateworkjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import static com.example.graduateworkjavafx.Solution.birthdayStr;
import static java.lang.Integer.parseInt;

public class Controller {

    @FXML
    private TextField name;
    @FXML
    private TextField birthday;
    @FXML
    private RadioButton radioMan;
    @FXML
    private RadioButton radioWoman;
    @FXML
    private TextField data;
    @FXML
    private TextField time;
    @FXML
    private TextField cabinet;
    @FXML
    private RadioButton radioProfOsm;
    @FXML
    private RadioButton radioDisp;
    @FXML
    private Button buttonTable;
    @FXML
    private Button buttonDelete;

    @FXML
    void initialize() {

        radioMan.setOnAction(event -> {
            Solution.genderMan = true;
            Solution.genderWoman = false;
        });
        radioWoman.setOnAction(event -> {
            Solution.genderWoman = true;
            Solution.genderMan = false;
        });

        radioProfOsm.setOnAction(event -> {
            Solution.profOsm = true;
            Solution.disp = false;
        });
        radioDisp.setOnAction(event -> {
            Solution.disp = true;
            Solution.profOsm = false;
        });

        buttonTable.setOnAction(event -> {
            Solution.nameStr = name.getText();
            Solution.birthdayStr = birthday.getText();
            Solution.dataStr = data.getText();
            Solution.timeStr = time.getText();
            Solution.cabinetStr = cabinet.getText();


            if (Solution.nameStr == null || Solution.nameStr.equals("")) {
                Solution.stop = true;
                Solution.infoBox("Введите ФИО", "Некорректный ввод данных");
            }

            if (Solution.birthdayStr == null || Solution.birthdayStr.equals("")) {
                Solution.stop = true;
                Solution.infoBox("Введите дату рождения", "Некорректный ввод данных");
            } else {
                String[] birthdaySplit = birthdayStr.split("\\.");
                int birthdayYear = parseInt(birthdaySplit[birthdaySplit.length - 1]);
                if (Solution.yearNow - birthdayYear < 18 || Solution.yearNow - birthdayYear > 99) {
                    Solution.stop = true;
                    Solution.infoBox("Неверно введена дата рождения", "Некорректный ввод данных");
                }
            }

//            String[] birthdaySplit = birthdayStr.split("\\.");
//            int birthdayYear = parseInt(birthdaySplit[birthdaySplit.length - 1]);
//            if (Solution.yearNow - birthdayYear < 18 || Solution.yearNow - birthdayYear > 99) {
//                Solution.stop = true;
//                Solution.infoBox("Неверно введена дата рождения", "Некорректный ввод данных");
//            }

            if (!Solution.genderMan && !Solution.genderWoman) {
                Solution.stop = true;
                Solution.infoBox("Выберите пол", "Некорректный ввод данных");
            }

            if (Solution.dataStr == null || Solution.dataStr.equals("")) {
                Solution.stop = true;
                Solution.infoBox("Введите дату для явки", "Некорректный ввод данных");
            }

            if (Solution.timeStr == null || Solution.timeStr.equals("")) {
                Solution.stop = true;
                Solution.infoBox("Введите время для явки", "Некорректный ввод данных");
            }

            if (Solution.cabinetStr == null || Solution.cabinetStr.equals("")) {
                Solution.stop = true;
                Solution.infoBox("Введите кабинет для явки", "Некорректный ввод данных");
            }

            if (!Solution.profOsm && !Solution.disp) {
                Solution.stop = true;
                Solution.infoBox("Выберите формат обследования", "Некорректный ввод данных");
            }


            if (!Solution.stop) {
                TableButton.tableButton();

                try {
                    //File resultsFile = new File("D:\\GraduateWorkJavaFX\\src\\main\\java\\results.xlsx");
                    File resultsFile = new File("src/main/java/results.xlsx");
                    Desktop.getDesktop().open(new File(String.valueOf(resultsFile)));

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        buttonDelete.setOnAction(event -> {
            name.setText("");
            birthday.setText("");
            radioMan.setSelected(false);
            radioWoman.setSelected(false);
            data.setText("");
            time.setText("");
            cabinet.setText("");
            radioProfOsm.setSelected(false);
            radioDisp.setSelected(false);

            Solution.nameStr = null;
            Solution.birthdayStr = null;
            Solution.genderMan = false;
            Solution.genderWoman = false;
            Solution.dataStr = null;
            Solution.timeStr = null;
            Solution.cabinetStr = null;
            Solution.profOsm = false;
            Solution.disp = false;
        });


//        НУЖНО ЕЩЕ:
//        - поставить формат даты на 2 поля
//        - поставить маску времени
//        - чтобы открывалось через иконку на раб столе, а не через идею

    }
}
