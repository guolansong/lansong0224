package io.gls.jcartadministartionback.dto.in;

public class OrderSearchInDTO {
    private Integer oderId;
    private String customerName;
    private Byte status;
    private Double tatalPrice;

    public Integer getOderId() {
        return oderId;
    }

    public void setOderId(Integer oderId) {
        this.oderId = oderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Double getTatalPrice() {
        return tatalPrice;
    }

    public void setTatalPrice(Double tatalPrice) {
        this.tatalPrice = tatalPrice;
    }
}
