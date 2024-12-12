package entities;

import java.util.Objects;

public class Sale {
    private Integer month;
    private Integer year;
    private String seller;
    private Integer items;
    private Double total;

    public Sale(Integer month, Integer year,String seller, Integer items, Double total) {
        this.month = month;
        this.total = total;
        this.items = items;
        this.seller = seller;
        this.year = year;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Integer getItems() {
        return items;
    }

    public void setItems(Integer items) {
        this.items = items;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "" + month + "/"+
                year +
                ", seller='" + seller + '\'' +
                ", items=" + items +
                ", pm=" + averagePrice();
    }

    public Double averagePrice(){
        return total/items;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Sale sale)) return false;
        return Objects.equals(getMonth(), sale.getMonth()) && Objects.equals(getYear(), sale.getYear()) && Objects.equals(getSeller(), sale.getSeller()) && Objects.equals(getItems(), sale.getItems()) && Objects.equals(getTotal(), sale.getTotal());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMonth(), getYear(), getSeller(), getItems(), getTotal());
    }
}

