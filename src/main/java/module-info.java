module com.example.projectgit {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projectgit to javafx.fxml;
    exports com.example.projectgit;
}