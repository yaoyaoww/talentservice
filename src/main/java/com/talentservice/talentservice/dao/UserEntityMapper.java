package com.talentservice.talentservice.dao;

import com.talentservice.talentservice.entity.UserEntity;

public interface UserEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbg.generated
     */
    int insert(UserEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbg.generated
     */
    int insertSelective(UserEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbg.generated
     */
    UserEntity selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(UserEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(UserEntity record);
}