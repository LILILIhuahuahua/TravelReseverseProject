package web;

import pojo.Customer;
import pojo.Hotle;
import pojo.Reservation;
import service.CustomerService;
import service.ReservationService;
import service.impl.CustomerServiceImpl;
import service.HotleService;
import service.impl.HotleServiceImpl;
import service.impl.ReservationServiceImpl;
import utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author HuaHua
 * @create 2021-01-23 16:49
 */
public class HotleServlet extends BaseServlet  {
    HotleService hotleService = new HotleServiceImpl();
    CustomerService customerService = new CustomerServiceImpl();
    ReservationService reservationService = new ReservationServiceImpl();


    protected void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("listAllHotle");
        //1.通过customerService查询全部customer
        List<Hotle> hotleList =  hotleService.queryAllHotle();

        //2 把全部图书保存到 Request 域中
        req.setAttribute("hotleList", hotleList);

        //3、请求转发到/pages/manager/hotle_manager.jsp 页面
        req.getRequestDispatcher("/pages/manager/hotle_manager.jsp").forward(req,resp);

    }

    protected void resevaseHotle(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("resevaseHotle");
        //1.获取hotle对象
        Hotle hotle = WebUtils.copyParamToBean(req.getParameterMap(),new Hotle());
        System.out.println(hotle);

        //2.获取custName
        String custName = req.getParameter("custName");
        Customer customer = customerService.queryCustomerBycustName(custName);
        System.out.println(customer);

        String result;
        if(customer!=null){
            //3.hotle的剩余房间数量减少，更新hotle
            hotle.setNumAvail(hotle.getNumAvail()-1);
            hotleService.updateHotle(hotle);
            System.out.println(hotle);

            //4.写进reservation表中
            Reservation reservation = new Reservation(0,customer.getId(),"hotel",hotle.getId());
            reservationService.addReservation(reservation);
            System.out.println(reservation);
            result = "预定成功";
            req.setAttribute("result",result);

        }else{
            result = "预定失败，请检查预定客户名称";
            req.setAttribute("result",result);
        }
        //5.请求转发到/pages/manager/customer_manager.jsp 页面
        req.getRequestDispatcher("/pages/manager/hotleServlet?action=list").forward(req,resp);

    }

}
