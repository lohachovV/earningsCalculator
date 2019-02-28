package sample.view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import sample.dao.CarDao;
import sample.dao.Implements.CarDaoImplements;
import sample.dataBase.DataBaseFunctions;
import sample.entity.Car;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CarsController {
    @FXML
    TextField textFieldCarName;
    @FXML
    TextField textFieldUsingGasoline;
    @FXML
    TextField textFieldKilometers;
    @FXML
    ComboBox <Car> selectYourCar;
    @FXML
    TableView CarsTable;



    private CarDao carDao = new CarDaoImplements();

    @FXML
    private void initialize(){
        on();

    }

    public void on (){
        try {
            CarsTable.setItems(carDao.getAllModelsCar());
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public String getTextFieldCarName() {
        return textFieldCarName.getText();
    }
    public double getTextFieldUsingGasoline() {
        return Double.parseDouble(textFieldUsingGasoline.getText());
    }
    public double getTextFieldKilometers() {
        return  Double.parseDouble (textFieldKilometers.getText());
        }





//        public void comboBoxIni() {
//
//
//        ObservableList<Car> innerList;
//        CarDao CD = new CarDaoImplements();
//        innerList = CD.getIdCar();
//    }





    public void clickOnCarSettingSave (ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        Car car = new Car();
//        if (textFieldCarName != null && )
        car.setCarName(getTextFieldCarName());
        car.setUsageGasoline(getTextFieldUsingGasoline());
        car.setKilometers(getTextFieldKilometers());
        if (textFieldCarName != null && textFieldUsingGasoline != null && textFieldKilometers != null ){
            carDao.saveCar(car);
        }else {
            System.out.println("Something wrong - button didn't work");
        }

    }


}
