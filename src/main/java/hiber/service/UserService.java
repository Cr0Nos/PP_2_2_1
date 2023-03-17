package hiber.service;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    User getUserCar(String model, int series);

    List<User> listUsers();

}
