package sample.dao;

import javafx.collections.ObservableList;
import sample.entity.Car;

import java.sql.SQLException;

public interface CarDao {
   void saveCar(Car car) throws SQLException, ClassNotFoundException;
   ObservableList<Car> getAllModelsCar() throws SQLException, ClassNotFoundException;




}
