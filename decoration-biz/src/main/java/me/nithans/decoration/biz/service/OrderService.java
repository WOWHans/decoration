package me.nithans.decoration.biz.service;

import java.util.List;
import me.nithans.decoration.dal.domain.decoration.Order;
import me.nithans.decoration.dal.domain.decoration.OrderDetail;
import me.nithans.decoration.dal.pojo.vo.OrderDetailVO;

public interface OrderService {

    List<Order> findOrdersByUserId(Integer userId);

    boolean createOrder(OrderDetailVO orderDetailVO);

    List<OrderDetail> findOrderDetailByUserId(Integer userId);
}
