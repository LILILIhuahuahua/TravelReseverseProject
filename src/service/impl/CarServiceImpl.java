package service.impl;

import dao.CarDao;
import dao.impl.CarDaoImpl;
import pojo.Car;
import service.CarService;

import java.util.List;

/**
 * @author HuaHua
 * @create 2021-01-24 20:13
 */
public class CarServiceImpl implements CarService {
    CarDao carDao = new CarDaoImpl();
    @Override
    public int updateCar(Car car) {
        return carDao.updateCar(car);
    }

    @Override
    public Car queryCarById(Integer id) {
        return carDao.queryCarById(id);
    }

    @Override
    public List<Car> queryAllCar() {
        return carDao.queryAllCar();
    }
}
