package java16.DAO;

import java16.model.Car;

public interface CarDao {

    String createCar(Car car);

    Car getCarById(Long id);

    String updateCar(Long id,Car car);

    String deleteCarById(Long id);
}




