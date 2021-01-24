package pojo;

/**
 * @author HuaHua
 * @create 2021-01-22 17:04
 */
public class Car {
    private Integer id;
    private String location;
    private Integer price;
    private Integer numCars;
    private Integer numAvail;

    public Car() {
    }

    @Override
    public String toString() {
        return "car{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", price=" + price +
                ", numCars=" + numCars +
                ", numAvail=" + numAvail +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getNumCars() {
        return numCars;
    }

    public void setNumCars(Integer numCars) {
        this.numCars = numCars;
    }

    public Integer getNumAvail() {
        return numAvail;
    }

    public void setNumAvail(Integer numAvail) {
        this.numAvail = numAvail;
    }
}
