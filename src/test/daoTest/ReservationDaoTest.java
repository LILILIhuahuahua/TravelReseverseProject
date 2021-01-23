package test.daoTest;

import dao.ReservationsDao;
import dao.impl.ReservationDaoImpl;
import org.junit.Test;
import pojo.Reservation;

import java.util.List;

/**
 * @author HuaHua
 * @create 2021-01-22 19:58
 */
public class ReservationDaoTest {
    ReservationsDao reservationsDao = new ReservationDaoImpl();
    @Test
    public void queryReservationByresvKey() {
        System.out.println(reservationsDao.queryReservationByresvKey(1));
    }

    @Test
    public void queryReservationBycustId() {
        System.out.println(reservationsDao.queryReservationBycustId(2));
    }

    @Test
    public void deleteReservationBycustId() {
        System.out.println(reservationsDao.deleteReservationBycustId(2));
    }

    @Test
    public void addReservation() {
        Reservation reservation = new Reservation(1,2,"car",2);
        System.out.println(reservationsDao.addReservation(reservation));
    }

    @Test
    public void queryAllReservation() {
        List<Reservation> reservations = reservationsDao.queryAllReservation();
        for(Reservation reservation:reservations){
            System.out.println(reservation);
        }
    }
}