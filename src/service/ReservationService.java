package service;

import pojo.Reservation;

import java.util.List;

/**
 * @author HuaHua
 * @create 2021-01-23 18:58
 */
public interface ReservationService {
    public Reservation queryReservationByresvKey(Integer resvKey);

    public Reservation queryReservationBycustId(Integer custId);

    public int deleteReservationBycustId(Integer custId);

    public int addReservation(Reservation reservation);

    public List<Reservation> queryAllReservation();
}
