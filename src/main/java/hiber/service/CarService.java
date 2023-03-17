package hiber.service;

import hiber.model.Car;
import hiber.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface CarService {
    void addCar(Car car);

    List<Car> listCars();
}
