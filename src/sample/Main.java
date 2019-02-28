package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.dataBase.CreateDataBase;
import sample.dataBase.SelectInformationsTest;

import java.io.File;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("view/VisualPages/MainWindow.fxml"));
        primaryStage.setTitle("Earnings calculator");
        primaryStage.setScene(new Scene(root, 670, 540));
        primaryStage.show();
    }


    public static void main(String[] args) {
        File dataBase = new File("./DataBase.mv.db");
        if(dataBase.exists() && dataBase.isFile()) {
         launch(args);

        } else {
            CreateDataBase.createDataBase();
            launch(args);
        }

        SelectInformationsTest.selectInformation();
    }

}
