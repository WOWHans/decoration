package me.nithans.decoration.dal.domain.decoration;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrderDetail implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_order_detail.id
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_order_detail.order_sn
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    private String orderSn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_order_detail.material_id
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    private Integer materialId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_order_detail.material_price
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    private BigDecimal materialPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_order_detail.material_count
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    private Integer materialCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_order_detail.pay_method
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    private Integer payMethod;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_order_detail.order_money
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    private BigDecimal orderMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_order_detail.pay_money
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    private BigDecimal payMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_order_detail.send_time
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    private Date sendTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_order_detail.receive_time
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    private Date receiveTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_order_detail.status
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_order_detail.create_time
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column decoration_order_detail.update_time
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table decoration_order_detail
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_order_detail.id
     *
     * @return the value of decoration_order_detail.id
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_order_detail.id
     *
     * @param id the value for decoration_order_detail.id
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_order_detail.order_sn
     *
     * @return the value of decoration_order_detail.order_sn
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    public String getOrderSn() {
        return orderSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_order_detail.order_sn
     *
     * @param orderSn the value for decoration_order_detail.order_sn
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_order_detail.material_id
     *
     * @return the value of decoration_order_detail.material_id
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    public Integer getMaterialId() {
        return materialId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_order_detail.material_id
     *
     * @param materialId the value for decoration_order_detail.material_id
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_order_detail.material_price
     *
     * @return the value of decoration_order_detail.material_price
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    public BigDecimal getMaterialPrice() {
        return materialPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_order_detail.material_price
     *
     * @param materialPrice the value for decoration_order_detail.material_price
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    public void setMaterialPrice(BigDecimal materialPrice) {
        this.materialPrice = materialPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_order_detail.material_count
     *
     * @return the value of decoration_order_detail.material_count
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    public Integer getMaterialCount() {
        return materialCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_order_detail.material_count
     *
     * @param materialCount the value for decoration_order_detail.material_count
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    public void setMaterialCount(Integer materialCount) {
        this.materialCount = materialCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_order_detail.pay_method
     *
     * @return the value of decoration_order_detail.pay_method
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    public Integer getPayMethod() {
        return payMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_order_detail.pay_method
     *
     * @param payMethod the value for decoration_order_detail.pay_method
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    public void setPayMethod(Integer payMethod) {
        this.payMethod = payMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_order_detail.order_money
     *
     * @return the value of decoration_order_detail.order_money
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    public BigDecimal getOrderMoney() {
        return orderMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_order_detail.order_money
     *
     * @param orderMoney the value for decoration_order_detail.order_money
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    public void setOrderMoney(BigDecimal orderMoney) {
        this.orderMoney = orderMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_order_detail.pay_money
     *
     * @return the value of decoration_order_detail.pay_money
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    public BigDecimal getPayMoney() {
        return payMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_order_detail.pay_money
     *
     * @param payMoney the value for decoration_order_detail.pay_money
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    public void setPayMoney(BigDecimal payMoney) {
        this.payMoney = payMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_order_detail.send_time
     *
     * @return the value of decoration_order_detail.send_time
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    public Date getSendTime() {
        return sendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_order_detail.send_time
     *
     * @param sendTime the value for decoration_order_detail.send_time
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_order_detail.receive_time
     *
     * @return the value of decoration_order_detail.receive_time
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    public Date getReceiveTime() {
        return receiveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_order_detail.receive_time
     *
     * @param receiveTime the value for decoration_order_detail.receive_time
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_order_detail.status
     *
     * @return the value of decoration_order_detail.status
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_order_detail.status
     *
     * @param status the value for decoration_order_detail.status
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_order_detail.create_time
     *
     * @return the value of decoration_order_detail.create_time
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_order_detail.create_time
     *
     * @param createTime the value for decoration_order_detail.create_time
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column decoration_order_detail.update_time
     *
     * @return the value of decoration_order_detail.update_time
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column decoration_order_detail.update_time
     *
     * @param updateTime the value for decoration_order_detail.update_time
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_order_detail
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", materialId=").append(materialId);
        sb.append(", materialPrice=").append(materialPrice);
        sb.append(", materialCount=").append(materialCount);
        sb.append(", payMethod=").append(payMethod);
        sb.append(", orderMoney=").append(orderMoney);
        sb.append(", payMoney=").append(payMoney);
        sb.append(", sendTime=").append(sendTime);
        sb.append(", receiveTime=").append(receiveTime);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}