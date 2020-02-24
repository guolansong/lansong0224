package io.gls.jcartadministartionback.dto.out;

public class AdministratorGetProfileOutDTO {
    private Integer administratorId;
    private String username;
    private String realName;
    private String email;
    private String avatarUrl;
    private Byte status;
    private Long creteTimestamp;

    public Integer getAdministratorId() {
        return administratorId;
    }

    public void setAdministratorId(Integer administratorId) {
        this.administratorId = administratorId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Long getCreteTimestamp() {
        return creteTimestamp;
    }

    public void setCreteTimestamp(Long creteTimestamp) {
        this.creteTimestamp = creteTimestamp;
    }
}
