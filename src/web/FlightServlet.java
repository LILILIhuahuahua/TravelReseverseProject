package web;

import pojo.Customer;
import pojo.Flight;
import pojo.Reservation;
import service.CustomerService;
import service.FlightService;
import service.ReservationService;
import service.impl.CustomerServiceImpl;
import service.impl.FlightServiceImpl;
import service.impl.ReservationServiceImpl;
import utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author HuaHua
 * @create 2021-01-24 17:56
 */
public class FlightServlet extends BaseServlet{
    FlightService flightService = new FlightServiceImpl();
    CustomerService customerService = new CustomerServiceImpl();
    ReservationService reservationService = new ReservationServiceImpl();


    protected void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("listAllFlight");
        //1.通过customerService查询全部Flight
        List<Flight> flightList =  flightService.queryAllFlight();

        //2 把全部航班保存到 Request 域中
        req.setAttribute("flightList", flightList);

        //3、请求转发到/pages/manager/customer_manager.jsp 页面
        req.getRequestDispatcher("/pages/manager/flight_manager.jsp").forward(req,resp);

    }


    protected void resevaseFlight(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("resevaseFlight");
        //1.获取flight对象
        Flight flight = WebUtils.copyParamToBean(req.getParameterMap(),new Flight());
        System.out.println(flight);

        //2.获取custName
        String custName = req.getParameter("custName");
        Customer customer = customerService.queryCustomerBycustName(custName);
        System.out.println(customer);

        String result;
        if(customer!=null){
            //3.flight的剩余座位数量减少，更新flight
            flight.setNumAvail(flight.getNumAvail()-1);
            flightService.updateFlight(flight);
            System.out.println(flight);

            //4.写进reservation表中
            Reservation reservation = new Reservation(0,customer.getId(),"flight",flight.getId());
            reservationService.addReservation(reservation);
            System.out.println(reservation);
            result = "预定成功";
            req.setAttribute("result",result);

        }else{
            result = "预定失败，请检查预定客户名称";
            req.setAttribute("result",result);
        }
        //5.请求转发到/pages/manager/customer_manager.jsp 页面
        req.getRequestDispatcher("/pages/manager/flightServlet?action=list").forward(req,resp);

    }

}
