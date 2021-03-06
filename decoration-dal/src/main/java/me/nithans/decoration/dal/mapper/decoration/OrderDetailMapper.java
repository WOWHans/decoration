package me.nithans.decoration.dal.mapper.decoration;

import java.util.List;
import me.nithans.decoration.dal.domain.decoration.OrderDetail;
import me.nithans.decoration.dal.domain.decoration.OrderDetailCriteria;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface OrderDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_order_detail
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    long countByExample(OrderDetailCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_order_detail
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    int deleteByExample(OrderDetailCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_order_detail
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_order_detail
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    int insert(OrderDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_order_detail
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    int insertSelective(OrderDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_order_detail
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    List<OrderDetail> selectByExampleWithRowbounds(OrderDetailCriteria example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_order_detail
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    List<OrderDetail> selectByExample(OrderDetailCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_order_detail
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    OrderDetail selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_order_detail
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    int updateByExampleSelective(@Param("record") OrderDetail record, @Param("example") OrderDetailCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_order_detail
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    int updateByExample(@Param("record") OrderDetail record, @Param("example") OrderDetailCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_order_detail
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    int updateByPrimaryKeySelective(OrderDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_order_detail
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    int updateByPrimaryKey(OrderDetail record);
}