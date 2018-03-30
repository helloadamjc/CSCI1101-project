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
import javafx.scene.layout.Pane;

public class CreateWindowJavaFX extends Application{

    Button btMain = new Button("Go Back to Main Menu");
    Button btNewAccount = new Button("Make New Account");
    Button btExistingAccount = new Button("Access an Existing Account");
    Button btNewCheckings = new Button("Make New Checkings");
    Button btNewSavings = new Button("Make New Savings");
    Button btCreateAccount = new Button("");

    @Override
    public void start(Stage primaryStage){
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

        Scene scene = new Scene(borderPane, 500, 300);
        primaryStage.setTitle("Bank of America"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show();

        btGoToAccounts.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent event){

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
                            //ChequingAccount newMember = new ChecquingAccount();
                            //newMember.setInitialBalance(Double.parseDouble(initialBalance.toString()));
                            //newMember.setFee((Double.parseDouble(fee.toString())));
                            ////Checking.add(newMember);
                            primaryStage.hide();
                            primaryStage.setTitle("Bank of America"); // Set the stage title
                            primaryStage.setScene(scene); // Place the scene in the stage
                            primaryStage.show();
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

        btEnd.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent event) {
                primaryStage.close();
            }
        });

        btMain.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent event) {
                primaryStage.hide();
                primaryStage.setTitle("Bank of America"); // Set the stage title
                primaryStage.setScene(scene); // Place the scene in the stage
                primaryStage.show(); // Display the stage
            }
        });
    }



    public static void main(String[] args){
            Application.launch(args);
    }
    }