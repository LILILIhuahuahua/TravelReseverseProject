package service;

import pojo.Customer;

import java.util.List;

/**
 * @author HuaHua
 * @create 2021-01-22 20:32
 */
public interface CustomerService {
    public void addCustomer(Customer customer);

    public int deleteCustomerBycustName(String  custName);

    public List<Customer> queryAllCustomer();

    public Customer queryCustomerBycustName(String custName);

    public int updateCustomer(Customer customer);

}
