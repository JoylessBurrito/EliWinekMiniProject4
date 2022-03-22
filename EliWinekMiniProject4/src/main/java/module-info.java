module com.mycompany.eliwinekminiproject4 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens com.mycompany.eliwinekminiproject4 to javafx.fxml;
    exports com.mycompany.eliwinekminiproject4;
}
