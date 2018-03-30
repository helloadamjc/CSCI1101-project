package com.company;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Insets;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.layout.GridPane;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ChoiceBox;
import java.util.ArrayList;

public class Main extends Application {
    private  Button nextWith, exitWith, backWith, exitDep, backDep,nextDep,transferMain, withdrawalMain,
            depositMain, exitMain, accountinfoMain, balanceAccI, transactionAccI, nextAccI, exitAccI, backAccI,
            signHome, exitHome;
    public static User user1 = new User("123");

    @Override
    public void start(Stage stage) {


        //Beginning of HOMESCREEN



        GridPane paneHome = new GridPane();
        paneHome.setPadding(new Insets(10, 10, 10, 10));
        paneHome.setHgap(15);
        paneHome.setVgap(30);
        signHome = new Button("Sign in");
        exitHome = new Button("Exit");

        Label welcomeHome = new Label("Welcome To The Bank of America");
        Label pinHome = new Label("Enter your PIN");
        TextField textHome = new TextField();

        paneHome.add(welcomeHome,0,0);
        paneHome.add(pinHome,0,1);
        paneHome.add(textHome,1,1);
        paneHome.add(signHome,0,2);


        Scene sceneHome = new Scene(paneHome);
        stage.setTitle("HomeScreen");
        stage.setScene(sceneHome);
        stage.show();

//End of HOMESCREEN


//Start of main

        GridPane paneMain = new GridPane();

        paneMain.setPadding(new Insets(10, 10, 10, 10));
        paneMain.setHgap(30);
        paneMain.setVgap(30);

//Main buttons
        withdrawalMain = new Button("Withdrawal");
        depositMain = new Button("Deposit");
        transferMain = new Button("Balance");
        accountinfoMain = new Button("Account Info");
        exitMain = new Button("Exit");

// adding buttons to paneMain

        paneMain.add(transferMain, 0, 0);
        paneMain.add(accountinfoMain, 0, 1);
        paneMain.add(withdrawalMain, 1, 1);
        paneMain.add(depositMain, 1, 0);
        paneMain.add(exitMain, 1, 2);

//Setting pane1 to scene 1
        Scene sceneMain = new Scene(paneMain);
//stage.setScene(sceneMain);
//stage.setTitle("ATM");
//stage.show();

// End of Main



//start of Withdrawal
        GridPane paneWith = new GridPane();
        paneWith.setPadding(new Insets(10,10,10,10));
        paneWith.setHgap(10);
        paneWith.setVgap(10);

        ChoiceBox <String> withDrop = new ChoiceBox <String>();
        withDrop.getItems().addAll("Credit","Chequings","Savings");
        TextField amounttextWith = new TextField ();
        Label amountlabelWith = new Label("Amount");
        Label optionslabelWith = new Label("Options");

        nextWith = new Button("Next");
        exitWith = new Button("Exit");
        backWith = new Button("Back");

        paneWith.add(withDrop,1,0);
        paneWith.add(optionslabelWith,0,0);
        paneWith.add(amounttextWith,1,1);
        paneWith.add(amountlabelWith,0,1);
        paneWith.add(nextWith,1,2);
        paneWith.add(backWith,0,2);
        paneWith.add(exitWith,0,3);


        Scene sceneWith = new Scene(paneWith);
//stage.setScene(sceneWith);
//stage.setTitle("Withdrawal");
//stage.show();

//End of Withdrawal

//Start of DEPOSIT
        GridPane paneDep = new GridPane();
        paneDep.setPadding(new Insets(10,10,10,10));
        paneDep.setHgap(10);
        paneDep.setVgap(10);

        ChoiceBox <String> DropDep = new ChoiceBox <String>();
        DropDep.getItems().addAll("Credit","Chequings","Savings");
        TextField amounttextDep = new TextField ();
        Label amountlabelDep = new Label("Amount");
        Label optionslabelDep = new Label("Options");

        nextDep = new Button("Next");
        exitDep = new Button("Exit");
        backDep = new Button("Back");

        paneDep.add(DropDep,1,0);
        paneDep.add(optionslabelDep,0,0);
        paneDep.add(amounttextDep,1,1);
        paneDep.add(amountlabelDep,0,1);
        paneDep.add(nextDep,1,2);
        paneDep.add(backDep,0,2);
        paneDep.add(exitDep,0,3);




        Scene sceneDep = new Scene(paneDep);
//stage.setScene(sceneDep);
//stage.setTitle("Deposit");
//stage.show();

//End of DEPOSIT


//start of Account Info

        GridPane paneAccI = new GridPane();
        paneAccI.setPadding(new Insets(10,10,10,10));
        paneAccI.setHgap(10);
        paneAccI.setVgap(10);

        ChoiceBox <String> DropAccI = new ChoiceBox <String>();
        DropAccI.getItems().addAll("Credit","Chequings","Savings");
//TextField amounttextAccI = new TextField ();
//Label amountlabelAccI = new Label("Amount");
        Label optionslabelAccI = new Label("Options");

        balanceAccI = new Button("Balance");
        exitAccI = new Button("Exit");
        transactionAccI = new Button("Transactions");
        backAccI = new Button("Back");



        paneAccI.add(DropAccI,1,0);
        paneAccI.add(optionslabelAccI,0,0);
        paneAccI.add(balanceAccI,1,1);
        paneAccI.add(transactionAccI,0,1);
        paneAccI.add(backAccI,0,2);
        paneAccI.add(exitAccI,1,2);




        Scene sceneAccI = new Scene(paneAccI);
//stage.setScene(sceneAccI);
//stage.setTitle("Account Information");
//stage.show();

//end of ACCOUNT INFO

//

        signHome.setOnAction(e ->{
            if(isRealPin(textHome.getText())) {

                stage.setTitle("ATM");
                stage.setScene(sceneMain);
            }

            else {
                System.out.println("kjnfknfkrfn");
            }
        });


        withdrawalMain.setOnAction(e -> {
            stage.setTitle("withdrawal");
            stage.setScene(sceneWith);
        });

        nextWith.setOnAction(e ->{
            String s1 = withDrop.getValue();
            String s2 = amounttextWith.getText();
            registerWithdrawal(s1, s2);
            //System.out.println(withDrop.getValue());
            //System.out.println(amounttextWith.getText());
        });

        depositMain.setOnAction(e -> {
            stage.setTitle("Deposit");
            stage.setScene(sceneDep);
        });

    }

    private boolean isRealPin(String s) {

        ArrayList <String> pins = new ArrayList<String>();
        pins.add("123");

        if(pins.contains(s)) {
            return true;
        }
        else {
            return false;
        }
    }

    private void registerWithdrawal(String s1, String s2){
        if(s1.equals("credit")){
        }
        else if(s1.equals("Chequings")){
            user1.getChequings().changeBalance(Double.parseDouble(s2));
            System.out.println(user1.getChequings().getBalance());
        }
        else{

        }
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}