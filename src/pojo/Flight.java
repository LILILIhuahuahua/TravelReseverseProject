package pojo;

/**
 *
 * @author HuaHua
 * @create 2021-01-22 16:58
 */

//Bean类：flight
public class Flight {
    private Integer id;
    private String flightNum;
    private Integer price;
    private Integer numSeats;
    private Integer numAvail; //剩余位子数
    private String  fromCity;
    private String  arivCity;

    public Flight(Integer id, String flightNum, Integer price, Integer numSeats, Integer numAvail, String fromCity, String arivCity) {
        this.id = id;
        this.flightNum = flightNum;
        this.price = price;
        this.numSeats = numSeats;
        this.numAvail = numAvail;
        this.fromCity = fromCity;
        this.arivCity = arivCity;
    }

    public Flight() {
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", flightNum='" + flightNum + '\'' +
                ", price=" + price +
                ", numSeats=" + numSeats +
                ", numAvail=" + numAvail +
                ", fromCity='" + fromCity + '\'' +
                ", arivCity='" + arivCity + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(Integer numSeats) {
        this.numSeats = numSeats;
    }

    public Integer getNumAvail() {
        return numAvail;
    }

    public void setNumAvail(Integer numAvail) {
        this.numAvail = numAvail;
    }

    public String getFromCity() {
        return fromCity;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    public String getArivCity() {
        return arivCity;
    }

    public void setArivCity(String arivCity) {
        this.arivCity = arivCity;
    }
}
