package pojo;

import java.util.List;

/**
 * @author HuaHua
 * @create 2021-01-23 20:05
 */
public class ReserDetail {
    public Integer sumPrice;
    public Customer customer;
    public List<ReserItem> reserItems;


    public int setSumPrice(){
        int sumPrice=  0;
        for(ReserItem reserItem:reserItems){
            sumPrice+=reserItem.price;
        }
        this.sumPrice = sumPrice;
        return this.sumPrice;
    }

    public ReserDetail(Integer sumPrice, Customer customer, List<ReserItem> reserItems) {
        this.sumPrice = sumPrice;
        this.customer = customer;
        this.reserItems = reserItems;
    }

    public ReserDetail() {
    }

    @Override
    public String toString() {
        return "ReserDetail{" +
                "sumPrice=" + sumPrice +
                ", customer=" + customer +
                ", reserItems=" + reserItems +
                '}';
    }

    public Integer getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(Integer sumPrice) {
        this.sumPrice = sumPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<ReserItem> getReserItems() {
        return reserItems;
    }

    public void setReserItems(List<ReserItem> reserItems) {
        this.reserItems = reserItems;
    }
}
