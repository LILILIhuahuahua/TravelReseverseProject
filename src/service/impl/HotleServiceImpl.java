package service.impl;

import dao.HotleDao;
import dao.impl.HotleDaoImpl;
import pojo.Hotle;
import service.HotleService;

import java.util.List;

/**
 * @author HuaHua
 * @create 2021-01-23 16:47
 */
public class HotleServiceImpl implements HotleService {
    HotleDao hotleDao = new HotleDaoImpl();
    @Override
    public Hotle queryHotleByName(String Name) {
        return null;
    }

    @Override
    public Hotle queryHolteById(Integer id) {
        return hotleDao.queryHolteById(id);
    }

    @Override
    public int deleteHolteById(Integer id) {
        return 0;
    }

    @Override
    public int addHotle(Hotle hotle) {
        return 0;
    }

    @Override
    public int updateHotle(Hotle hotle) {
        return hotleDao.updateHotle(hotle);
    }

    @Override
    public List<Hotle> queryAllHotle() {
        return hotleDao.queryAllHotle();
    }
}
