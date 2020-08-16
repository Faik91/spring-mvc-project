package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;


public class CarServiceImpl implements CarService {


    CarDaoImpl carDao = new CarDaoImpl();

    @Override
    public List<Car> getCars() {
        return carDao.getCars();
    }
}
