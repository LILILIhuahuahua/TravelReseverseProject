package dao;

import pojo.Hotle;
import pojo.Reservation;

import java.util.List;

/**
 * @author HuaHua
 * @create 2021-01-22 19:48
 */
public interface ReservationsDao {
    public Reservation queryReservationByresvKey(Integer resvKey);

    public Reservation queryReservationBycustId(Integer custId);

    public int deleteReservationBycustId(Integer custId);

    public int addReservation(Reservation reservation);

    public List<Reservation> queryAllReservation();
}
