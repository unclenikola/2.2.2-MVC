package web.service;

import web.config.Car;

import java.util.List;

public interface CarService {

    List<Car> getCars(int count);
}
