package java16.DAO.Impl;
import java16.DAO.CarDao;
import java16.model.Car;

import java.util.Arrays;

public class CarDaoImpl implements CarDao {

    private Car[] cars = new Car[0];

    @Override
    public String createCar(Car car) {
        int newSize = cars.length + 1;
        cars = Arrays.copyOf(cars, newSize);
        cars[newSize - 1] = car;
        return "Car created successfully";
    }

    @Override
    public Car getCarById(Long id) {
        for (Car car : cars) {
            if (car.getId().equals(id)) {
                return car;
            }
        }
        return null;
    }

    @Override
    public String updateCar(Long id, Car updatedCar) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getId().equals(id)) {
                cars[i] = updatedCar;
                return "Car updated successfully";
            }
        }
        return "Car with given ID not found";
    }

    @Override
    public String deleteCarById(Long id) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getId().equals(id)) {
                cars[i] = cars[cars.length - 1];
                cars = Arrays.copyOf(cars, cars.length - 1);
                return "Car deleted successfully";
            }
        }
        return "Car with given ID not found";
    }
}










