package pojo;

/**
 * @author HuaHua
 * @create 2021-01-22 17:08
 */
public class Reservation {
    private Integer resvKey;
    private Integer custId;
    private String resvType;
    private Integer resvId;

    @Override
    public String toString() {
        return "reservation{" +
                "resvKey=" + resvKey +
                ", custId=" + custId +
                ", resvType=" + resvType +
                ", resvId=" + resvId +
                '}';
    }

    public Reservation(Integer resvKey, Integer custId, String resvType, Integer resvId) {
        this.resvKey = resvKey;
        this.custId = custId;
        this.resvType = resvType;
        this.resvId = resvId;
    }

    public Reservation() {
    }

    public Integer getResvKey() {
        return resvKey;
    }

    public void setResvKey(Integer resvKey) {
        this.resvKey = resvKey;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getResvType() {
        return resvType;
    }

    public void setResvType(String resvType) {
        this.resvType = resvType;
    }

    public Integer getResvId() {
        return resvId;
    }

    public void setResvId(Integer resvId) {
        this.resvId = resvId;
    }
}
