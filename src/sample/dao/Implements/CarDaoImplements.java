package sample.dao.Implements;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.dao.CarDao;
import sample.dataBase.DataBaseFunctions;
import sample.entity.Car;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CarDaoImplements implements CarDao {

    @Override
    public void saveCar(Car car) throws SQLException, ClassNotFoundException {
        String carName = car.getCarName();
        double usageGasoline = car.getUsageGasoline();
        double kilometers = car.getKilometers();

        String updateStmt = "INSERT INTO CARS" +
                "(carName, usageGasoline, kilometers)" +
                "VALUES ('" + carName +"', " + "'" + usageGasoline + "', " + "'" + kilometers + "')";
        DataBaseFunctions.ExecuteUpdateDB(updateStmt);

    }

    @Override
    public ObservableList<Car> getAllModelsCar() throws SQLException, ClassNotFoundException {
        String selectStmt = "SELECT * FROM CARS";
        ResultSet rs = DataBaseFunctions.ExecuteQueryDB(selectStmt);
        ObservableList<Car> carsList = FXCollections.observableArrayList();
        while (rs.next()) {
            Car carsModel = new Car();
            carsModel.setIdCar(rs.getInt("id"));
            carsModel.setCarName(rs.getString("carName"));
            carsModel.setUsageGasoline(rs.getDouble("usageGasoline"));
            carsModel.setKilometers(rs.getDouble("kilometers"));
            carsList.add(carsModel);


        }
        return carsList;
    }








}
