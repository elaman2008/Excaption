package java16;

import java16.DAO.CarDao;
import java16.DAO.Impl.CarDaoImpl;
import java16.Enum.CarType;
import java16.model.Car;

import java.time.LocalDate;

import static java16.Enum.CarType.SEDAN;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CarDao carDao = new CarDaoImpl();

        System.out.println(carDao.createCar(new Car(1L, "39", "Shevralet", 14.000, LocalDate.of(2000, 1, 1), CarType.CROSSOVER)));
        System.out.println(carDao.createCar(new Car(2L, "34", "Huindai", 13.000, LocalDate.of(2000, 1, 1), SEDAN)));
        System.out.println(carDao.createCar(new Car(3L, "37", "AUDI", 18.000, LocalDate.of(2000, 1, 1), SEDAN)));
        System.out.println(carDao.createCar(new Car(4L, "Sonata", "KIA", 17.000, LocalDate.of(2000, 1, 1), SEDAN)));
        System.out.println(carDao.createCar(new Car(5L, "124", "Mercedes-Benz", 11.000, LocalDate.of(2000, 1, 1), SEDAN)));



        carDao.updateCar(2L, new Car(1L, "39", "Shevrolet", 14.000, LocalDate.of(2000, 1, 1), CarType.CROSSOVER));
        carDao.updateCar(2L, new Car(2L, "34", "Huinday", 11.000, LocalDate.of(2002, 1, 1), SEDAN));
        carDao.updateCar(2L, new Car(3L, "37", "AUDI", 18.000, LocalDate.of(2003, 1, 1), CarType.CROSSOVER));
        carDao.updateCar(2L, new Car(4L, "Sonata", "KIA", 17.000, LocalDate.of(2008, 1, 1),CarType.HATCHBACK));
        carDao.updateCar(2L, new Car(5L, "124", "Mercedes-Benz", 13.000, LocalDate.of(2009, 1, 1), CarType. CABRIOLET));

        System.out.println(carDao.getCarById(4L));
    }
}
