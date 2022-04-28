module ru.javarush.cryptoanalizer {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.javarush.cryptoanalizer to javafx.fxml;
    exports ru.javarush.cryptoanalizer;
}