package me.nithans.decoration.dal.pojo.vo;

import lombok.Data;
import me.nithans.decoration.dal.domain.decoration.OrderDetail;

@Data
public class OrderDetailVO {

    private Integer userId;
    private OrderDetail orderDetail;

}
