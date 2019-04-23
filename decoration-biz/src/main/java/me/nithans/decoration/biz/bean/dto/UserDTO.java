package me.nithans.decoration.biz.bean.dto;

import java.io.Serializable;

public class UserDTO implements Serializable {

  private Integer userId;
  private String userName;
  private String email;
  private String telephone;
  private Byte status;

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public Byte getStatus() {
    return status;
  }

  public void setStatus(Byte status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "UserDTO{" +
        "userId=" + userId +
        ", userName='" + userName + '\'' +
        ", email='" + email + '\'' +
        ", telephone='" + telephone + '\'' +
        ", status=" + status +
        '}';
  }
}
