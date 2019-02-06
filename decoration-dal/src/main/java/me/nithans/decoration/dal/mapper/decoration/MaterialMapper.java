package me.nithans.decoration.dal.mapper.decoration;

import java.util.List;
import me.nithans.decoration.dal.domain.decoration.Material;
import me.nithans.decoration.dal.domain.decoration.MaterialCriteria;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MaterialMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_material
     *
     * @mbg.generated Wed Feb 06 23:50:03 CST 2019
     */
    long countByExample(MaterialCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_material
     *
     * @mbg.generated Wed Feb 06 23:50:03 CST 2019
     */
    int deleteByExample(MaterialCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_material
     *
     * @mbg.generated Wed Feb 06 23:50:03 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_material
     *
     * @mbg.generated Wed Feb 06 23:50:03 CST 2019
     */
    int insert(Material record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_material
     *
     * @mbg.generated Wed Feb 06 23:50:03 CST 2019
     */
    int insertSelective(Material record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_material
     *
     * @mbg.generated Wed Feb 06 23:50:03 CST 2019
     */
    List<Material> selectByExampleWithRowbounds(MaterialCriteria example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_material
     *
     * @mbg.generated Wed Feb 06 23:50:03 CST 2019
     */
    List<Material> selectByExample(MaterialCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_material
     *
     * @mbg.generated Wed Feb 06 23:50:03 CST 2019
     */
    Material selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_material
     *
     * @mbg.generated Wed Feb 06 23:50:03 CST 2019
     */
    int updateByExampleSelective(@Param("record") Material record, @Param("example") MaterialCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_material
     *
     * @mbg.generated Wed Feb 06 23:50:03 CST 2019
     */
    int updateByExample(@Param("record") Material record, @Param("example") MaterialCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_material
     *
     * @mbg.generated Wed Feb 06 23:50:03 CST 2019
     */
    int updateByPrimaryKeySelective(Material record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_material
     *
     * @mbg.generated Wed Feb 06 23:50:03 CST 2019
     */
    int updateByPrimaryKey(Material record);
}