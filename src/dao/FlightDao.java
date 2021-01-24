package dao;

import pojo.Flight;
import pojo.Hotle;

import java.util.List;

/**
 * @author HuaHua
 * @create 2021-01-24 17:58
 */
public interface FlightDao {
    public int updateFlight(Flight flight);

    public Flight queryFlightById(Integer id);

    public List<Flight> queryAllFlight();
}
