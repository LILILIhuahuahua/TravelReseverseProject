package dao.impl;

import dao.BaseDao;
import dao.FlightDao;
import pojo.Flight;
import pojo.Hotle;

import java.util.List;

/**
 * @author HuaHua
 * @create 2021-01-24 18:00
 */
public class FlightDaoImpl extends BaseDao implements FlightDao {
    @Override
    public int updateFlight(Flight flight) {
        String sql = "update t_flights set `flightNum`=?,`price`=?,`numSeats`=?,`numAvail`=?,`fromCity`=?,`arivCity`=? where id = ?";
        return update(sql,flight.getFlightNum(),flight.getPrice(),flight.getNumSeats(),flight.getNumAvail(),flight.getFromCity(),flight.getArivCity(),flight.getId());
    }

    @Override
    public Flight queryFlightById(Integer id) {
        String sql = "select `flightNum` , `price` , `numSeats` , `numAvail` , `fromCity` , `arivCity` from t_flights where id = ?";
        return queryForOne(Flight.class, sql,id);
    }

    @Override
    public List<Flight> queryAllFlight() {
        String sql = "select `id`,`flightNum` , `price` , `numSeats` , `numAvail` , `fromCity` , `arivCity` from t_flights ";
        return queryForList(Flight.class, sql);
    }
}
