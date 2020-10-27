module com.mycompany.solarsystem {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.solarsystem to javafx.fxml;
    exports com.mycompany.solarsystem;
}
