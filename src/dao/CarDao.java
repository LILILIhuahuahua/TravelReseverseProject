package dao;

import pojo.Car;
import pojo.Flight;

import java.util.List;

/**
 * @author HuaHua
 * @create 2021-01-24 20:02
 */
public interface CarDao {
    public int updateCar(Car car);

    public Car queryCarById(Integer id);

    public List<Car> queryAllCar();
}
