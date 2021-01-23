package dao;

import pojo.Customer;
import pojo.Hotle;

import java.nio.charset.IllegalCharsetNameException;
import java.util.List;

/**
 * @author HuaHua
 * @create 2021-01-22 19:02
 */
public interface HotleDao {
    /**
     * 根据酒店名查询酒店信息
     * @param Name 消费者名
     * @return 如果返回 null,说明没有这个消费者。反之亦然
     */
    public Hotle queryHotleByName(String Name);

    public Hotle queryHolteById(Integer id);

    public int deleteHolteById(Integer id);
    /**
     * 保存酒店信息
     * @param hotle
     * @return 返回-1 表示操作失败，其他是 sql 语句影响的行数
     */
    public int addHotle(Hotle hotle);

    public int updateHotle(Hotle hotle);



    public List<Hotle> queryAllHotle();
}
