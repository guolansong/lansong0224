package io.gls.jcartstoreback.dto.in;

public class AddressCreateInDTO {
    private Integer customerId;
    private String receiverName;
    private String receiverMobile;
    private String contentl;
    private String tag;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    public String getContentl() {
        return contentl;
    }

    public void setContentl(String contentl) {
        this.contentl = contentl;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
