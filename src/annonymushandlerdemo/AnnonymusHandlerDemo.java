/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package annonymushandlerdemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Thiago Vignolo
 */
public class AnnonymusHandlerDemo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Button btnNew = new Button();
        btnNew.setText("New");
        btnNew.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("New Process");
            }
        });
        
        Button btnOpen = new Button();
        btnOpen.setText("Open");
        btnOpen.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Open Process");
            }
        });
        
        Button btnSave = new Button();
        btnSave.setText("Save");
        btnSave.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Save Process");
            }
        });
        
        Button btnPrint = new Button();
        btnPrint.setText("Print");
        btnPrint.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Print Process");
            }
        });
        
        HBox hbox = new HBox();
        hbox.getChildren().add(btnNew);
        hbox.getChildren().add(btnOpen);
        hbox.getChildren().add(btnSave);
        hbox.getChildren().add(btnPrint);
        
        
        Scene scene = new Scene(hbox, 200, 50);
        
        primaryStage.setTitle("AnnonymusHandlerDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
