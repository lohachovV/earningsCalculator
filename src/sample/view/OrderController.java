package sample.view;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import sample.dao.CarDao;
import sample.dao.Implements.CarDaoImplements;
import sample.entity.Car;

import java.sql.SQLException;
import java.util.Observable;

public class OrderController {

    private CarDao carRepos = new CarDaoImplements();




    @FXML
    private ComboBox comboBoxSelectYourCar;


    @FXML
    private void initialize(){

//        comboBoxSelectYourCar.setItems(getCarList());
//
//    }
//
//
//    public void setCarList (){
//        ObservableList<Car> temp = null;
//        try {
//            temp = carRepos.getAllModelsCar();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        comboBoxSelectYourCar.setItems(temp);
//    }
//
//    public ObservableList<Car> getCarList () {
//        ObservableList<Car> temp = null;
//        try {
//            temp = carRepos.getAllModelsCar();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return temp;
    }




}
