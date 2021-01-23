package dao.impl;

import dao.BaseDao;
import dao.ReservationsDao;
import pojo.Hotle;
import pojo.Reservation;

import java.util.List;

/**
 * @author HuaHua
 * @create 2021-01-22 19:52
 */
public class ReservationDaoImpl extends BaseDao implements ReservationsDao {
    @Override
    public Reservation queryReservationByresvKey(Integer resvKey) {
        String sql = "select `resvKey` ,`custId` , `resvType` , `resvId` from t_reservations where resvKey = ?";
        return queryForOne(Reservation.class, sql,resvKey);
    }

    @Override
    public Reservation queryReservationBycustId(Integer custId) {
        String sql = "select `resvKey` ,`custId` , `resvType` , `` from t_reservations where custId = ?";
        return queryForOne(Reservation.class, sql,custId);
    }

    @Override
    public int deleteReservationBycustId(Integer custId) {
        String sql = "delete from t_reservations where custId = ?";
        return update(sql,custId);
    }

    @Override
    public int addReservation(Reservation reservation) {
        String sql = "insert into t_reservations(`custId`,`resvType`,`resvId`) values(?,?,?) ";
        return update(sql,reservation.getCustId(),reservation.getResvType(),reservation.getResvId());
    }

    @Override
    public List<Reservation> queryAllReservation() {
        String sql = "select `resvKey` ,`custId` , `resvType` , `resvId` from t_reservations ";
        return queryForList(Reservation.class, sql);
    }
}
