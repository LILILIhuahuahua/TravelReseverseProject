package test.daoTest;

import dao.CarDao;
import dao.impl.CarDaoImpl;
import org.junit.Test;
import pojo.Car;
import pojo.Flight;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author HuaHua
 * @create 2021-01-24 20:10
 */
public class CarDaoTest {
    CarDao carDao = new CarDaoImpl();
    @Test
    public void updateCar() {

    }

    @Test
    public void queryCarById() {
        System.out.println(carDao.queryCarById(3));
    }

    @Test
    public void queryAllCar() {
        List<Car> cars = carDao.queryAllCar();
        for(Car car:cars){
            System.out.println(car);
        }
    }
}