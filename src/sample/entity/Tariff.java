package sample.entity;

public class Tariff {
    private int id;
    private String nameOfTariff;
    private double minimalPayment;
    private double costPerKm;
    private double paymentForOrder;

    public Tariff() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfTariff() {
        return nameOfTariff;
    }

    public void setNameOfTariff(String name) {
        this.nameOfTariff = name;
    }

    public double getMinimalPayment() {
        return minimalPayment;
    }

    public void setMinimalPayment(double minimalPayment) {
        this.minimalPayment = minimalPayment;
    }

    public double getCostPerKm() {
        return costPerKm;
    }

    public void setCostPerKm(double costPerKm) {
        this.costPerKm = costPerKm;
    }

    public double getPaymentForOrder() {
        return paymentForOrder;
    }

    public void setPaymentForOrder(double paymentForOrder) {
        this.paymentForOrder = paymentForOrder;
    }
}
