package service.impl;

import dao.ReservationsDao;
import dao.impl.ReservationDaoImpl;
import pojo.Reservation;
import service.ReservationService;

import java.util.List;

/**
 * @author HuaHua
 * @create 2021-01-23 18:58
 */
public class ReservationServiceImpl implements ReservationService {
    ReservationsDao reservationsDao = new ReservationDaoImpl();
    @Override
    public Reservation queryReservationByresvKey(Integer resvKey) {
        return null;
    }

    @Override
    public Reservation queryReservationBycustId(Integer custId) {
        return null;
    }

    @Override
    public int deleteReservationBycustId(Integer custId) {
        return 0;
    }

    @Override
    public int addReservation(Reservation reservation) {
        return reservationsDao.addReservation(reservation);
    }

    @Override
    public List<Reservation> queryAllReservation() {
        return reservationsDao.queryAllReservation();
    }
}
