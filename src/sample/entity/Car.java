package sample.entity;

public class Car {


    private int idCar;
    private String carName;
    private double usageGasoline;
    private double kilometers;

    public Car() {
    }

    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public double getUsageGasoline() {
        return usageGasoline;
    }

    public void setUsageGasoline(double usageGasoline) {
        this.usageGasoline = usageGasoline;
    }

    public double getKilometers() {
        return kilometers;
    }

    public void setKilometers(double kilometers) {
        this.kilometers = kilometers;
    }


}
