package me.nithans.decoration.biz.bean.dto;

import java.io.Serializable;
import java.util.List;
import me.nithans.decoration.biz.bean.vo.ResourceVO;
import me.nithans.decoration.dal.domain.decoration.Role;

public class UserDTO implements Serializable {

  private Integer userId;
  private String userName;
  private String email;
  private String telephone;
  private Byte status;
  private String cookie;
  private List<Role> roles;
  private List<ResourceVO> menuTree;

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

  public String getCookie() {
    return cookie;
  }

  public void setCookie(String cookie) {
    this.cookie = cookie;
  }

  public List<Role> getRoles() {
    return roles;
  }

  public void setRoles(List<Role> roles) {
    this.roles = roles;
  }

  public List<ResourceVO> getMenuTree() {
    return menuTree;
  }

  public void setMenuTree(List<ResourceVO> menuTree) {
    this.menuTree = menuTree;
  }

  @Override
  public String toString() {
    return "UserDTO{" +
        "userId=" + userId +
        ", userName='" + userName + '\'' +
        ", email='" + email + '\'' +
        ", telephone='" + telephone + '\'' +
        ", status=" + status +
        ", cookie='" + cookie + '\'' +
        ", roles=" + roles +
        ", menuTree=" + menuTree +
        '}';
  }
}
