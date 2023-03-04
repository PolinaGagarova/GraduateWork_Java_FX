package com.example.graduateworkjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.awt.*;
import java.io.File;
import java.io.IOException;

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

        radioMan.setOnAction(event -> {Solution.genderMan = true;});
        radioWoman.setOnAction(event -> {Solution.genderWoman = true;});

        radioProfOsm.setOnAction(event -> {Solution.profOsm = true;});
        radioDisp.setOnAction(event -> {Solution.disp = true;});

        buttonTable.setOnAction(event -> {
            Solution.nameStr = name.getText();
            Solution.birthdayStr = birthday.getText();
            Solution.dataStr = data.getText();
            Solution.timeStr = time.getText();
            Solution.cabinetStr = cabinet.getText();

            TableButton.tableButton();

            try {
                Desktop.getDesktop().open(new File("D:\\GraduateWorkJavaFX\\src\\main\\java\\results.xlsx"));
            } catch (IOException e) {
                e.printStackTrace();
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

//        String pattern = "dd.MM.yyyy";
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//
//        DateFormatter dateFormatter = new DateFormatter("dd.MM.yyyy");
//
//        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
//
//        data.setOnAction(event -> {
//            data.setPrefColumnCount(10);
//
//        });


//        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
//        DateFormatter dateFormatter = new DateFormatter(data);
//        dateFormatter.setAllowsInvalid(true);             //запрет ввода неверных значений
//        dateFormatter.setOverwriteMode(true);             //режим перезаписи значений
//        JFormattedTextField formattedTextField = new JFormattedTextField(dateFormat);
//
//        dateFormat.format(data);
//
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
//        birthday.setText(simpleDateFormat.format(birthday.getOnAction()));

//        birthday.setOnAction(event -> {
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
//            DateFormatter dateFormatter = new DateFormatter(simpleDateFormat);
//            dateFormatter.setAllowsInvalid(true);
//            dateFormatter.setOverwriteMode(true);
//        });

    }
}
