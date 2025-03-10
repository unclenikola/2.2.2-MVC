package web.service;

import web.config.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", "Black", 2020));
        cars.add(new Car("Mercedes", "Silver", 2021));
        cars.add(new Car("Audi", "Red", 2022));
        cars.add(new Car("Toyota", "White", 2023));
        cars.add(new Car("Honda", "Blue", 2019));
    }
    @Override
    public List<Car> getCars(int count) {
        if (count >= 5) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}