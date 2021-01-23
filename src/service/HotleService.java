package service;

import pojo.Hotle;

import java.util.List;

/**
 * @author HuaHua
 * @create 2021-01-23 16:46
 */
public interface HotleService {
    public Hotle queryHotleByName(String Name);

    public Hotle queryHolteById(Integer id);

    public int deleteHolteById(Integer id);

    public int addHotle(Hotle hotle);

    public int updateHotle(Hotle hotle);



    public List<Hotle> queryAllHotle();
}
