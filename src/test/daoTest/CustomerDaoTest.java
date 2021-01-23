package test.daoTest;

import dao.CustomerDao;
import dao.impl.CustomerDaoImpl;
import org.junit.Test;
import pojo.Customer;

import java.util.List;

/**
 * @author HuaHua
 * @create 2021-01-22 18:45
 */
public class CustomerDaoTest {
    CustomerDao customerDao = new CustomerDaoImpl();

    @Test
    public void deleteCustomerBycustName(){
        customerDao.deleteCustomerBycustName("");
    }
    @Test
    public void queryCustomerBycustName() {
        Customer customer = customerDao.queryCustomerBycustName("lixianhua");
        if(customer!=null){
            System.out.println(customer);
        }else{
            System.out.println("查询失败");
        }

    }

    @Test
    public void saveCustomer() {
        Customer customer = new Customer("lixianhua");
        int result = customerDao.saveCustomer(customer);
        System.out.println(result);
    }

    @Test
    public void queryAllCustomer(){
        List<Customer> customers = customerDao.queryAllCustomer();
        for(Customer customer:customers){
            System.out.println(customer);
        }
    }
    @Test
    public void updateCustomer(){
        customerDao.updateCustomer(new Customer(5,"asdas"));
    }
}