package java16.model;

import java16.Enum.CarType;

import java.time.LocalDate;

public class Car   {
    Long id;
    String model;
    String name;
    double price;
    LocalDate issuedDate;
    CarType carType;

    public Car() {
    }

    public Car(Long id, String model, String name, double price, LocalDate issuedDate, CarType carType) {
        this.id = id;
        this.model = model;
        this.name = name;
        this.price = price;
        this.issuedDate = issuedDate;
        this.carType = carType;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(LocalDate issuedDate) {
        this.issuedDate = issuedDate;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "java16.model.Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", issuedDate=" + issuedDate +
                ", java16.Enum.CarType=" + carType +
                '}';
    }
}

