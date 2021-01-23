package dao.impl;

import dao.BaseDao;
import dao.CustomerDao;
import pojo.Customer;
import pojo.Hotle;

import java.util.List;

/**
 * @author HuaHua
 * @create 2021-01-22 18:39
 */
public class CustomerDaoImpl extends BaseDao implements CustomerDao {
    @Override
    public Customer queryCustomerBycustName(String custName) {
        String sql = "select `id`,`custName` from t_customers where custName =?";
        return queryForOne(Customer.class,sql,custName);
    }

    @Override
    public int saveCustomer(Customer customer) {
        String sql = "insert into t_customers(`custName`) values(?)";
        return update(sql, customer.getCustName());
    }

    @Override
    public int deleteCustomerBycustName(String  custName) {
        String sql = "delete from t_customers where  custName= ?";
        return update(sql,custName);
    }

    @Override
    public List<Customer> queryAllCustomer() {
        String sql = "select `id`,`custName` from t_customers";
        return queryForList(Customer.class, sql);
    }

    @Override
    public int updateCustomer(Customer customer) {
        String sql = "update t_customers set `custName`=? where id = ?";
        return update(sql,customer.getCustName(),customer.getId());
    }
}
