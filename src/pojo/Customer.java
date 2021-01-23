package pojo;

/**
 * @author HuaHua
 * @create 2021-01-22 17:06
 */
public class Customer {
    private Integer id;
    public String custName;

    @Override
    public String toString() {
        return "customer{" +
                "id=" + id +
                ", custName='" + custName + '\'' +
                '}';
    }

    public Customer(String custName) {
        this.custName = custName;
    }

    public Customer(Integer id, String custName) {
        this.id = id;
        this.custName = custName;
    }

    public Customer() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }
}
