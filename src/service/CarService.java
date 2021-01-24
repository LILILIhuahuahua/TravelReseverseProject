package service;

import pojo.Car;

import java.util.List;

/**
 * @author HuaHua
 * @create 2021-01-24 20:13
 */
public interface CarService {
    public int updateCar(Car car);

    public Car queryCarById(Integer id);

    public List<Car> queryAllCar();
}
