package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


public class CarDaoImpl implements CarDao{


    @Override
    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Ferrari", 350, 20000000));
        cars.add(new Car("Ferrari", 350, 20000000));
        cars.add(new Car("Ferrari", 350, 20000000));

        return cars;
    }
}
