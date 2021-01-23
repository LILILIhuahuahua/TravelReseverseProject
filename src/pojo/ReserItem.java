package pojo;

/**
 * @author HuaHua
 * @create 2021-01-23 20:08
 */
public class ReserItem {
    public Integer id;
    public String resvType;
    public String resvDetail;
    public Integer price;

    public ReserItem(Integer id, String resvType, String resvDetail, Integer price) {
        this.id = id;
        this.resvType = resvType;
        this.resvDetail = resvDetail;
        this.price = price;
    }

    public ReserItem() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResvType() {
        return resvType;
    }

    public void setResvType(String resvType) {
        this.resvType = resvType;
    }

    public String getResvDetail() {
        return resvDetail;
    }

    public void setResvDetail(String resvDetail) {
        this.resvDetail = resvDetail;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
