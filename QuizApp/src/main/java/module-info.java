module com.dmv.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires lombok;
    requires java.sql;

    opens com.dmv.quizapp to javafx.fxml;
    exports com.dmv.quizapp;
}
