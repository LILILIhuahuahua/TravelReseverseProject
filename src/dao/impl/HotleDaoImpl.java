package dao.impl;

import dao.BaseDao;
import pojo.Hotle;

import java.awt.print.Book;
import java.util.Base64;
import java.util.List;

/**
 * @author HuaHua
 * @create 2021-01-22 19:10
 */
public class HotleDaoImpl extends BaseDao implements dao.HotleDao {
    @Override
    public Hotle queryHotleByName(String Name) {
        String sql = "select `location` , `price` , `numRooms` , `numAvail` , `NAME` from t_hotles where Name = ?";
        return queryForOne(Hotle.class, sql,Name);
    }

    @Override
    public Hotle queryHolteById(Integer id) {
        String sql = "select `location` , `price` , `numRooms` , `numAvail` , `NAME` from t_hotles where id = ?";
        return queryForOne(Hotle.class, sql,id);
    }

    @Override
    public int deleteHolteById(Integer id) {
        String sql = "delete from t_hotles where id = ?";
        return update(sql,id);
    }

    @Override
    public int addHotle(Hotle hotle) {
        String sql = "insert into t_hotles(`location`,`price`,`numRooms`,`numAvail`,`NAME`) values(?,?,?,?,?) ";
        return update(sql,hotle.getLocation(),hotle.getPrice(),hotle.getNumRooms(),hotle.getNumAvail(),hotle.getName());
    }

    @Override
    public int updateHotle(Hotle hotle) {
        String sql = "update t_hotles set `location`=?,`price`=?,`numRooms`=?,`numAvail`=?,`NAME`=? where id = ?";
        return update(sql,hotle.getLocation(),hotle.getPrice(),hotle.getNumRooms(),hotle.getNumAvail(),hotle.getName(),hotle.getId());
    }

    @Override
    public List<Hotle> queryAllHotle() {
        String sql = "select `id` ,`location` , `price` , `numRooms` , `numAvail` , `NAME` from t_hotles";
        return queryForList(Hotle.class, sql);
    }
}
