package com.example.graduateworkjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.time.LocalDate;

public class Solution extends Application {

    public static String nameStr = null;
    public static String birthdayStr = null;
    public static int yearNow = LocalDate.now().getYear();
    public static int birthdayYearNow;
    public static boolean genderMan = false;
    public static boolean genderWoman = false;
    public static String dataStr = null;
    public static String timeStr = null;
    public static String cabinetStr = null;
    public static boolean profOsm = false;
    public static boolean disp = false;
    public static boolean stop = false;

    @Override
    public void start(Stage stage) throws IOException {
        stage.getIcons().add(new Image("file:src\\main\\java\\logo.jpg"));

        FXMLLoader fxmlLoader = new FXMLLoader(Solution.class.getResource("Window1.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 500);
        stage.setTitle("Мое здоровье");
        stage.setScene(scene);
        stage.show();
    }

    public static void infoBox(String infoMessage, String titleBar) {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        launch(args);
    }
}