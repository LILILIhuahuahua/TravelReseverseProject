package web;

import pojo.Car;
import pojo.Customer;
import pojo.Flight;
import pojo.Reservation;
import service.CarService;
import service.CustomerService;
import service.HotleService;
import service.ReservationService;
import service.impl.CarServiceImpl;
import service.impl.CustomerServiceImpl;
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
 * @create 2021-01-24 20:35
 */
public class CarServlet extends BaseServlet {
    HotleService hotleService = new HotleServiceImpl();
    CustomerService customerService = new CustomerServiceImpl();
    ReservationService reservationService = new ReservationServiceImpl();
    CarService carService = new CarServiceImpl();

    protected void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("listAllCar");
        //1.通过customerService查询全部Car
        List<Car> carList =  carService.queryAllCar();

        //2 把全部Car保存到 Request 域中
        req.setAttribute("carList", carList);

        //3、请求转发到/pages/manager/customer_manager.jsp 页面
        req.getRequestDispatcher("/pages/manager/car_manager.jsp").forward(req,resp);

    }

    protected void resevaseCar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("resevaseCar");
        //1.获取car对象
        Car car = WebUtils.copyParamToBean(req.getParameterMap(),new Car());
        System.out.println(car);

        //2.获取custName
        String custName = req.getParameter("custName");
        Customer customer = customerService.queryCustomerBycustName(custName);
        System.out.println(customer);

        String result;
        if(customer!=null){
            //3.flight的剩余座位数量减少，更新flight
            car.setNumAvail(car.getNumAvail()-1);
            carService.updateCar(car);
            System.out.println(car);

            //4.写进reservation表中
            Reservation reservation = new Reservation(0,customer.getId(),"car",car.getId());
            reservationService.addReservation(reservation);
            System.out.println(reservation);
            result = "预定成功";
            req.setAttribute("result",result);

        }else{
            result = "预定失败，请检查预定客户名称";
            req.setAttribute("result",result);
        }
        //5.请求转发到/pages/manager/customer_manager.jsp 页面
        req.getRequestDispatcher("/pages/manager/carServlet?action=list").forward(req,resp);

    }

}
