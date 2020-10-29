module com.mycompany.solarsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.solarsystem to javafx.fxml;
    exports com.mycompany.solarsystem;
}
