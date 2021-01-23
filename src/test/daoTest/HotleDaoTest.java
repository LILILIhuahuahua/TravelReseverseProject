package test.daoTest;

import dao.HotleDao;
import dao.impl.HotleDaoImpl;
import org.junit.Test;
import pojo.Hotle;

import java.util.List;

/**
 * @author HuaHua
 * @create 2021-01-22 19:23
 */
public class HotleDaoTest {
    HotleDao hotleDao  = new HotleDaoImpl();
    @Test
    public void queryHotleByName() {
        System.out.println(hotleDao.queryHotleByName("西米"));
    }

    @Test
    public void queryHolteById() {
        System.out.println(hotleDao.queryHolteById(2));
    }

    @Test
    public void deleteHolteById() {
        hotleDao.deleteHolteById(1);
    }

    @Test
    public void addHotle() {
        Hotle hotle = new Hotle(2,"文辉人才","合肥",150,50,30);
        hotleDao.addHotle(hotle);
    }

    @Test
    public void updateHotle() {
        Hotle hotle = new Hotle(4,"文辉人才","北京",300,100,50);
        System.out.println(hotleDao.updateHotle(hotle));
    }

    @Test
    public void queryAllHotle() {
        List<Hotle> hotles = hotleDao.queryAllHotle();
        for(Hotle hotle:hotles){
            System.out.println(hotle);
        }
    }
}