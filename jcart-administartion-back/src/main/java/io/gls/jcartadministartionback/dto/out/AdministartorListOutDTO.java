package io.gls.jcartadministartionback.dto.out;

public class AdministartorListOutDTO {
    private Integer administartorId;
    private String username;
    private Byte status;
    private Long createTimestamp;

    public Integer getAdministartorId() {
        return administartorId;
    }

    public void setAdministartorId(Integer administartorId) {
        this.administartorId = administartorId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Long getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
    }
}
