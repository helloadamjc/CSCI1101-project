package com.company;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.Scene;

public class GUI extends Application {

    Button btDep = new Button("Deposit");
    Button btWith = new Button("Withdrawl");
    Button btTran = new Button("Make a transfer");
    Button btNewCheckings = new Button("Make New Checkings");
    Button btNewSavings = new Button("Make New Savings");

    @Override
    public void start(Stage mainStage){
        HBox hBox1 = new HBox();
        hBox1.setSpacing(10);
        hBox1.setAlignment(Pos.CENTER);
        HBox hBox2 = new HBox();
        hBox2.setAlignment(Pos.CENTER);
        hBox2.setSpacing(10);
        HBox hBox3 = new HBox();
        hBox3.setAlignment(Pos.CENTER);
        hBox3.setSpacing(10);
        Button btEnd = new Button("End Program");

        hBox1.getChildren().add(btDep);
        hBox1.getChildren().add(btWith);
        hBox2.getChildren().add(btNewCheckings);
        hBox2.getChildren().add(btNewSavings);
        hBox3.getChildren().add(btTran);
        hBox3.getChildren().add(btEnd);

        BorderPane borderPane = new BorderPane();
        borderPane.setBottom(hBox3);
        borderPane.setTop(hBox1);
        borderPane.setCenter(hBox2);
        BorderPane.setAlignment(hBox3, Pos.CENTER);

        Scene scene = new Scene(borderPane, 500, 300);
        mainStage.setTitle("Bank of America"); // Set the stage title
        mainStage.setScene(scene); // Place the scene in the stage
        mainStage.show();
    }

}
