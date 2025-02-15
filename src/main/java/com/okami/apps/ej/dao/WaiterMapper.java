package com.okami.apps.ej.dao;

import com.okami.apps.ej.bean.Waiter;
import com.okami.apps.ej.bean.WaiterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WaiterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_waiter
     *
     * @mbg.generated Mon Jun 10 11:24:36 CST 2019
     */
    long countByExample(WaiterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_waiter
     *
     * @mbg.generated Mon Jun 10 11:24:36 CST 2019
     */
    int deleteByExample(WaiterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_waiter
     *
     * @mbg.generated Mon Jun 10 11:24:36 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_waiter
     *
     * @mbg.generated Mon Jun 10 11:24:36 CST 2019
     */
    int insert(Waiter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_waiter
     *
     * @mbg.generated Mon Jun 10 11:24:36 CST 2019
     */
    int insertSelective(Waiter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_waiter
     *
     * @mbg.generated Mon Jun 10 11:24:36 CST 2019
     */
    List<Waiter> selectByExample(WaiterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_waiter
     *
     * @mbg.generated Mon Jun 10 11:24:36 CST 2019
     */
    Waiter selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_waiter
     *
     * @mbg.generated Mon Jun 10 11:24:36 CST 2019
     */
    int updateByExampleSelective(@Param("record") Waiter record, @Param("example") WaiterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_waiter
     *
     * @mbg.generated Mon Jun 10 11:24:36 CST 2019
     */
    int updateByExample(@Param("record") Waiter record, @Param("example") WaiterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_waiter
     *
     * @mbg.generated Mon Jun 10 11:24:36 CST 2019
     */
    int updateByPrimaryKeySelective(Waiter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ej_waiter
     *
     * @mbg.generated Mon Jun 10 11:24:36 CST 2019
     */
    int updateByPrimaryKey(Waiter record);
}