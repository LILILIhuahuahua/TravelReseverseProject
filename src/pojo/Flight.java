package pojo;

/**
 *
 * @author HuaHua
 * @create 2021-01-22 16:58
 */

//Bean类：flight
public class Flight {
    private Integer id;
    private Integer flightNum;
    private Integer price;
    private Integer numSeats;
    private Integer numAvail; //剩余位子数
    private String  fromCity;
    private String  arivCity;

    @Override
    public String toString() {
        return super.toString();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(Integer flightNum) {
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
