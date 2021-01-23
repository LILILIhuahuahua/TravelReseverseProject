package test.ServiceTest;

import org.junit.Test;
import pojo.Customer;
import service.CustomerService;
import service.impl.CustomerServiceImpl;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author HuaHua
 * @create 2021-01-22 20:55
 */
public class CustomerServiceTest {
    CustomerService customerService = new CustomerServiceImpl();
    @Test
    public void addCustomer() {
        Customer customer = new Customer("lixianhua");
        customerService.addCustomer(customer);

    }

    @Test
    public void deleteCustomerBycustName() {
        customerService.deleteCustomerBycustName("黎先桦");
    }

    @Test
    public void queryAllCustomer() {
        List<Customer> customers = customerService.queryAllCustomer();
        for(Customer customer:customers){
            System.out.println(customer);
        }
    }

    @Test
    public void queryCustomerBycustName() {
    }
}