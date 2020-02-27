package io.gls.jcartadministartionback.dto.in;

public class ReturnUpdateActionInDTO {
    private Integer retunId;
    private Byte action;

    public Integer getRetunId() {
        return retunId;
    }

    public void setRetunId(Integer retunId) {
        this.retunId = retunId;
    }

    public Byte getAction() {
        return action;
    }

    public void setAction(Byte action) {
        this.action = action;
    }
}
