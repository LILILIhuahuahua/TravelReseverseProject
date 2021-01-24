package dao.impl;

import dao.BaseDao;
import dao.CarDao;
import pojo.Car;
import pojo.Hotle;

import java.util.List;

/**
 * @author HuaHua
 * @create 2021-01-24 20:03
 */
public class CarDaoImpl extends BaseDao implements CarDao {
    @Override
    public int updateCar(Car car) {
        String sql = "update t_cars set `location`=?,`price`=?,`numCars`=?,`numAvail`=? where id = ?";
        return update(sql,car.getLocation(),car.getPrice(),car.getNumCars(),car.getNumAvail(),car.getId());
    }

    @Override
    public Car queryCarById(Integer id) {
        String sql = "select `id`,`location` , `price` , `numCars` , `numAvail` from t_cars where id = ?";
        return queryForOne(Car.class, sql,id);
    }

    @Override
    public List<Car> queryAllCar() {
        String sql = "select `id` ,`location` , `price` , `numCars` , `numAvail`  from t_cars";
        return queryForList(Car.class, sql);
    }
}
