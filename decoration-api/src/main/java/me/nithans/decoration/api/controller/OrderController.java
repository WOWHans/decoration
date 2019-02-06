package me.nithans.decoration.api.controller;

import me.nithans.decoration.api.bean.ResultInfo;
import me.nithans.decoration.biz.service.OrderService;
import me.nithans.decoration.dal.domain.decoration.Order;
import me.nithans.decoration.dal.domain.decoration.OrderDetail;
import me.nithans.decoration.dal.pojo.vo.OrderDetailVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static me.nithans.decoration.common.enums.ResponseCode.ORDER_CREATE_ERROR;

@RestController
public class OrderController extends AbstractController {

    @Autowired
    private OrderService orderService;

    /**
     * 创建订单
     *
     * @param vo
     * @return
     */
    @PostMapping("/order")
    public ResultInfo<?> createOrder(@RequestBody OrderDetailVO vo) {
        if (orderService.createOrder(vo) == true) {
            return super.renderSuccess();
        } else {
            return super.renderError(ORDER_CREATE_ERROR.getCode(), ORDER_CREATE_ERROR.getMsg());
        }
    }

    /**
     * 获取订单列表
     * @param userId
     * @return
     */
    @GetMapping("/orders")
    public ResultInfo<?> getOrders(@RequestParam("userId") Integer userId) {
        List<Order> orderList = orderService.findOrdersByUserId(userId);
        return super.renderResult(orderList);
    }

    /**
     * 获取订单详情列表
     * @param userId
     * @return
     */
    @GetMapping("/orders/detail")
    public ResultInfo<?> getOrderDetailList(@RequestParam("userId") Integer userId) {
        List<OrderDetail> detailList = orderService.findOrderDetailByUserId(userId);
        return super.renderResult(detailList);
    }

}