package service;

import pojo.Flight;

import java.util.List;

/**
 * @author HuaHua
 * @create 2021-01-24 19:22
 */
public interface FlightService {
    public int updateFlight(Flight flight);

    public Flight queryFlightById(Integer id);

    public List<Flight> queryAllFlight();
}
