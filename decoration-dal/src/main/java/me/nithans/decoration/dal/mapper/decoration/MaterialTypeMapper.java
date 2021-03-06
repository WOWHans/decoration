package me.nithans.decoration.dal.mapper.decoration;

import java.util.List;
import me.nithans.decoration.dal.domain.decoration.MaterialType;
import me.nithans.decoration.dal.domain.decoration.MaterialTypeCriteria;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MaterialTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_material_type
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    long countByExample(MaterialTypeCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_material_type
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    int deleteByExample(MaterialTypeCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_material_type
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_material_type
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    int insert(MaterialType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_material_type
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    int insertSelective(MaterialType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_material_type
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    List<MaterialType> selectByExampleWithRowbounds(MaterialTypeCriteria example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_material_type
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    List<MaterialType> selectByExample(MaterialTypeCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_material_type
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    MaterialType selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_material_type
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    int updateByExampleSelective(@Param("record") MaterialType record, @Param("example") MaterialTypeCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_material_type
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    int updateByExample(@Param("record") MaterialType record, @Param("example") MaterialTypeCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_material_type
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    int updateByPrimaryKeySelective(MaterialType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decoration_material_type
     *
     * @mbg.generated Wed Feb 06 00:22:15 CST 2019
     */
    int updateByPrimaryKey(MaterialType record);
}