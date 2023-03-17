package hiber.dao;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserDao {
   void addUser(User user);

   List<User> getlistUsers();
   List<Car> getlistCars();

   User getUserCar(String model, int series);
}
