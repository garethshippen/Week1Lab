module fsd.week1.exercise4.week1lab {
    requires javafx.controls;
    requires javafx.fxml;


    opens fsd.week1.exercise4.week1lab to javafx.fxml;
    exports fsd.week1.exercise4.week1lab;
}