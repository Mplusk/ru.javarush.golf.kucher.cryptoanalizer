package ru.javarush.cryptoanalizer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.FileChooser;

import java.io.*;

public class MainConstructor {



    @FXML
    private Button bforce;

    @FXML
    private TextArea checOpenFile;

    @FXML
    private Button decode2;

    @FXML
    private Button decode4;

    @FXML
    private Button encode1;

    @FXML
    private TextField key1;

    @FXML
    private TextField key2;

    @FXML
    private Button save1;

    @FXML
    private Button save2;

    @FXML
    private Button save3;

    @FXML
    private Button save4;

    @FXML
    private Button stat;

    @FXML
    void bforce3(ActionEvent event) {

    }


    int offset2 ;
    @FXML
    void decode2in(ActionEvent event) throws IOException {
        FileChooser fc2 = new FileChooser();
        FileChooser.ExtensionFilter extFilter2 = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
        fc2.getExtensionFilters().add(extFilter2);
        File file2 = fc2.showOpenDialog(null);
        BufferedReader br2 = new BufferedReader(new FileReader(file2));

//reads the string and converts into array
        String st2;
        char[] string2 = {};
        while ((st2 = br2.readLine()) != null) {
            string2 = st2.toCharArray();}

        char[] fileText2 = string2;
        char[] result2 = new char[fileText2.length];
        char[] abc2 = new char[]{'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ь', 'ы', 'ъ', 'э', 'ю', 'я', '.', ',', '\"', ':', '-', '!', '?', '\b', '\n'};

        for (int i = 0; i < fileText2.length; i++) {
            for (int j = 0; j < abc2.length; j++) {
                int numberABC2;
                if (fileText2[i] == abc2[j]) {
                    numberABC2 = j - offset2;
                    if (numberABC2 < 0) {
                        numberABC2 = numberABC2 + 42;
                    }
                    result2[i] = abc2[numberABC2];

                }
            }
        }

        checOpenFile.appendText(String.valueOf(result2));

        imp2 = result2;
        br2.close();
    }

    @FXML
    void decode4in(ActionEvent event) {

    }
    int offset1 ;
    @FXML
    void encode1in(ActionEvent event) throws IOException {
        FileChooser fc1 = new FileChooser();
        FileChooser.ExtensionFilter extFilter1 = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
        fc1.getExtensionFilters().add(extFilter1);
        File file1 = fc1.showOpenDialog(null);
        BufferedReader br1 = new BufferedReader(new FileReader(file1));

//reads the string and converts into array
        String st1;
        char[] string1 = {};
        while ((st1 = br1.readLine()) != null) {
            string1 = st1.toCharArray();}

        char[] fileText1 = string1;
        char[] result1 = new char[fileText1.length];
        char[] abc1 = new char[]{'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ь', 'ы', 'ъ', 'э', 'ю', 'я', '.', ',', '\"', ':', '-', '!', '?', '\b', '\n'};

        for (int i = 0; i < fileText1.length; i++) {
            for (int j = 0; j < abc1.length; j++) {
                int numberABC1;
                if (fileText1[i] == abc1[j]) {
                    numberABC1 = j + offset1;
                    if (numberABC1 >= 42) {
                        numberABC1 = numberABC1 - 42;
                    }
                    result1[i] = abc1[numberABC1];

                }
            }
        }

        checOpenFile.appendText(String.valueOf(result1));
        imp1 = result1;
        br1.close();

    }

    int inoff1;
    @FXML
    void key1num(KeyEvent event) {
        inoff1  = Integer.parseInt(((TextField)event.getSource()).getText());
        key1.setText(String.valueOf(inoff1));
        offset1= inoff1;
    }

    int inoff2;
    @FXML
    void key2num(KeyEvent event) {
        inoff2  = Integer.parseInt(((TextField)event.getSource()).getText());
        key2.setText(String.valueOf(inoff2));
        offset2= inoff2;
    }
    char[] imp1;
    @FXML
    void save1encode(ActionEvent event) throws IOException {
        FileChooser fc1 = new FileChooser();
        FileChooser.ExtensionFilter extFilter1 = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
        fc1.getExtensionFilters().add(extFilter1);
        File file11 = fc1.showSaveDialog(null);
        BufferedWriter bufferedWriter1 = new BufferedWriter(new FileWriter(file11));

        bufferedWriter1.write(String.valueOf(imp1));
        bufferedWriter1.close();
        checOpenFile.clear();
    }

    char[] imp2;
    @FXML
    void save2decode(ActionEvent event) throws IOException {
        FileChooser fc2 = new FileChooser();
        FileChooser.ExtensionFilter extFilter2= new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
        fc2.getExtensionFilters().add(extFilter2);
        File file22 = fc2.showSaveDialog(null);
        BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file22));

        bufferedWriter2.write(String.valueOf(imp2));
        bufferedWriter2.close();
    }

    @FXML
    void save3bf(ActionEvent event) {

    }

    @FXML
    void save4decode(ActionEvent event) {

    }

    @FXML
    void statin(ActionEvent event) {

    }

}
