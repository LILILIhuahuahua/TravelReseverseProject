package service.impl;

import dao.CustomerDao;
import dao.impl.CustomerDaoImpl;
import pojo.Customer;
import service.CustomerService;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;
import java.util.List;

/**
 * @author HuaHua
 * @create 2021-01-22 20:36
 */
public class CustomerServiceImpl implements CustomerService {
    CustomerDao customerDao = new CustomerDaoImpl();
    @Override
    public void addCustomer(Customer customer) {
        customerDao.saveCustomer(customer);
    }

    @Override
    public int deleteCustomerBycustName(String custName) {
        return customerDao.deleteCustomerBycustName(custName);
    }

    @Override
    public List<Customer> queryAllCustomer() {
        return customerDao.queryAllCustomer();
    }

    @Override
    public Customer queryCustomerBycustName(String custName) {
        return customerDao.queryCustomerBycustName(custName);
    }

    @Override
    public int updateCustomer(Customer customer) {
        return customerDao.updateCustomer(customer);
    }


}
