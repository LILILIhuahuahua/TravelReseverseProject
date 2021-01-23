package dao;
import pojo.Customer;
import pojo.Reservation;

import java.awt.print.Book;
import java.util.List;

/**
 * @author HuaHua
 * @create 2021-01-22 18:34
 */
public interface CustomerDao {
    /**
     * 根据消费者名查询消费者信息
     * @param custName 消费者名
     * @return 如果返回 null,说明没有这个消费者。反之亦然
     */
    public Customer queryCustomerBycustName(String custName);

    /**
     * 保存消费者信息
     * @param customer
     * @return 返回-1 表示操作失败，其他是 sql 语句影响的行数
     */
    public int saveCustomer(Customer customer);

    public int deleteCustomerBycustName(String  custName);

    public List<Customer> queryAllCustomer();
    public int updateCustomer(Customer customer);
}
