package me.nithans.decoration.biz.service.impl;

import me.nithans.decoration.biz.service.OrderService;
import me.nithans.decoration.dal.domain.decoration.Order;
import me.nithans.decoration.dal.domain.decoration.OrderCriteria;
import me.nithans.decoration.dal.domain.decoration.OrderDetail;
import me.nithans.decoration.dal.domain.decoration.OrderDetailCriteria;
import me.nithans.decoration.dal.mapper.decoration.OrderDetailMapper;
import me.nithans.decoration.dal.mapper.decoration.OrderMapper;
import me.nithans.decoration.dal.pojo.vo.OrderDetailVO;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private OrderDetailMapper orderDetailMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean createOrder(OrderDetailVO orderDetailVO) {
        // 订单号 username+时间戳
        String orderSn = ((String) SecurityUtils.getSubject().getPrincipal()).concat(String.valueOf(System.currentTimeMillis()));
        OrderDetail orderDetail = orderDetailVO.getOrderDetail();
        orderDetail.setOrderSn(orderSn);
        Order order = new Order();
        order.setOrderSn(orderSn);
        order.setUserId(orderDetailVO.getUserId());
        orderMapper.insertSelective(order);
        orderDetailMapper.insertSelective(orderDetail);
        return true;
    }

    @Override
    public List<Order> findOrdersByUserId(Integer userId) {
        OrderCriteria criteria = new OrderCriteria();
        criteria.createCriteria().andUserIdEqualTo(userId);
        return orderMapper.selectByExample(criteria);
    }

    @Override
    public List<OrderDetail> findOrderDetailByUserId(Integer userId) {
        OrderCriteria orderCriteria = new OrderCriteria();
        orderCriteria.createCriteria().andUserIdEqualTo(userId);
        List<Order> orderList = orderMapper.selectByExample(orderCriteria);
        List<String> orderIdList = orderList.stream().map(item -> item.getOrderSn()).collect(Collectors.toList());

        OrderDetailCriteria detailCriteria = new OrderDetailCriteria();
        detailCriteria.createCriteria().andOrderSnIn(orderIdList);
        List<OrderDetail> detailList =  orderDetailMapper.selectByExample(detailCriteria);
        return detailList;
    }
}
