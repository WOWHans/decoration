package me.nithans.decoration.biz.service;

import me.nithans.decoration.dal.domain.decoration.Order;
import me.nithans.decoration.dal.domain.decoration.OrderDetail;
import me.nithans.decoration.dal.pojo.vo.OrderDetailVO;

import java.util.List;

public interface OrderService {

    List<Order> findOrdersByUserId(Integer userId);

    boolean createOrder(OrderDetailVO orderDetailVO);

    List<OrderDetail> findOrderDetailByUserId(Integer userId);
}
