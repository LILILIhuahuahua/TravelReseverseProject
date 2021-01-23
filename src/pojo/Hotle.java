package pojo;

/**
 * @author HuaHua
 * @create 2021-01-22 17:02
 */
public class Hotle {
    private Integer id;
    private String name;
    private String location;
    private Integer price;
    private Integer numRooms;
    private Integer numAvail; //剩余的酒店房间数

    @Override
    public String toString() {
        return "hotle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", price=" + price +
                ", numRooms=" + numRooms +
                ", numAvail=" + numAvail +
                '}';
    }

    public Hotle(Integer id, String name, String location, Integer price, Integer numRooms, Integer numAvail) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.price = price;
        this.numRooms = numRooms;
        this.numAvail = numAvail;
    }

    public Hotle() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Integer getNumRooms() {
        return numRooms;
    }

    public void setNumRooms(Integer numRooms) {
        this.numRooms = numRooms;
    }

    public Integer getNumAvail() {
        return numAvail;
    }

    public void setNumAvail(Integer numAvail) {
        this.numAvail = numAvail;
    }

}
