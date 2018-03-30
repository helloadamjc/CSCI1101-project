package com.company;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class TestAccount extends Application {

    //creates arrays that will store the accounts
    //ArrayList<Account> Checking = new ArrayList<Account>();
    ArrayList<Integer> Savings = new ArrayList<Integer>();

    //declares variables
    double interest = 0;
    double interestRate = 0;
    double balance = 0;
    double credit = 0;
    double initialBalance = 0;
    double feeChargedPerTransaction = 0;
    Button btMain = new Button("Go Back to Main Menu");
    Button btNewAccount = new Button("Make New Account");
    Button btExistingAccount = new Button("Access an Existing Account");
    Button btNewCheckings = new Button("Make New Checkings");
    Button btNewSavings = new Button("Make New Savings");

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {

// Hold two buttons in an HBox
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        Button btGoToAccounts = new Button("Go To Accounts Page");
        Button btEnd = new Button("End Program");
        hBox.getChildren().add(btGoToAccounts);
        hBox.getChildren().add(btEnd);

        BorderPane borderPane = new BorderPane();
        borderPane.setBottom(hBox);
        BorderPane.setAlignment(hBox, Pos.CENTER);

// Create a scene and place it in the stage
        Scene scene = new Scene(borderPane, 500, 300);
        primaryStage.setTitle("Bank of America"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

// creates and registers handler and specifies action for button to go to accounts page
        btGoToAccounts.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent event) {
                primaryStage.hide();

                // Hold three buttons in an HBox
                HBox hBox1 = new HBox();
                hBox1.setSpacing(10);
                hBox1.setAlignment(Pos.CENTER);
                hBox1.getChildren().add(btNewAccount);
                hBox1.getChildren().add(btExistingAccount);
                hBox1.getChildren().add(btMain);

                BorderPane borderPane1 = new BorderPane();
                borderPane1.setBottom(hBox1);
                BorderPane.setAlignment(hBox1, Pos.CENTER);

                Scene scene1 = new Scene(borderPane1, 500, 300);
                primaryStage.setTitle("Accounts Page"); // Set the stage title
                primaryStage.setScene(scene1); // Place the scene in the stage
                primaryStage.show(); // Display the stage
            }
        });

// creates and registers handler and specifies action for button to go to create new accounts page
        btNewAccount.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.hide();

                // Hold three buttons in an HBox
                HBox hBox2 = new HBox();
                hBox2.setSpacing(10);
                hBox2.setAlignment(Pos.CENTER);

                // ############### removed this ###################
                //Button btNewCheckings = new Button("Make New Checkings");
                //Button btNewSavings = new Button("Make New Savings");
                hBox2.getChildren().add(btNewCheckings);
                hBox2.getChildren().add(btNewSavings);
                hBox2.getChildren().add(btMain);

                BorderPane borderPane2 = new BorderPane();
                borderPane2.setBottom(hBox2);
                BorderPane.setAlignment(hBox2, Pos.CENTER);

                Scene scene2 = new Scene(borderPane2, 400, 300);
                primaryStage.setTitle("New Accounts"); // Set the stage title

                primaryStage.setScene(scene2); // Place the scene in the stage
                primaryStage.show(); // Display the stage
            }
        });

// THIS IS THE BUTTON THAT DOESN'T REGISTER AS BEING CLICKED...havent done the newSavingsAccount button either.want it to take me to new scene where i enter in new account info hit submit and then take me back to the main menu ("scene")
        btNewCheckings.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                HBox hbox3 = new HBox();
                Scene scene3 = new Scene(hbox3, 800, 300);
                primaryStage.setTitle("Test"); // Set the stage title
                primaryStage.setScene(scene3); // Place the scene in the stage

                //the Name text field
                final TextField name = new TextField();
                name.setPromptText("Enter the desired account name which will be used under the access an existing account screen later");
                name.setPrefColumnCount(10);
                name.getText();
                hbox3.getChildren().add(name);

                //Defining the initial balance/fee text fields
                final TextField initialBalance = new TextField();
                final TextField fee = new TextField();
                initialBalance.setPromptText("Enter your desired initial balance as a double.");
                fee.setPromptText("Enter the agreed upon fee per transaction as a double.");

                initialBalance.setPrefColumnCount(15);
                fee.setPrefColumnCount(15);
                fee.getText();
                hbox3.getChildren().add(fee);
                initialBalance.getText();
                hbox3.getChildren().add(initialBalance);

                //Defining the Submit button
                Button accountCreation = new Button("Create the Account");
                hbox3.getChildren().add(accountCreation);

                //Defining the Clear button
                Button clear = new Button("Clear");
                hbox3.getChildren().add(clear);

                primaryStage.show(); // Display the stage

                //Setting an action for the Submit button
                accountCreation.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent e) {
                        if ((initialBalance.getText() != null && !initialBalance.getText().isEmpty())) {
                            //CheckingAccount newMember = new CheckingAccount();
                            //newMember.setInitialBalance(Double.parseDouble(initialBalance.toString()));
                            //newMember.setFee((Double.parseDouble(fee.toString())));
                            //Checking.add(newMember);
                        } else {
                            System.out.println("no member added");
                        }
                    }
                });

                //Setting an action for the Clear button
                clear.setOnAction(new EventHandler<ActionEvent>() {

                    @Override
                    public void handle(ActionEvent e) {
                        name.clear();
                        initialBalance.clear();
                    }
                });

            }
        });

// creates and registers handler and specifies action for end button to close the stage
        btEnd.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent event) {
                primaryStage.close();
            }
        });


// creates and registers handler and specifies action for main menu button to go to first scene
        btMain.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent event) {
                primaryStage.hide();
                primaryStage.setTitle("Bank of America"); // Set the stage title
                primaryStage.setScene(scene); // Place the scene in the stage
                primaryStage.show(); // Display the stage
            }
        });

    }
    public void main(String[] args){
        launch(args);
    }
}