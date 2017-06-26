package cn.mazekkkk.product.dao.mapper;

import cn.mazekkkk.product.dao.common.SUser;
import cn.mazekkkk.product.dao.common.SUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user
     *
     * @mbggenerated Tue Jun 21 16:33:50 CST 2016
     */
    int countByExample(SUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user
     *
     * @mbggenerated Tue Jun 21 16:33:50 CST 2016
     */
    int deleteByExample(SUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user
     *
     * @mbggenerated Tue Jun 21 16:33:50 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user
     *
     * @mbggenerated Tue Jun 21 16:33:50 CST 2016
     */
    int insert(SUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user
     *
     * @mbggenerated Tue Jun 21 16:33:50 CST 2016
     */
    int insertSelective(SUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user
     *
     * @mbggenerated Tue Jun 21 16:33:50 CST 2016
     */
    List<SUser> selectByExample(SUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user
     *
     * @mbggenerated Tue Jun 21 16:33:50 CST 2016
     */
    SUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user
     *
     * @mbggenerated Tue Jun 21 16:33:50 CST 2016
     */
    int updateByExampleSelective(@Param("record") SUser record, @Param("example") SUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user
     *
     * @mbggenerated Tue Jun 21 16:33:50 CST 2016
     */
    int updateByExample(@Param("record") SUser record, @Param("example") SUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user
     *
     * @mbggenerated Tue Jun 21 16:33:50 CST 2016
     */
    int updateByPrimaryKeySelective(SUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_user
     *
     * @mbggenerated Tue Jun 21 16:33:50 CST 2016
     */
    int updateByPrimaryKey(SUser record);
}