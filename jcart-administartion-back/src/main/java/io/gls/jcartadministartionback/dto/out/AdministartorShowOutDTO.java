package io.gls.jcartadministartionback.dto.out;

public class AdministartorShowOutDTO {
    private Integer administartorId;
    private String username;
    private String email;
    private String avatarUrl;
    private Byte status;

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
}
