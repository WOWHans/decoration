package me.nithans.decoration.common.enums;

public enum ResponseCode {

    USER_NOT_LOGIN(10001,"用户未登录"),
    USER_NO_AUTHORITY(10002,"用户未授权"),
    USER_PASSWORD_ERROR(10003,"密码错误"),
    USER_ACCOUNT_NOTEXIST(10004,"账号不存在"),
    USER_ACCOUNT_DISABLED(10005,"账号被禁用"),
    NOKNOWN_ERROR(19999,"其他错误"),

    ORDER_CREATE_ERROR(11000,"订单创建失败"),
    MATERIAL_CREATE_ERROR(110001,"材料保存失败");

    private Integer code;
    private String msg;

    ResponseCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
