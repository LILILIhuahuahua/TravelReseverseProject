package service.impl;

import dao.FlightDao;
import dao.impl.FlightDaoImpl;
import pojo.Flight;
import service.FlightService;

import java.util.List;

/**
 * @author HuaHua
 * @create 2021-01-24 19:23
 */
public class FlightServiceImpl implements FlightService {
    FlightDao flightDao = new FlightDaoImpl();
    @Override
    public int updateFlight(Flight flight) {
        return flightDao.updateFlight(flight);
    }

    @Override
    public Flight queryFlightById(Integer id) {
        return flightDao.queryFlightById(id);
    }

    @Override
    public List<Flight> queryAllFlight() {
        return flightDao.queryAllFlight();
    }
}
