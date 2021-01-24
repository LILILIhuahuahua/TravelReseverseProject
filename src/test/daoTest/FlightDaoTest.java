package test.daoTest;

import dao.FlightDao;
import dao.impl.FlightDaoImpl;
import org.junit.Test;
import pojo.Flight;

import java.util.List;

/**
 * @author HuaHua
 * @create 2021-01-24 19:01
 */
public class FlightDaoTest {
    FlightDao flightDao = new FlightDaoImpl();
    @Test
    public void updateHotle() {
        Flight flight = new Flight(4,"合肥航空0003",800,150,100,"合肥","苏州");
        flightDao.updateFlight(flight);
    }

    @Test
    public void queryFlightById() {
    }

    @Test
    public void queryAllFlight() {
        List<Flight> flights = flightDao.queryAllFlight();
        for(Flight flight:flights){
            System.out.println(flight);
        }
    }
}