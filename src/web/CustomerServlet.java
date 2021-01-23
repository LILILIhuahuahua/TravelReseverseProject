package web;

import pojo.Customer;
import service.CustomerService;
import service.impl.CustomerServiceImpl;
import utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.print.Book;
import java.io.IOException;
import java.util.List;

/**
 * @author HuaHua
 * @create 2021-01-22 20:59
 */
public class CustomerServlet extends BaseServlet{
    //业务层服务对象
    CustomerService customerService = new CustomerServiceImpl();

    protected void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("listAllCustomer");
        //1.通过customerService查询全部customer
        List<Customer> customerList =  customerService.queryAllCustomer();

        //2 把全部图书保存到 Request 域中
        req.setAttribute("customerList", customerList);

        //3、请求转发到/pages/manager/customer_manager.jsp 页面
        req.getRequestDispatcher("/pages/manager/customer_manager.jsp").forward(req,resp);

    }
    protected void addCustomer(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1、获取请求的参数
        String custName = req.getParameter("custName");
        System.out.println(custName);

        //使用注入之后，不需要再一个个去获得req中的参数
        //使用WebUtil工具类完成Bean属性的注入
        Customer customer =  WebUtils.copyParamToBean(req.getParameterMap(),new Customer());
        customerService.addCustomer(customer);
        System.out.println(customer);

        //3、请求转发到/pages/manager/customer_manager.jsp 页面
        //重定向是两次操作
        resp.sendRedirect(req.getContextPath()+ "/pages/manager/customerServlet?action=list");

    }

    protected void getCustomer(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("getCustomer方法");
        //1 获取请求的参数用户名
        String custName = req.getParameter("custName");

        //2 调用 customerService.queryCustomerBycustName 查询用户
        Customer customer = customerService.queryCustomerBycustName(custName);

        //3 保存到图书到 Request 域中
        req.setAttribute("customer", customer) ;
        //4 请求转发到。pages/manager/customer_edit.jsp 页面
        req.getRequestDispatcher("/pages/manager/customer_edit.jsp").forward(req,resp);
    }

    protected void deleteCustomer(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("deleteCustomer");

        //1.获取客户端请求删除custName
        String custName = req.getParameter("custName");
        // 2、调用 customerService.deleteCustomerBycustName();删除图书
        customerService.deleteCustomerBycustName(custName);
        //3、请求转发到/pages/manager/customer_manager.jsp 页面
        //重定向是两次操作
        resp.sendRedirect(req.getContextPath()+ "/pages/manager/customerServlet?action=list");

    }

    protected void updateCustomer(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("updateCustomer");
        // 1、客户端更新Book的请求的参数==封装成为 Book 对象
        Customer customer = WebUtils.copyParamToBean(req.getParameterMap(),new Customer());
        System.out.println(customer);
        // 2、调用 BookService.updateBook( book );修改图书
        customerService.updateCustomer(customer);
        //3、请求转发到/pages/manager/customer_manager.jsp 页面
        //重定向是两次操作
        resp.sendRedirect(req.getContextPath()+ "/pages/manager/customerServlet?action=list");


    }
}
